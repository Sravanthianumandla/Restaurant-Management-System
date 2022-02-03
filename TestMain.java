package com.restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Food> foodlist = new ArrayList<>();
		ManageFood managefood = new ManageFood();
		/*
		  managefood.sc(); managefood.print();
		  managefood.price(); managefood.PrintOrder();
		 */
		int select;
		Scanner sc = new Scanner(System.in);
		do {
			Menumain();
			select = Integer.parseInt(sc.nextLine());
			switch (select) {
			case 1:
				do {
					MenuManageFood();
					select = Integer.parseInt(sc.nextLine());
					switch (select) {
					case 1:
						managefood.sc();
						break;
					case 2:
						managefood.print();
						managefood.EditFood();
						break;
					case 3:
						managefood.print();
						managefood.DeleteFood();
						break;
					case 4:
						managefood.PrintOrder();
						break;
					case 5:
						managefood.search();
						break;
					case 0:
						System.out.println("Back");
						break;
					default:
						break;
					}
				} while (select != 0);
				break;
			case 2:
				do {
					Menuorder();
					select = Integer.parseInt(sc.nextLine());
					switch (select) {

					case 1:
						managefood.print();
						managefood.price();
						break;

					case 0:
						System.out.println("Back");
						break;
					default:
						break;
					}
				} while (select != 0);
				break;
			default:
				break;
			}
		} while (select != 3);

	}

	static void MenuManageFood() {
		System.out.println("................MENU MANAGEFOOD............");
		System.out.println("0.Back to manu main");
		System.out.println("1.AddFood");
		System.out.println("2.EditFood");
		System.out.println("3.DeleteFood");
		System.out.println("4.Print info table order");
		System.out.println("5.payment");
		System.out.println(".....................................");
		System.out.println("Select");

	}

	static void Menuorder() {
		System.out.println("................MENU ORDER............");
		System.out.println("0.Back to manu main");
		System.out.println("1.Print Menu food and order");
		System.out.println(".....................................");
		System.out.println("Select");

	}

	static void Menumain() {
		System.out.println(
				"............................WELCOME TO RESTAURANT MANAGEMENT SYSTEM............................");
		System.out.println("................MENU MAIN............");
		System.out.println("1. Manage Food");
		System.out.println("2.Manage order");
		System.out.println("3.Exit");
	}
}
