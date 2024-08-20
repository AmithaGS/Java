package com.xworkz.custom_dataType;

public class Ball {
	private String name;
	private String color;
	private int size;
	private double price;
	private String type;
	private double weight;
	private String modeOfBall;
	private double height;

	private double radius = 10.0;
	private String shape = "sperical";
	private String ownerName = "Amitha";
	private int manufactureDate = 19;
	private String manufactureMonth = "August";
	private int manufactureYear = 1090;
	private String manufactureLocation = "Bangalore";
	private String manufactureCountry = "India";
	private String manufactureState = "Karnataka";
	private String manufactureWorld = "Asia";
	private boolean isCricketBall = true;
	private boolean isthreadWorkedBall = false;
	private String category = "sports";
	private int bounce_height = 10;
	private boolean isbouncingBall = true;
	private String ordered_date = "23 september";
	private String delivery_date = "01 october";

	public Ball(String name, String color, int size, double price, String type, double weight, String modeOfBall,
			Double height) {
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
		this.type = type;
		this.weight = weight;
		this.modeOfBall = modeOfBall;
		this.height = height;
	}

	public void printBallDetails() {
		System.out.println("ball name is :" + this.name);
		System.out.println("ball color is :" + this.color);
		System.out.println("ball size is :" + this.size);
		System.out.println("ball price is :" + this.price);
		System.out.println("ball type is :" + this.type);
		System.out.println("ball weight is :" + this.weight);
		System.out.println("modeOfBall is :" + this.modeOfBall);
		System.out.println("ball height is :" + this.height);

		System.out.println("ball radius is :" + radius);
		System.out.println("ball shape is :" + shape);
		System.out.println("ball ownerName is :" + ownerName);
		System.out.println("ball manufactureDate is :" + manufactureDate);
		System.out.println("ball manufactureMonth is :" + manufactureMonth);
		System.out.println("ball manufactureYear is :" + manufactureYear);
		System.out.println("ball radmanufactureLocation is :" + manufactureLocation);
		System.out.println("ball manufactureCountry is :" + manufactureCountry);
		System.out.println("ball manufactureState is :" + manufactureState);
		System.out.println("ball manufactureWorld is :" + manufactureWorld);
		System.out.println("ball isCricketBall :" + isCricketBall);
		System.out.println("ball isthreadWorkedBall :" + isthreadWorkedBall);
		System.out.println("ball category is :" + category);
		System.out.println("ball bounce_height is :" + bounce_height);
		System.out.println("ball isbouncingBall :" + isbouncingBall);
		System.out.println("ball ordered_date is :" + ordered_date);
		System.out.println("ball delivery_date is :" + delivery_date);

	}
}
