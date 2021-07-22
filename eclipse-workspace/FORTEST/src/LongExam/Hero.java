package LongExam;
import java.util.*;
public class Hero {
String name;
int hp;
ArrayList<Item> bag=new ArrayList<>();
Hero(String name,int hp)
{
	this.hp=hp;
	this.name=name;
}
public void AddItem(String type,float Price) 
{
	bag.add(new Item(type,Price));
}
public void Info() 
{
System.out.println("Hero name= "+name);
System.out.println("Hero hp= "+hp);
System.out.println("Items are:");
for(int i=0;i<bag.size();i++) 
{
	System.out.println(i+1+".");
	System.out.println("Type: "+bag.get(i).type);
	System.out.println("Price: "+bag.get(i).Price);
	
}

}
}
