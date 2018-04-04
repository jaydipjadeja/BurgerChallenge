package com.company;

public class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "White", 10.50, "Sausage");
        super.addition1("Chips",2.50);
        super.addition2("Drink",2.00);
    }

    @Override
    public void addition1(String name, double price) {
        System.out.println("Cannot add additonal item to Deluxe burger");
    }

    @Override
    public void addition2(String name, double price) {
        System.out.println("Cannot add additonal item to Deluxe burger");
    }

    @Override
    public void addition3(String name, double price) {
        System.out.println("Cannot add additonal item to Deluxe burger");
    }
}
