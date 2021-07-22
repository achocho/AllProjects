import java.util.*;
public class ts {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
String numStr=sc.nextLine();
numStr+=" ";
List<String> newNumStr=new ArrayList<>();
int temp=0;
String temporary="";

for(int i=0;i<numStr.length();i++) 
{
	
	if(numStr.charAt(i)!=' ') 
	{
	
		temporary+=numStr.charAt(i);
	}
	else
	{	
		
		temporary.replaceAll(" ", "");
		if(!temporary.isBlank()) {
		newNumStr.add(temporary);	
		}
		temporary="";

	}
	





}

for(int i=0;i<newNumStr.size();i++) 
{
	if(newNumStr.get(i).isBlank()) {
		newNumStr.remove(i);
	}else {
		temp=Integer.parseInt(newNumStr.get(i));
		System.out.println(temp*temp);
	}
	


}

	}

}
