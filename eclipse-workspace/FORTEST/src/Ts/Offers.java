package Ts;
import java.util.*;
public class Offers {
List<Car> cars=new ArrayList<>();
Offers(List<Car> cars)
{
	this.cars=cars;
}
public List<Car> getCars() {
	return cars;
}
public void setCars(List<Car> cars) {
	this.cars = cars;
}
public void AddCar(Car car) throws Exception 
{
boolean canAdd=false;
for(int i=0;i<cars.size();i++) 
{
	if(cars.get(i).getSerialNumber().equals(car.getSerialNumber())) 
	{
		
		canAdd=false;
		throw new CarException("The car already exists");
	}else 
	{
		canAdd=true;
	}
}
if(canAdd) 
{
	System.out.println("Added");
	cars.add(car);
}

	}
public void RemoveCar(String serialNumber) 
{
	for(int i=0;i<cars.size();i++) 
	{
		if(cars.get(i).getSerialNumber().equals(serialNumber)) 
		{
			System.out.println("Removed");
			cars.remove(i);
			
		}
		
	}
}
public void PrintData(String brand,String model) 
{
	
	for(int i=0;i<cars.size();i++) 
	{
		
		if(cars.get(i).getModel().equals(model)&&cars.get(i).getBrand().equals(brand)) 
		{
			System.out.println("The year is: "+cars.get(i).getYear());
			System.out.println("The price is: "+cars.get(i).getPrice());
			System.out.println("The fuelType is: "+cars.get(i).getFuelType());
			
			
		} if((model.equals("")||model.equals(" "))&&(brand.equals("")||brand.equals(""))) 
		{
			System.out.println("The year is: "+cars.get(i).getYear());
			System.out.println("The price is: "+cars.get(i).getPrice());
			System.out.println("The fuelType is: "+cars.get(i).getFuelType());
			
		}
		
	}
}
public void MostExp() 
{
	double price=0;
	for(int i=0;i<cars.size();i++) 
	{
		if(price<cars.get(i).getPrice()) 
		{
			price=cars.get(i).getPrice();
			
		}
		
	}
	for(int i=0;i<cars.size();i++) 
	{
		if(price==cars.get(i).getPrice()) 
		{
			System.out.println("The year is: "+cars.get(i).getYear());
			System.out.println("The price is: "+cars.get(i).getPrice());
			System.out.println("The fuelType is: "+cars.get(i).getFuelType());
			System.out.println("The model is: "+cars.get(i).getModel());
			System.out.println("The brand is: "+cars.get(i).getBrand());
			
		}
		
	}
}
}
