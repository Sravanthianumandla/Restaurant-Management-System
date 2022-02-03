package com.restaurant;

import java.util.Scanner;

public class Food {
	public String Name;
	public float price;

	public Food() {
		this.Name = Name;
		this.price = price;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your food Name");
		Name = sc.nextLine();
		System.out.println("Enter Your  food Price ");
		price = sc.nextFloat();
	}

	public void Payment() {
		System.out.println("Price:" + price);
	}

	public String detail() {
		return Name + "" + price;
	}

	public float getPrice() {
		return price;
	}

	public String getName() {
		return Name;
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setPrice(Float Price) {
		this.price = price;
	}
}
