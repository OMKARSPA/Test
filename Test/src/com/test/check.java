package com.test;
class Employee{
	int id;
	String name;
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
}

class Hospital{
	int variable, variable1;
	public Hospital() {
		
	}
	public Hospital(int variable) {
		
	}
}

class Pharmacy{
	public Pharmacy() {
		super();
		System.out.println("Pharmacy_Constructor");
	}
}

class Medicine extends Pharmacy{
	
	int medcineId;
	double medicinePrice;
	String medicineName;
	
	
	
	public Medicine() {
		//super();
		this(5);
	}

	public Medicine(int medcineId) {
		this(10, "Paracitmol");
		//super();
		this.medcineId = medcineId;
	}

	public Medicine(double medicinePrice, String medicineName) {
		//super();
		this(5, 10, "Paracitmol");
		this.medicinePrice = medicinePrice;
		this.medicineName = medicineName;
	}

	public Medicine(int medcineId, double medicinePrice, String medicineName) {
		super();
		this.medcineId = medcineId;
		this.medicinePrice = medicinePrice;
		this.medicineName = medicineName;
	}
	
	
	
}
public class check {
	public static void main(String[] args) {
        System.out.println("Hello, World!");
        String str1 = "Omkar";
        String str2 = "Om";
        
        System.out.println(str1 == str2);
        
        int num1 = 10;
        int num2 = 10;
        
        System.out.println(num1 == num2);
        
        System.out.println(str1.equals(str2));
        
        System.out.println();
        
        Object o1 = new Object();
        
        Employee e1 = new Employee();
        System.out.println(e1.hashCode());
        
        Medicine m = new Medicine();
        System.out.println("MedicineId: "+ m.medcineId);
        System.out.println("MedicineName: "+m.medicineName);
        System.out.println("MedicinePrice: "+m.medicinePrice);
        
        
    }
}
