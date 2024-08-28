package com.xworkz.inheritancee;
import com.xworkz.inheritance.store.Chicken;
import com.xworkz.inheritance.store.Hen;

public class HenRunner {

	public static void main(String[] args) {
		Hen hen=new Hen();
		hen.type="giriraja";
		hen.weight=2.5;
		hen.price=200;
		hen.gender='f';
		hen.egg=true;
		hen.itemName="chicken sambar";
		hen.itemPrice=250;
		hen.itemQuantity=1;
		hen.farmName="nandhini chicken farm";
		hen.farmProfit=200000;
		
		hen.boil();
		hen.chickenDetails();
		hen.farmDetails();
		hen.item();
		hen.meat();
		System.out.println();
		
		Chicken chicken=new Hen();
		chicken.type="boiler";
		chicken.weight=1.5;
		chicken.price=150;
		chicken.gender='f';
		chicken.egg=true;
		chicken.itemName="chicken biryani";
		chicken.itemPrice=350;
		chicken.itemQuantity=2;
		chicken.farmName="chandhu chicken farm";
		chicken.farmProfit=250000;
		
		chicken.boil();
		chicken.chickenDetails();
		chicken.farmDetails();
		chicken.item();
		chicken.meat();
	}

	}

