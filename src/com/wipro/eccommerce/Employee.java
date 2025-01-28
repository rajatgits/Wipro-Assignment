package com.wipro.eccommerce;

public class Employee extends Customer {
    public Employee(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        return purchaseAmount * 0.60;
    }
	
}
