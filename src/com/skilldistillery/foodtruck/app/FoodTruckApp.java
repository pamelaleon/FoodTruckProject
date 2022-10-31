package com.skilldistillery.foodtruck.app;

import java.util.Scanner;
import com.skilldistillery.foodtruck.entities.*;

// the only main in this project
public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		FoodTruckApp app = new FoodTruckApp();

		FoodTruck foodTrucks[] = new FoodTruck[5];

		for (int i = 0; i < 5; i++) {

			System.out.println("Please enter food truck name! ");
			String name = sc.next();

			if (name.equals("quit")) {
				break;
			}

			System.out.println("Please enter food type!");
			String foodType = sc.next();

			System.out
					.println("PLease enter the rating for the food truck, 1 being the lowest and 5 being the highest!");
			int rating = sc.nextInt();

			FoodTruck foodTruck = new FoodTruck();
			foodTruck.setFoodTruckName(name);
			foodTruck.setFoodType(foodType);
			foodTruck.setFoodRating(rating);
			foodTrucks[i] = foodTruck;
		}

		boolean userQuits = false;

		while (userQuits != true) {
		//	System.out.println();
			System.out.println("-------------------MENU-------------------");
			System.out.println("1. List all existing food trucks.");
			System.out.println("2. See the average rating of food trucks.");
			System.out.println("3. Display the highest-rated food truck.");
			System.out.println("4. Quit the program.");
			System.out.println("-------------------------------------------");
			int userChoice = sc.nextInt();
			
			switch(userChoice) {
				case 1:
					app.listFoodTrucks(foodTrucks);
					break;
				case 2:
					double average = app.getAverageRating(foodTrucks);
					System.out.println("The average rating is: " + average);
					break;
				case 3:
					FoodTruck highestRated = app.getHighestRated(foodTrucks);
					System.out.println("The highest rated truck is: " + highestRated.toString());
					break;
				case 4:
					System.out.println("Goodbye");
					userQuits = true;
					break;
				default:
					System.out.println("That's an invalid input.");
					break;
			}
		}

		sc.close();
	}
	
	public void listFoodTrucks(FoodTruck[] foodTrucks) {
		for (FoodTruck truck : foodTrucks) {
			if (truck != null) {
				System.out.println(truck.toString());
			}
		}
	}
	
	public double getAverageRating(FoodTruck[] foodTrucks) {
		double average = 0.0;
		int count = 0;
		for (FoodTruck truck : foodTrucks) {
			if (truck != null) {
				int rating = truck.getFoodRating();
				average = average + rating;
				count++;
			}
		}
		average = average / count;
		return average;
	}
	
	public FoodTruck getHighestRated(FoodTruck[] foodTrucks) {
		FoodTruck highestRated = foodTrucks[0];
		for (FoodTruck truck : foodTrucks) {
			if (truck != null) {
				int rating = truck.getFoodRating();
				if (rating > highestRated.getFoodRating()) {
					highestRated = truck;
				}
			}
		}
		return highestRated;
	}

}
