
public class Person {
private String name;
private String address;
private String city;
private String EGN;
private String password;
Person(String name,String address,String city,String EGN,String password)
{
	this.password=password;
	this.name=name;
	this.address=address;
	this.city=city;
	this.EGN=EGN;
}
public void SetPassword(String password) 
{
	this.password=password;
}
public void SetName(String name) 
{
	this.name=name;
}
public void SetAddress(String address) 
{
	this.address=address;
}
public void SetCity(String city) 
{
	this.city=city;
}
public void SetEGN(String EGN) 
{
	this.EGN=EGN;
}
public String getPassword() 
{
return password.trim();	
}
public String getName() 
{
	return name;
}
public String getAddress() 
{
	return address;
}
public String getCity() 
{
	return city;
}
public String getEGN() 
{
	return EGN;
}
public String GetBirthday() 
{
String yearStr=EGN.substring(0,2);
String monthStr=EGN.substring(2,4);
String dayStr=EGN.substring(4,6);
int year=Integer.parseInt(yearStr);
int month=Integer.parseInt(monthStr);
int day=Integer.parseInt(dayStr);
if(year<10) 
{
	yearStr="200"+Integer.toString(year);
}
else if(year>=10&&year<=21)
{
	yearStr="20"+Integer.toString(year);
}

else 
{
yearStr="19"+Integer.toString(year);	
}
String[] month1= {"January","Fabruary","March","April","May","June","July","Augoust","September"};
String[] month2= {"October","November","December"};
if(month<50) {
monthStr=month1[month-41];
}else 
{
	monthStr=month2[month-50];
}
return day+" "+monthStr+" "+yearStr;

}
}
