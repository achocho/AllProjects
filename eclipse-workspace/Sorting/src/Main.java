

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Apartment ap1 = new Apartment(70000,150, "Ovcha Kupel");
        Apartment ap2 = new Apartment(-75000,134, "Ovcha Kupel");
        Apartment ap3 = new Apartment(61000,95, "Ovcha Kupel");
        Apartment ap4 = new Apartment(31000,124, "Ovcha Kupel");
        Apartment ap5 = new Apartment(11000,50, "Ovcha Kupel");
        ArrayList<Apartment> list = new ArrayList<Apartment>();
        list.add(ap1);
        list.add(ap2);
        list.add(ap3);
        list.add(ap4);
        list.add(ap5);

   
        var arr = list;//getSortedPricesByNeighbourhood(list,"Ovcha Kupel");
        var arr2 = getSortedAreasByNeighbourhood(list,"Ovcha Kupel");
      
       int sr=Integer.MAX_VALUE;
        for(int i=0;i<arr.size();i++) 
       {
    	   if(sr>arr.get(i).getPrice()/arr.get(i).getArea()) 
    	   {
    		   sr=(int) (arr.get(i).getPrice()/arr.get(i).getArea());
    		   
    	   }
    	   
       }
        int sr1=Integer.MIN_VALUE;
        for(int i=0;i<arr.size();i++) 
        {
        	if(sr1<arr.get(i).getPrice()/arr.get(i).getArea()) 
        	{
        		sr1=(int) (arr.get(i).getPrice()/arr.get(i).getArea());
        		
        	}
        	
        }
System.out.println(sr);
System.out.println(sr1);
     //  System.out.println("Highest price :"+arr.get(0).getPrice()/arr.get(0).getArea() +" lv/m^2");
       //     System.out.println("Lowest price :"+arr.get(arr.size()-1).getPrice() / arr.get(arr.size()-1).getArea()  + " lv./m^2");
   

        System.out.println("--------------");

        for(int i = 0; i < arr2.size(); i++){
       //     System.out.println(arr2.get(i).getArea() + " m^2");
        }

       // System.out.println("--------------");
        

     
    }
    public static ArrayList<Apartment> getSortedAreasByNeighbourhood(ArrayList<Apartment> list, String neighbourhood){
        ArrayList<Apartment> apartments = new ArrayList<Apartment>();
        
            Apartment buffer = null;
            for(Apartment a : list){
                if(a.getNeighbourhood().equals(neighbourhood)){
                    apartments.add(a);
                }
            }
         
            for(int i = 0; i < apartments.size() - 1; i++){
                for(int j = 0; j < apartments.size() - 1; j++){
                    double size1 = apartments.get(j).getArea();
                    double size2 = apartments.get(j+1).getArea();
                    if(size1 > size2){
                        buffer = apartments.get(j);
                        apartments.set(j, apartments.get(j+1));
                        apartments.set(j+1, buffer);
                    }
                }
            

        }

        return apartments;
    }



    public static ArrayList<Apartment> getSortedPricesByNeighbourhood(ArrayList<Apartment> list, String neighbourhood){
        ArrayList<Apartment> apartments = new ArrayList<Apartment>();
       
            Apartment buffer = null;
            for(Apartment a : list){
                if(a.getNeighbourhood().equals(neighbourhood)){
                    apartments.add(a);
                }
            }
     
            for(int i = 0; i < apartments.size() - 1; i++){
                for(int j = 0; j < apartments.size() - 1; j++){
                    double price1 = apartments.get(j).getPrice() /  apartments.get(j).getArea();
                    double price2 = apartments.get(j+1).getPrice() /  apartments.get(j+1).getArea();
                    if(price1 < price2){
                        buffer = apartments.get(j);
                        apartments.set(j, apartments.get(j+1));
                        apartments.set(j+1, buffer);
                    }
                }
            }

     

        return apartments;
    }

}