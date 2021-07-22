package FindIps;

import java.net.InetAddress;

public class Network {
	public static void scanAddresses(String subnet, int timeOut){ 
        for (int endofAddr=200; endofAddr<255; endofAddr++){ 
            try { 
            	System.out.println(endofAddr);
            	
                String addr = subnet + "." + endofAddr; 
                if (InetAddress.getByName(addr).isReachable(timeOut)) 
                    System.out.println(addr + " found"); 
            } catch (Exception e) { 
                e.printStackTrace(); 
            } 
        } 
    } 
 
    public static void main(String[] args) throws Exception{ 
    	scanAddresses("10.157.11",200);
    	 
    } 
}
