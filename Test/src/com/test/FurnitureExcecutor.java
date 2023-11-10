package com.test;

import java.util.ArrayList;

public class FurnitureExcecutor {
	public static void main(String[] args) {
//		Furniture chair = Furniture.createFurniture(1, "Chair", 49.50, 10);
//		Furniture table = Furniture.createFurniture(2, "Table", 129.99, 5);
//		Furniture sofa = Furniture.createFurniture(3, "Sofa", 8000.00, 2);
//
//		System.out.println(chair);
//		System.out.println(table); 
//		System.out.println(sofa);
		
		ArrayList<Furniture> ls=new ArrayList<Furniture>();
		
		ls.add(new Furniture(1, "Chair", 49.50, 10));
		ls.add(new Furniture(2, "Table", 129.99, 5));
		ls.add(new Furniture(3, "Sofa", 8000.00, 2));
		
		
		//Furniture f=new Furniture();
		
		FurnitureService fs=new FurnitureService();
		
		System.out.println("Highest_price: "+fs.price(ls));
		System.out.println("Furniture_Name_Start_with_T: "+fs.name(ls));
		System.out.println("Furniture_with_less_stock: "+fs.quantity(ls));
	}
}
