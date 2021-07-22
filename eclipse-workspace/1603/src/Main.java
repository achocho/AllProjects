import java.util.*;
public class Main {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Here you need to type data for the author and painting");
		System.out.println("Lets start with name of the painting");
		String name=scan.nextLine();
		System.out.println("Next author name");
		String author=scan.nextLine();
		System.out.println("Next price");
		double price=scan.nextDouble();
		System.out.println("Next year of creation");
		int year=scan.nextInt();
		System.out.println("Next id ");
		int id=scan.nextInt();
		Paintings ps=new Paintings(new Painting(null,null,0,0,0));
		
		double price1=scan.nextDouble();
ps.AddPainting(new Painting(name,author,price1,year,id));
		ps.AddPainting(new Painting(name,author,price,year,id));
ps.HighestPrice();
	}

}
