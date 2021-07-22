
public class SickPatient extends Patient {
	String disease;
	String TypeOfCure;
	boolean status;
	int DayOfIllness;
	String SetMedicine;
	int SetDose;
SickPatient(String name,String address,String EGN,String disease,String TypeOfCure,boolean status,int DayOfIllness)
{
	super(name,address,EGN);
this.disease=disease;
this.TypeOfCure=TypeOfCure;
this.status=status;
this.DayOfIllness=DayOfIllness;
}
public void Cure() 
{

String medicine=SetMedicine;
int dose=SetDose;

char lett=medicine.charAt(0);
if(Character.isUpperCase(lett)) 
{
dose=lett-64;
}else 
{
dose=lett-96;	
}
	SetDose=dose;
	


}
public void SetMedicine(String medicine) 
{
	this.SetMedicine=medicine;
}
public String GetMedicine() 
{
return SetMedicine;	
}
public int GetDose() 
{
return SetDose;	
}
public int GetDayOfIllness() 
{

return DayOfIllness;	

}
public void SetDayOfIllness(int DayOfIllness) 
{
	if(DayOfIllness>=1&&DayOfIllness<=366) {
	this.DayOfIllness=DayOfIllness;
}
	}
public String GetTypeOfCure() 
{
return TypeOfCure;	
}
public void SetTypeOfCure(String TypeOfCure) 
{
	this.TypeOfCure=TypeOfCure;
}
public boolean GetStatus() 
{
return status;	
}
public void SetStatus(boolean status) 
{
	this.status=status;
}
public String GetDisease() 
{
return disease;	
}
public void SetDisease(String disease) 
{
	this.disease=disease;
}
}
