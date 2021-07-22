
public class Ticket {
private String SceneName;
private double price;
Ticket(String SceneName,double price)
{
	this.SceneName=SceneName;
	this.price=price;
}
public String getSceneName() {
	return SceneName;
}
public void setSceneName(String sceneName) {
	this.SceneName = sceneName;
}
public double getPrice() {
	return price;
}
public void setPrice(float price) {
	this.price = price;
}

}
