import java.util.*;
public class Main {

	public static void main(String[] args) {
	ArrayList<Books> names=new ArrayList<>();
	names.add(new Books("Hardrsdgy Potter","Josh",25));
	names.add(new Books("Posdsdgtter","Josh",25));
	names.add(new Books("otter","Josh",25));
SortNames(names);
	}
public static ArrayList<Books> SortNames(ArrayList<Books> list)
{
	int value=0;
	Books buffer=null;
ArrayList<Books> books=new ArrayList<>();
for(Books a:list) 
{
	books.add(a);
}

for(int z=0;z<books.size();z++) 
{
	String bookName=books.get(z).getName();
	for(int i=0;i<bookName.length();i++) 
	{
	 value=bookName.charAt(i);
	 System.out.println(value);
	}
		//System.out.println(value);	
}
for(int i=0;i<books.size()-1;i++) 
{
	for(int j=0;j<books.size()-1;j++) 
	{
		
	
	}

}

return list;
}
}
