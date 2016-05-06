import java.util.ArrayList;
import java.util.Random;

import java.util.Arrays;


public class App {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		
		
		
//				System.out.println("1111111000011110011110000110001");
//				double d=0.5; //17.875
//				String s,s1="1111111000011110011110000110001";
//				Long l=Double.doubleToRawLongBits(d);
//				s = Long.toBinaryString(Double.doubleToRawLongBits(d));
//				System.out.println(d);
//				System.out.println(l);
//				 System.out.println(s);
//				 System.out.println(Long.parseLong(s1,2));
//				 System.out.println(Double.longBitsToDouble(l));
//				 
//				 System.out.println(Double.parseDouble(s));
//				 
//				 System.out.println(Long.parseLong(s1));
			Random rand = new Random();	 
		int[][] m = new int[10][2];	
		
		for(int i=0; i<10;i++){
			for(int j=0; j<2;j++){
				m[i][j]=  rand.nextInt();
				System.out.print(" "+m[i][j]);
			}
			System.out.println();
		}
		
		
		Arrays arr = null;
		
		arr.sort(m[0]);
		System.out.println(m[0][0]+" "+m[0][1]);
		
		
		float f =0.5f;
		String s;
		s= Integer.toBinaryString(   Float.floatToIntBits(f) )   ;
//		System.out.println(     Float.intBitsToFloat(             Integer.parseInt(s, 2)     )             );
		
//				 String chromosome1="111110000";
//				 String chromosome2="123456789";
//				 ArrayList<String> crossedChromosomes = new ArrayList<String>();
//				 StringBuffer new_chromosome1 = new StringBuffer(chromosome1);	 
//				 StringBuffer new_chromosome2 = new StringBuffer(chromosome2);
//				// схрещування  хромосом. отримаэм 2 нові
//					for(int i=1; i<chromosome1.length();i++){	
//					
//
////						
//						
//					if(i%2!=0)	new_chromosome1.setCharAt(i, chromosome1.charAt(i)); if (i%2==0) new_chromosome1.setCharAt(i, chromosome2.charAt(i-1));
//					if(i%2==0)	new_chromosome2.setCharAt(i, chromosome2.charAt(i)); if (i%2!=0) new_chromosome2.setCharAt(i, chromosome1.charAt(i-1));	
//					}
//					System.out.println(new_chromosome1);
//					System.out.println(new_chromosome2);
//					System.out.println(chromosome1.substring(0, 5));
			
//					crossedChromosomes.add(new_chromosome1.toString());
//					crossedChromosomes.add(new_chromosome2.toString());
				 
				 
				 
//				 System.out.println(Double.doubleToRawLongBits(d));
//				 System.out.println(Long.toBinaryString(Double.doubleToLongBits(d)));
//				 System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(d)));
//				System.out.println(Double.);
//	Long.toBinaryString(i);
//	Integer.toBinaryString(i);
//	
	}
	

}
//0.1*0.2 не виходить 0.02