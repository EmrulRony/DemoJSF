package com.abc.services;

import java.util.Random;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class MySessionBean implements Serializable {
	
	private int random= new Random().nextInt();
	
	public  MySessionBean() {
		System.out.println("MySession bean constructed!!");
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}
	
}
