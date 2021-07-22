package exam;

public class ex4 {

	public static void main(String[] args) {
		String nums;
		int nines=0;
	for(int i=100;i<1000;i++) 
	{
		nums=Integer.toString(i);
		for(int j=0;j<nums.length();j++) 
		{
		if(nums.charAt(j)=='9') 
		{
			nines++;
			
		}	
			
		}
		if(nines==1) 
		{
			System.out.println(i);
			nines=0;
		}else 
		{
			nines=0;
			
		}
	}	

	}

}
