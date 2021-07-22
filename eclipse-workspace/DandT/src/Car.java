
public class Car extends Vehicle implements isLandVehicle {
public int tiers;
Car(int maxSpeed,String model,float price,int tiers)
{
	super(maxSpeed,model,price);
	this.tiers=tiers;
}
public int GetTiers() 
{
return tiers;	
}
public void SetTiers(int tiers) 
{
this.tiers=tiers;	
}

public void enterLand() {
	// TODO Auto-generated method stub
	
}

public double ckeckPromo(double promotion) {
	// TODO Auto-generated method stub
	return 0;
}
}
