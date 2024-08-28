package com.xworkz.inheritancee;
import com.xworkz.inheritance.store.SmartPhone;
import com.xworkz.inheritance.store.Tab;
public class SmartPhoneRunner {

	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone(); 
		smartPhone.name="Redmi note 10 pro";
		smartPhone.price=10000.0;
		smartPhone.gb=128;
		smartPhone.isTouchScreen=true;
		smartPhone.name();
		smartPhone.SmartPhonePrice();
		System.out.println();
		Tab tab = new Tab();
		tab.name="Samsaung";
		tab.price=130000;
		tab.gb=100;
		tab.isTouchScreen=true;
		tab.name();
		tab.SmartPhonePrice();
}

}
