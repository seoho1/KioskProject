package com.example.kiosk;

public class MenuItem {
    private final String foodName;
    private final double price;
    private final String description;

    public MenuItem(String burgerName, double price, String description) {
        this.foodName = burgerName;
        this.price = price;
        this.description = description;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return  String.format("%-15s | W %.1f | %s", foodName , price, description) ;
    }


}
