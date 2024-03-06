package models;

public class FoodItem {
    private String name;
    private int quantity;

    public FoodItem(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void printFoodItem() {
        System.out.println("Item Name: " + name + "  Quantity: " + quantity);
    }

    public String toString() {
        return String.format("{Name: %s, Quantity: %s kgs}", name, quantity);
    }
}

