import { Component, OnInit } from '@angular/core';
import { CartService } from '../services/cart.service';
import { UserService } from '../../profile/services/user.service';
import { OrdersService } from '../../orders/orders.service';
import { Router } from '@angular/router';
import { MessagesComponent } from 'src/app/core/messages/messages.component';
import { MatDialogConfig, MatDialog } from '@angular/material';
import { CookieService } from 'ngx-cookie-service';

@Component({
  selector: 'app-shopping-cart',
  templateUrl: './shopping-cart.component.html',
  styleUrls: [ './shopping-cart.component.scss' ]
})
export class ShoppingCartComponent implements OnInit {

  public cartItems: any;
  public price: number;
  public deliverCharge: number;
  public activeUser: string;

  constructor(private cartService: CartService,
    private userService: UserService,
    private ordersService: OrdersService,
    private router: Router,
    private dialog: MatDialog,
    private cookieService: CookieService,
  ) {
    this.activeUser = this.userService.getActiveUser();
    this.cartItems = [];
    this.cartService.cartItems(this.activeUser).then(response => {
      response.forEach(element => {
        if (element.details.length > 0) {
          element.details[ 0 ].qty = element.qty;
          this.cartItems.push(element.details[ 0 ]);
        }
      });
      this.calcPriceDetails();
    })
  }

  ngOnInit() {
  }

  placeOrder() {
    this.ordersService.setOrderParams(this.cartItems, "orderItems");
    if (this.cookieService.get('activeUser')) {
      this.router.navigate([ '/checkout' ]);
    } else {
      const dialogConfig = new MatDialogConfig();
      dialogConfig.data = 'Please login to  place order.';
      let dialogRef = this.dialog.open(MessagesComponent, dialogConfig);
      dialogRef.afterClosed().subscribe(
        data => {
          this.router.navigate([ './user/login' ]);
        }
      );
    }
  }

  calcPriceDetails() {
    this.price = 0;
    this.deliverCharge = 0;
    this.cartItems.forEach(element => {
      let rate = (element.rate - (element.rate * (element.discount / 100)));
      this.price += Number(rate) * Number(element.qty);
      this.deliverCharge += (element.qty == 0) ? 0 : Number(element.deliveryCharge);
    });
  }

  updateCart(item) {
    const params = {
      username: this.activeUser,
      productId: item.pid,
      qty: Number(item.qty)
    };
    this.cartService.update(params).then(response => {
      this.calcPriceDetails();
    });
  }

  removeFromCart(id, index) {
    const params = {
      username: this.activeUser,
      pid: id
    };
    this.cartService.delete(params).then(response => {
      this.cartItems.splice(index, 1);
    });
  }
}
