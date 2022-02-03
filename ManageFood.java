package com.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageFood {
	private static final String Deletefood = null;
	ArrayList<Food> foodlist = new ArrayList<>();
	ArrayList<GuestsOrder> guestsorder = new ArrayList<>();
	Food Food;
	public GuestsOrder GuestsOrder;
	public int SelectFood;

	public ManageFood() {

	}

	Scanner sc = new Scanner(System.in);

	public void sc() {
		System.out.println("Enter number food add in menu");
		int n = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < n; i++) {
			Food food = new Food();
			food.input();
			foodlist.add(food);

		}
	}

	public void print() {
		for (int i = 0; i < foodlist.size(); i++) {
			System.out.println((i + 1) + "," + foodlist.get(i).detail());
		}
	}

	public void price() {
		float PriceFood = 0;
		float Totalpayment = 0;
		int number;
		GuestsOrder guests = new GuestsOrder();
		guests.input();
		guestsorder.add(guests);
		for (int i = 0; i < 10; i++) {
			System.out.println("Select food" + (i + 1));
			SelectFood = sc.nextInt();
			if (SelectFood == 0) {
				guests.setTotalpayment(Totalpayment);
				System.out.println("Total Payment");
				System.out.println(Totalpayment);
				System.out.println("Thanku see you again");
				break;
			} else {
				System.out.println("Enter number");
				number = sc.nextInt();
				Food food = foodlist.get(SelectFood - 1);
				guests.setEatList(food);
				PriceFood = food.price * number;
			}
			Totalpayment += PriceFood;
			System.out.println("Order Finish");
			System.out.println("payment " + (i + 1) + " is:");
			System.out.println("" + PriceFood);
			System.out.println("Finish Order enter 0");
		}

	}

	public void PrintOrder() {
		// TODO Auto-generated method stub
		for (int i = 0; i < guestsorder.size(); i++) {
			guestsorder.get(i).print();

		}
	}

	public void search() {
		Scanner sc = new Scanner(System.in);
		String idtable;
		int up = 0;
		System.out.println("Enter table number payment:");
		idtable = sc.nextLine();
		for (int i = 0; i < guestsorder.size(); i++) {
			if (guestsorder.get(i).getIdTable().equalsIgnoreCase(idtable)) {
				guestsorder.get(i).print();
				up++;
			}
		}
		if (up == 0) {
			System.out.println("No table number" + idtable);
		}
	}

	public String EditName() {
		System.out.println("Enter name Edit: ");
		return sc.nextLine();
	}

	public float EditPrice() {
		System.out.println("Enter price Edit");
		return sc.nextFloat();
	}

	public void EditFood() {
		String namefood;
		int up = 0;
		System.out.println("Enter name food to fix");
		namefood = sc.nextLine();
		for (int i = 0; i < foodlist.size(); i++) {
			if (foodlist.get(i).getName().equals(namefood)) {
				up++;
				foodlist.get(i).setName(EditName());
				foodlist.get(i).setPrice(EditPrice());
				System.out.println("editi successfully");
				break;
			}
		}
		if (up == 0) {
			System.out.println("no food name is" + namefood);

		}
	}

	public void DeleteFood() {
		String deleteFood;
		int up = 0;
		System.out.println("Enter name  food to delete ");
		deleteFood = sc.nextLine();
		deleteFood = sc.nextLine();

		for (int i = 0; i < foodlist.size(); i++) {
			if (foodlist.get(i).getName().equals(deleteFood)) {
				up++;
				foodlist.remove(i);
				System.out.println("Delete successfully");
				break;
			}
		}
		if (up == 0) {
			System.out.println(" food name is" + deleteFood);
		}
	}
}
