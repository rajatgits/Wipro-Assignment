package com.wipro.eccommerce;

public class RegularCustomer extends Customer{
	public RegularCustomer(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        if (purchaseAmount > 10000) {
            return purchaseAmount * 0.05; 
        } else {
            return 0.0;
        }
    }
}
