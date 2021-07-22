package Ts;

public class Car {
private String brand;
private String model;
private double price;
private String year;
private String fuelType;
private String serialNumber;
Car(String brand,String model,double price,String year,String fuelType,String serialNumber)
{
	this.brand=brand;
	this.model=model;
	this.price=price;
	this.year=year;
	this.fuelType=fuelType;
	this.serialNumber=serialNumber;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public String getSerialNumber() {
	return serialNumber;
}
public void setSerialNumber(String serialNumber) {
	this.serialNumber = serialNumber;
}
public void PrintData(String serialNumber) 
{
	if(this.serialNumber.equals(serialNumber)) 
	{
		System.out.println("The model is :"+model);
		System.out.println("The brand is :"+brand);
		System.out.println("The price is :"+price);
		System.out.println("The fuelType is :"+fuelType);
		System.out.println("The year is :"+year);
		
	}
}
}
