
public class Books {
private String name;
private String author;
private float price;
Books(String name,String author,float price)
{
	this.name=name;
	this.author=author;
	this.price=price;
}
public void SetName(String name) {	this.name=name;}
public void SetAuthor(String author) {	this.author=author;}
public void SetPrice(float price) {	this.price=price;}
public String getName() {return name;}
public String getAuthor() {return author;}
public float getPrice() {return price;}
}
