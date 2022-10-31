package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

import com.skilldistillery.foodtruck.entities.FoodTruck;

public class FoodTruckApp {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		Menu switchMenu = new Menu();
		FoodTruck foodTruckArray[] = new FoodTruck[5];

		Scanner sc = new Scanner(System.in);

		String foodTruckName;
		String foodType;
		double rating;

		for (int i = 0; i < foodTruckArray.length; i++) {

			System.out.println(
					"Welcome to the food truck rating app. Please enter the food truck name you wish to rate or write quit to exit and proceed to the menu.");
			foodTruckName = sc.next();

			if (foodTruckName.equalsIgnoreCase("quit")) {
				break;
			}

			System.out.println("Please enter food type. ");
			foodType = sc.next();
			sc.nextLine();

			boolean ratingInput = true;
			while (ratingInput) {

				System.out.println("Please enter your rating for the food truck on a scale of 1 through 5. ");
				rating = sc.nextDouble();

				if (rating >= 1 && rating <= 5) {

					foodTruckArray[i] = new FoodTruck(foodTruckName, foodType, rating);
					ratingInput = false;
					break;
				}

				else {
					System.out.println("Please try again. Rating must be on a scale of 1 through 5.");
				}
			}

		}

		boolean menu = true;

		while (menu) {
			switchMenu.displayMenu();

			System.out.println("Please pick an option 1 through 4?  \n");
			int menuNum = sc.nextInt();

			switch (menuNum) {

			case 1:
				for (int i = 0; i < foodTruckArray.length; i++) {
					if (foodTruckArray[i] == null) {
						break;
					}
					System.out.println(foodTruckArray[i].toString() + "\n");
				}
				break;

			case 2:
				int counter = 0;
				double sum = 0;
				for (int i = 0; i < foodTruckArray.length; i++) {
					if (foodTruckArray[i] == null) {
						break;
					}
					counter++;
					sum += foodTruckArray[i].getRating();
				}
				double averageRating = (sum / counter);
				System.out.printf("The average rating is %.2f", averageRating);
				System.out.println("\n");
				break;
			case 3:
				double highestRated = 0.0;
				for (int i = 0; i < foodTruckArray.length; i++) {
					if (foodTruckArray[i] == null) {
						break;
					} else if (foodTruckArray[i].getRating() > highestRated) {
						highestRated = foodTruckArray[i].getRating();

						System.out.println("Winner: \n" + foodTruckArray[i].toString());
						System.out.println("\n");
					}
				}
				break;
			case 4:
				System.out.println("Have a great day! \n");
				menu = false;
				break;

			default:
				System.out.println("That choice is invalid! \n");

			}

		}
		System.out.println("Please come again!");

		sc.close();
	}
}