package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Base","White",3.56,"Sausage");
        hamburger.itemHamburger();
        hamburger.addition1("Tomato",0.40);
        hamburger.addition2("Lettuce",0.50);
        hamburger.addition3("Carrot",0.44);
        System.out.println("Total price of burger is "+hamburger.itemHamburger());

        HealthyBurger healthyBurger = new HealthyBurger(4.00,"Sausage");
        healthyBurger.itemHamburger();
        healthyBurger.addition1("Tomato", 0.60);
        healthyBurger.addition4("Cucumber",0.40);
        System.out.println("Total price of burger is "+healthyBurger.itemHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addition1("ksk",3.0);
        deluxeBurger.itemHamburger();



    }
}
