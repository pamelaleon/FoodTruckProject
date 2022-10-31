package com.skilldistillery.foodtruck.entities;

public class FoodTruck {
  
	private static int nextTruckId = 0;
	private String foodTruckName;    
    private String foodType;
    private int foodRating;
    
    public FoodTruck() {
    	nextTruckId += 1;
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
	public int getFoodRating() {
		return foodRating;
	}
	public void setFoodRating(int foodRating) {
		this.foodRating = foodRating;
	}
    
	public String toString() {
		return "FoodTruck [foodTruckName = " + foodTruckName + ", foodType = " + foodType + ", foodRating = " + foodRating
				+ "]";
	}
    
    
  
}
