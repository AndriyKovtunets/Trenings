package ua.nure.kovtunets.Practice1;

import java.math.BigInteger;

public class Task3 {

	public static void main(String[] args) {
		


				
				
				
		if(args.length!=2 ) System.out.println("Pls enter 2 numbers");
	
		
		else{
//			BigInteger 
		long a=Long.parseLong(args[0]);
		long b=Long.parseLong(args[1]);
		
		 while (b !=0) {
	            long mod = a%b;
	            a = b;
	            b = mod;
	        }
	        System.out.println(a);
		}
	}

}
