package com.techzenureDay5;

public class Productinventary {

	public static void main(String[] args) {
		Product prod=new Product();
		
		System.out.println(prod.getProductId() + " | " +prod.getProductName() + " | " + prod.getProductPrice());
		
		prod.setProductId(123456);
		prod.setProductName("Laptop");
		prod.setProductPrice(12345.32f);
		
		System.out.println(prod.getProductId()+ " | " +prod.getProductName() + " | " + prod.getProductPrice());
	
		System.out.println("prod is instance of: "+prod.getClass().getName());
		System.out.println("prod is instance of: "+prod.getClass().getSimpleName());
		System.out.println();
	
		System.out.println("hashCode() : "+prod.hashCode());
		System.out.println("hashCode() in Hexa Ecimal Form : "+ Integer.toHexString(prod.hashCode()));
		System.out.println();
		
		System.out.println(prod);//to String()
	}
}