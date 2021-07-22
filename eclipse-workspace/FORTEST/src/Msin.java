import java.util.*;
public class Msin {

	public static void main(String[] args) {
		List<Buletin> bul=new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		Scanner scan1 =new Scanner(System.in);
		boolean form=true;
		String name;
		String EGN;
		int choice;
		String exit;
		while(form) 
		{
			 name=scan.nextLine();
		EGN=scan.nextLine();
		choice=scan1.nextInt();
			bul.add(new Buletin(name,EGN,choice));
			System.out.println("Do you want to exit");
			exit=scan.nextLine();
			if(exit.equals("yes")) 
			{
				form=false;
				
			}
			
		}
		int s=0;
           for(int i=0;i<bul.size()-1;i++) 
           {
        	   for(int j=0;j<bul.size()-1;j++) 
        	   {
        		   int ch1=bul.get(j).getChoice();
        		   int ch2=bul.get(j+1).getChoice();
        		   if(ch1==ch2) 
        		   {
        			  s++; 
        			   
        		   }
        		   
        	   }
        	   
           }
           System.out.println(s);
		
	
	}

}
