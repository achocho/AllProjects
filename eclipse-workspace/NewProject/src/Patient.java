
public abstract class Patient {
String name;
String address;
String EGN;
Patient(String name,String address,String EGN)
{
	this.name=name;
	this.address=address;
	this.EGN=EGN;
}
public String GetName() 
{
return name;	
}
public void SetName(String name) 
{
	this.name=name;
}
public String GetAddress() 
{
return address;	
}
public void SetAddress(String address) 
{
	this.address=address;
}
public String GetEGN() 
{
return EGN;	
}
public void SetEGN(String EGN) 
{
	this.EGN=EGN;
}
public abstract void Cure();
}
