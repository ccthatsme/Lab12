package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String make = "";
		String model = "";
		int year = 1991;
		double price = 0.0;
		int carNum;

		int choice = 0;
		boolean check = true;
		Car c = new Car(make, model, year, price);
		ArrayList<Car> carList = new ArrayList<>();
		carList.add(new Car("Ford", "Focus", 2012, 5000.50));
		carList.add(new Car("Chevy", "impala", 2012, 9800));
		carList.add(new Car("Jeep", "Cherokee", 2019, 20000));
		carList.add(new UsedCar("Ferrari", "Enzo", 2002, 120000, 1));
		carList.add(new UsedCar("Mercedes", "Benz", 1999, 200000, 12000));
		carList.add(new UsedCar("Lambo", "Diablo", 2018, 500000, 35000));



		while (check) {
			int i = 1;

			for (Car x : carList) {

				System.out.println((i++) + ". " + x);

			}
			System.out.println("");
			System.out.println("Which car would you like? Press 7 to Quit");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				System.out.println(carList.get(choice - 1));
				if (yesOrNo(scan, "Would you like to buy this car? y/n")) {
					carList.remove(choice - 1);
					System.out.println("Exellent! our finance department will be in touch shortly!");
					check = true;
					break;
				} else {
					check = true;
					break;
				}
			case 2:
				System.out.println(carList.get(choice - 1));
				if (yesOrNo(scan, "Would you like to buy this car? y/n")) {
					carList.remove(choice - 1);
					System.out.println("Exellent! our finance department will be in touch shortly!");
					check = true;
					break;
				} else {
					check = true;
					break;
				}
			case 3:
				System.out.println(carList.get(choice - 1));
				if (yesOrNo(scan, "Would you like to buy this car? y/n")) {
					carList.remove(choice - 1);
					System.out.println("Exellent! our finance department will be in touch shortly!");
					check = true;
					break;
				} else {
					check = true;
					break;
				}

			case 4:
				System.out.println(carList.get(choice - 1));
				if (yesOrNo(scan, "Would you like to buy this car? y/n")) {
					carList.remove(choice - 1);
					System.out.println("Exellent! our finance department will be in touch shortly!");
					check = true;
					break;
				} else {
					check = true;
					break;
				}
			case 5:
				System.out.println(carList.get(choice - 1));
				if (yesOrNo(scan, "Would you like to buy this car? y/n")) {
					carList.remove(choice - 1);
					System.out.println("Exellent! our finance department will be in touch shortly!");
					check = true;
					break;
				} else {
					check = true;
					break;
				}
			case 6:
				System.out.println(carList.get(choice - 1));
				if (yesOrNo(scan, "Would you like to buy this car? y/n")) {
					carList.remove(choice - 1);
					System.out.println("Exellent! our finance department will be in touch shortly!");
					check = true;
					break;
				} else {
					check = true;
					break;
				}
			case 7:
				check = false;
				break;

			default:
				System.out.println("Try again");
				check = true;
				break;
			}

		}
		System.out.println("Have a great day");

//		System.out.println("welcome to the car shop, how many cars are you entering?");
//		carNum = scan.nextInt();
//
////		for (int i = 1; i <= carNum; i++) {
////			System.out.println("Enter car #" + (i) + " Make");
////			make = scan.next();
////			System.out.println("Enter car #" + (i) + " Model");
////			model = scan.next();
////			System.out.println("Enter car #" + (i) + " Year");
////			year = scan.nextInt();
////			System.out.println("Enter car #" + (i) + " Price");
////			price = scan.nextDouble();
////			carList.add(new Car(make, model, year, price));
////
////		}
//		System.out.println("");
//		System.out.println("Current Inventory");
//		for (Car d : carList) {
//			System.out.println(d);
//		}

	}

	public static boolean yesOrNo(Scanner scan, String prompt) {
		boolean isValid = false;
		boolean isValid2 = true;
		String s = "";
		while (isValid == false) {
			System.out.print(prompt);
			s = scan.next(); // read user entry, if you type a sentence, it will return only the first word
			if (s.equalsIgnoreCase("n")) {
				s = "n";
				isValid = true;
				isValid2 = false;
			} else if (s.equalsIgnoreCase("y")) {
				s = "y";
				isValid = true;
				isValid2 = true;
			} else {
				System.out.println("please try again type (y/n)");
				isValid = false;
			}
			// sc.nextLine(); // discard any other data entered on the line
		}
		return isValid2;
	}

}
