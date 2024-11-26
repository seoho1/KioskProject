package com.example.kiosk;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private final List<MenuItem> menuItems = new ArrayList<>();
    private final String category;

    public Menu(String category){
        this.category = category;
    }
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
    }

    public String getCategory() {
        return category;
    }

    public void showMenuItem() {
        for (int i = 0; i < menuItems.size() ; i++) {
            System.out.println((1 + i) + ". " + menuItems.get(i));
        }
    }

    public int menuItemSize() {
        return  menuItems.size();
    }

    public MenuItem getMenuItem(int index) {
        return menuItems.get(index);
    }

    @Override
    public String toString() {
        return String.format(": %s, : %d", category, menuItems);
    }
}



