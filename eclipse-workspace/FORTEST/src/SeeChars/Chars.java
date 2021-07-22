package SeeChars;

public class Chars {

	public static void main(String[] args) {
		String name="acho";
		String code="";
		for(int i=0;i<name.length();i++) 
		{
			code+=(int)name.charAt(i)+(int)name.charAt(i);
			
		}
		System.out.println(code);

	}

}
