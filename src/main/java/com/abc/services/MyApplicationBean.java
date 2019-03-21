package com.abc.services;

import java.util.Random;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@ApplicationScoped
public class MyApplicationBean {
	private int random = new Random().nextInt();
	
	public MyApplicationBean() {
		System.out.println("MyApplicationBean constructed!!");
	}

	public int getRandom() {
		return random;
	}

	public void setRandom(int random) {
		this.random = random;
	}

}
