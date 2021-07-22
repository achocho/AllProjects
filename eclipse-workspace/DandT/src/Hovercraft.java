
public class Hovercraft extends Vehicle implements isSeaVessel{
	public int passengers;
Hovercraft(int maxSpeed,String model,float price,int passenger)
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

public void EnterSea() {
	// TODO Auto-generated method stub
	
}

public double ckeckPromo(double promotion) {
	// TODO Auto-generated method stub
	return 0;
}
}
