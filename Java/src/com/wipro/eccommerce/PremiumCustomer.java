package com.wipro.eccommerce;

public class PremiumCustomer extends Customer{
    public PremiumCustomer(String name, double purchaseAmount) {
        super(name, purchaseAmount);
    }

    @Override
    public double calculateDiscount() {
        return purchaseAmount * 0.20;
    }
}
