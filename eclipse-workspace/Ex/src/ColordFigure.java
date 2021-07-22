
public abstract class ColordFigure {
private String color="";
private int size=0;
ColordFigure(String color,int size)
{
	this.color=color;
	this.size=size;
}
public void show() 
{
System.out.println(color);
System.out.println(size);
}
public abstract String GetName();
public abstract int GetArea();
}
