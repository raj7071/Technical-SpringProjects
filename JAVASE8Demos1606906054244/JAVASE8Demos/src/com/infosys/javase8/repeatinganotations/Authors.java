package com.infosys.javase8.repeatinganotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Authors {
	Author[] value();
}