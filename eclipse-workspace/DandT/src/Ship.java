
public class Ship extends Vehicle implements isSeaVessel{
	public int passengers;
Ship(int maxSpeed,String model,float price,int passengers)
{
	super(maxSpeed,model,price);
    this.passengers=passengers;
}
public int GetPassengers() 
{
return passengers;	
}
public void SetPassengers(int passengers) 
{
this.passengers=passengers;	
}
@Override
public void EnterSea() {
	// TODO Auto-generated method stub
	
}

public double ckeckPromo(double promotion) {
	// TODO Auto-generated method stub
	return 0;
}
}
