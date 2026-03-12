package com.gal.algo;

import org.springframework.stereotype.Component;
//asking IOC container(ApplicationContext: AnnotationConfigApplicationContext
//create an object for this class
@Component
public class PasswordHasher {
public String hash(String password) {
	return new StringBuilder(password).reverse().toString();
}
public PasswordHasher() {
	System.out.println("password hashed");
}
}
