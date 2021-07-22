package exam;
import java.lang.Math;
public class ex3 {

	public static void main(String[] args) {
    int num=4;
    int curr=0;
    int stepen=0;
  while(stepen<num) 
  {
	 stepen=(int)Math.pow(2, curr); 
	  curr++;
  }
  if(stepen==num&&num!=1) 
  {
	  System.out.println("true");
	  
  }else 
  {
	  System.out.println("false"); 
	  
  }

	}

}
