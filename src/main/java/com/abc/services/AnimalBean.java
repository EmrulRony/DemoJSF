package com.abc.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


@Named
@RequestScoped
public class AnimalBean {
	
	public AnimalBean() {
		System.out.println("AnimalBean constructed!!");
	}

	private String animalType;
	private int animalTotalNum;

	private List<String> animalList;
	private Map <Integer,String> animalMap;
	
	@Inject
	private MySessionBean sessionBean;
	
	@Inject
	private MyApplicationBean appBean;
	
	private int random = new Random().nextInt();
	
	public MyApplicationBean getAppBean() {
		return appBean;
	}


	public void setSessionBean(MySessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}

	@PostConstruct
	void init(){
		animalList = new ArrayList<String>();
		animalList.add("Dog");
		animalList.add("Cat");
		animalList.add("Horse");
		
		animalMap = new HashMap<Integer,String>();
		animalMap.put(1, "Cocodile");
		animalMap.put(2, "Snake");
		animalMap.put(3, "Rynho");
		
		
	}
	
	private Person person = new Person (1,"emrul");

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getAnimalType() {
		return animalType;
	}

	public void setAnimalType(String animalType) {
		this.animalType = animalType;
	}

	public int getAnimalTotalNum() {
		return animalTotalNum;
	}

	public void setAnimalTotalNum(int animalTotalNum) {
		this.animalTotalNum = animalTotalNum;
	}

	public void test() {
		System.out.println(animalType + " " + animalTotalNum);
	}

	public List<String> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<String> animalList) {
		this.animalList = animalList;
	}
	
	public Map<Integer, String> getAnimalMap() {
		return animalMap;
	}

	public void setAnimalMap(Map<Integer, String> animalMap) {
		this.animalMap = animalMap;
	}
	
	public void setAppBean(MyApplicationBean appBean) {
		this.appBean = appBean;
	}

	public MySessionBean getSessionBean() {
		return sessionBean;
	}


	public int getRandom() {
		return random;
	}


	public void setRandom(int random) {
		this.random = random;
	}
	

}
