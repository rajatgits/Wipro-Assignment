package com.wipro.eccommerce;

public class Discount {
	public static double total(Customer customer) {
        double discount = customer.calculateDiscount();
        double totalCost = customer.purchaseAmount - discount;
        return totalCost;
    }

    public static void main(String[] args) {
        RegularCustomer regularCustomer = new RegularCustomer("A", 100000);
        PremiumCustomer premiumCustomer = new PremiumCustomer("Rajat Raj", 2000000);
        Employee employee = new Employee("B", 500000);

        System.out.println("Regular Customer Total : " + total(regularCustomer));
        System.out.println("Premium Customer Total : " + total(premiumCustomer));
        System.out.println("Employee Total : " + total(employee));
    }
}
