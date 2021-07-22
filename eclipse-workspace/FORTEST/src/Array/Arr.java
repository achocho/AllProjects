package Array;

public class Arr {

	public static void main(String[] args) {
		int[] ts= {2,5,7};
		int[][] ts1=new int[3][];

		for(int i=0;i<ts1.length;i++) 
		{
			ts1[i]=new int[ts[i]];
		
		}
		
		System.out.println(ts1[1].length);

	}

}