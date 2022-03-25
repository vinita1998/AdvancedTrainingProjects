package com.java.training;

public class MedicineInfo {
	public void displayLabel()
	{
	System.out.println("Company : Flex Pharma");
	System.out.println("Address : Pune");
	}
	}
	class Tablet extends MedicineInfo
	{
	public void displayLabel()
	{
	System.out.println("store in a cool dry place");
	}
	}
	class Syrup extends MedicineInfo
	{
	public void displayLabel()
	{
	System.out.println("Consumption as directed by the physician");
	}
	}
	class Ointment extends MedicineInfo
	{
	public void displayLabel()
	{
	System.out.println("for external use only");
	}

}
