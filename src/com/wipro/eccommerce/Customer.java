package com.wipro.eccommerce;

public class Customer {
    String name;
    double purchaseAmount;

    public Customer(String name, double purchaseAmount) {
        this.name = name;
        this.purchaseAmount = purchaseAmount;
    }

    public double calculateDiscount() {
        return 0.0;
    }
}
