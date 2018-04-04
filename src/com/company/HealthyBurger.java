package com.company;

public class HealthyBurger extends Hamburger {

    private String addition4Name;
    private double addition4Price;

    private String addition5Name;
    private double addition5Price;



    public HealthyBurger(double price, String meat) {
        super("Healthyburger", "brown rye", price, meat);

    }

    public void addition4(String name, double price){

        this.addition4Name= name;
        this.addition4Price = price;
    }

    public void addition5(String name, double price){

        this.addition5Name= name;
        this.addition5Price = price;
    }

    @Override
    public double itemHamburger() {

        double healthyburgerPrice = super.itemHamburger();


        if (this.addition4Name != null) {

            healthyburgerPrice += this.addition4Price;
            System.out.println("Added "+this.addition4Name+" for an extra "+this.addition4Price);
        }

        if (this.addition5Name != null) {

            healthyburgerPrice += this.addition5Price;
            System.out.println("Added "+this.addition5Name+" for an extra "+this.addition5Price);
        }
        return healthyburgerPrice;
    }
}
