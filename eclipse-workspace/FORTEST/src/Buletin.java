
public class Buletin {
private String name;
private String EGN;
private int choice;
Buletin(String name,String EGN,int choice)
{
this.name=name;
this.EGN=EGN;
this.choice=choice;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEGN() {
	return EGN;
}
public void setEGN(String eGN) {
	EGN = eGN;
}
public int getChoice() {
	return choice;
}
public void setChoice(int choice) {
	this.choice = choice;
}

}
