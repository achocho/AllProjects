public class main {

	public static void main(String[] args) {
	Car car=new Car(220,"BMW",2500,4);
	Hovercraft hov=new Hovercraft(180,"Mercedes",278000,2000);
	Ship ship=new Ship(140,"Audi",210000,900);
	
	int carMaxSpeed=car.GetMaxSpeed();
	int hovMaxSpeed=hov.GetMaxSpeed();
	int shipMaxSpeed=ship.GetMaxSpeed();
	
	String carModel=car.Getmodel();
	String hovModel=hov.Getmodel();
	String shipModel=hov.Getmodel();
	
	float carPrice=car.GetPrice();
	float hovPrice=hov.GetPrice();
	float shipPrice=ship.GetPrice();
	
	int carTiers=car.GetTiers();
	
	int shipPassangers=ship.GetPassengers();
	
	int hovPassangers=hov.GetPassengers();
	
	System.out.println(carMaxSpeed + "," + carModel + "," + (int)carPrice + "," + carTiers);

	}

}
