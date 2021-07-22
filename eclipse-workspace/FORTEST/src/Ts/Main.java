package Ts;
import java.util.*;
public class Main {

	public static void main(String[] args) throws Exception {
		try {
		List<Car> cars=new ArrayList<>();
		cars.add(new Car("","",0,"","",""));
Offers offers=new Offers(cars);
Car car=new Car("miki","mouse",20,"2002","dizel","43623");
Car car1=new Car("sgd","sdfh",10,"sd","sdg","934");

offers.AddCar(car);
offers.AddCar(car1);
//offers.PrintData("miki", "mouse");
//offers.MostExp();
//offers.RemoveCar("43623");
car1.PrintData("934");

	}catch(CarException e) 
		{
		System.out.println(e.getMessage());
		
		}
		}

}
