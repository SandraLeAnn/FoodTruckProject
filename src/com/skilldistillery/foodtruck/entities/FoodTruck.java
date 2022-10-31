package com.skilldistillery.foodtruck.entities;

import java.util.Objects;

public class FoodTruck {

	private static int nextTruckId = 1;
	private String foodTruckName;
	private String foodType;
	private double rating;
	private int truckId;

	public FoodTruck() {
		super();

	}

	public FoodTruck(String foodTruckName, String foodType, double rating) {
		super();
		this.foodTruckName = foodTruckName;
		this.foodType = foodType;
		this.rating = rating;
		this.truckId = nextTruckId;
		nextTruckId++;
	
	
	}

	public static int getNextTruckId() {
		return nextTruckId;
	}

	public static void setNextTruckId(int nextTruckId) {
		FoodTruck.nextTruckId = nextTruckId;
	}

	public String getFoodTruckName() {
		return foodTruckName;
	}

	public void setFoodTruckName(String foodTruckName) {
		this.foodTruckName = foodTruckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getTruckId() {
		return truckId;
	}

	public void setTruckId(int truckId) {
		this.truckId = truckId;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;

	}

	@Override
	public String toString() {
		return "Food Truck Name: " + foodTruckName + ", Type: " + foodType + ", Truck ID: " + truckId
				+ ", Rating: " + rating;
	}

	@Override
	public int hashCode() {
		return Objects.hash(foodTruckName, foodType, rating, truckId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodTruck other = (FoodTruck) obj;
		return Objects.equals(foodTruckName, other.foodTruckName) && Objects.equals(foodType, other.foodType)
				&& rating == other.rating && truckId == other.truckId;
	}

}
