package GocevaExer;

public class Driver {

	public static void main(String[] args) {
String name;
double TotalTime;
Car car=new Car();
Tyre tyre=new Tyre();
double FuelConsumptionPerKM;
double Speed;
boolean AggressiveDriver=false;
boolean EnduranceDriver=false;
boolean UltraSoft=false;
boolean HardType=false;
double tour=0;
Speed=(car.Hp+tyre.Degradation)/car.FuelAmount;
if(AggressiveDriver) 
{
	FuelConsumptionPerKM=2.7;
	Speed*=1.3;
}
else if(EnduranceDriver) 
{
	FuelConsumptionPerKM=1.5;
}
try 
{
if(car.FuelAmount<=0) 
{
	throw new Exception("Not enough fuel to continue");
}	
if(car.FuelAmount>160) 
{
	car.FuelAmount=160;
}

if(UltraSoft) 
{
if(tour==1) 
{
	//degradation with grip
	tyre.Degradation-=tyre.Hardness+tyre.Grip;
	tour=0;
}	
	if(tyre.Degradation<30) 
	{
		throw new Exception("The tire exploded can't continue further");	
		
	}
}
else if(HardType) 
{
if(tour==1)
{
	tyre.Degradation-=tyre.Hardness;
}	
if(tyre.Degradation<=0)
{
	throw new Exception("The tire exploded can't continue further");	
}
}
}catch(Exception e) 
{
	System.out.println(e.getMessage());
}
	}

}
