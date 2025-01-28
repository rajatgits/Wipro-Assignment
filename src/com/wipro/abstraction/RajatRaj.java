package com.wipro.abstraction;

public class RajatRaj implements i1, i2{
	
	public static void main(String[] args) {
		RajatRaj r = new RajatRaj();
		r.method1();
	}
	
	@Override
		public void method1() {
			i1.super.method1();
			i2.super.method1();
	} 
}
