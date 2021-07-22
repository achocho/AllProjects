import java.util.*;
public class Main {
	static Scanner scan=new Scanner(System.in);
	static String triangleName=scan.nextLine();
	static String circleName=scan.nextLine();
    static String squareName=scan.nextLine();
	static int triangleArea;
	static int circleArea;
	static int squareArea;
	public static void main(String[] args) throws InputMismatchException {

try 
{
	WrongName();
	
}
catch(Exception e) 
{
	System.out.println(e.getMessage());
	
}

try 
{
triangleArea=scan.nextInt();
circleArea=scan.nextInt();
squareArea=scan.nextInt();
PrintResult();
}
catch(InputMismatchException e) 
{
	System.out.println("Area can't contain letters!!!");
}

	}
public static void WrongName() throws Exception

{
	
if(circleName.isEmpty()||triangleName.isEmpty()||squareName.isEmpty()) 
{
	throw new Exception("The color can't be empty!!!");
}
else if(circleName.matches(".*\\d.*")||squareName.matches(".*\\d.*")||triangleName.matches(".*\\d.*")) 
{
	throw new Exception("The color can't contain numbers!!!");
}

}
public static void PrintResult() 
{
	Triangle tri=new Triangle(triangleName,triangleArea);
	Square squ=new Square(squareName,squareArea);
	Circle cir=new Circle(circleName,circleArea);
	System.out.print(tri.GetName());
	System.out.print(" - ");
	System.out.print(triangleName);
	System.out.print(" : ");
	System.out.print(tri.GetArea());
	System.out.println();
	
	System.out.print(cir.GetName());
	System.out.print(" - ");
	System.out.print(circleName);
	System.out.print(" : ");
	System.out.print(cir.GetArea());
	System.out.println();	
	
	System.out.print(squ.GetName());
	System.out.print(" - ");
	System.out.print(squareName);
	System.out.print(" : ");
	System.out.print(squ.GetArea());
	System.out.println();
	

}
}
