package com.infosys.javase8.repeatinganotations;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(value = Authors.class)
@Retention(RetentionPolicy.RUNTIME)
public @interface Author {
	String name();

	String method();
}
