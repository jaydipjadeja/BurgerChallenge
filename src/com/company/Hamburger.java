package com.company;

public class Hamburger {

    private String burgerName;
    private String rollType;
    private double price;
    private String meat;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;


    public Hamburger(String burgerName, String rollType, double price, String meat) {
        this.burgerName = burgerName;
        this.rollType = rollType;
        this.price = price;
        this.meat = meat;

    }

    public void addition1(String name, double price){
            this.addition1Name = name;
            this.addition1Price = price;

    }

    public void addition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;

    }

    public void addition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;

    }

    public double itemHamburger(){
        double hamburgerPrice= this.price;
        System.out.println(this.burgerName + " has " + this.rollType + " roll  price of "+this.price);
        if (this.addition1Name != null) {

            hamburgerPrice += this.addition1Price;
            System.out.println("Added "+this.addition1Name+" for an extra "+this.addition1Price);
        }

        if (this.addition2Name != null) {

            hamburgerPrice += this.addition2Price;
            System.out.println("Added "+this.addition2Name+" for an extra "+this.addition2Price);
        }
        if (this.addition3Name != null) {

            hamburgerPrice += this.addition3Price;
            System.out.println("Added "+this.addition3Name+" for an extra "+this.addition3Price);
        }

        return hamburgerPrice;

    }


}
