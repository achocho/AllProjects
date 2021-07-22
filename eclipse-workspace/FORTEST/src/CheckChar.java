
public class CheckChar {

	public static void main(String[] args) {
		String name="haofhefbg";
		int len=0;
		if(name.charAt(name.length()-1)=='\\') 
		{
			len=name.length()-1;
			
		}else 
		{
			len=name.length();
			
		}
		String nm="";
		for(int i=0;i<len;i++) 
		{
			nm+=name.charAt(i);
			
		}
		System.out.println(nm);

	}

}
