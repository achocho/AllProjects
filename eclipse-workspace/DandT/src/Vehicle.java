
public abstract class Vehicle {
public int maxSpeed;
public String model;
public float price;
Vehicle(int maxSpeed,String model,float price)
{
	this.maxSpeed=maxSpeed;
	this.model=model;
	this.price=price;
}
	public int GetMaxSpeed() 
	{
		return maxSpeed;
		
	}
	public float GetPrice() 
	{
		return price;
		
	}
	public String Getmodel() 
	{
		return model;
	}
public void SetMaxSpeed(int maxSpeed) 
{
	this.maxSpeed=maxSpeed;
}
public void SetPrice(float price) 
{
	this.price=price;
}
public void SetModel(String model) 
{
	this.model=model;
}
public abstract double ckeckPromo(double Promotion);

}
