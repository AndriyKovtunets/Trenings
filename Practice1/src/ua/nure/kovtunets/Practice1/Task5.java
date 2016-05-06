package ua.nure.kovtunets.Practice1;

public class Task5 {

	public static void main(String[] args) {
		
//	System.out.println(get_sequence_number("AAA"));	

	}
	
	public static int get_sequence_number(String symbols){
		int sequence_number=0;
		for(int i=0; i<symbols.length();i++){
			sequence_number+= Math.pow(26, symbols.length()-i-1) *  (symbols.charAt(i)-64);
		}
		return sequence_number;
	}
	
	public static String get_sequence_symbols(int number){

		String symbols = "";
		StringBuffer reverse_symbols = new StringBuffer();
		int modul;
		while (number !=0){
			modul=number%26;
			if (modul==0){
				symbols +="Z";
				number = (number -1)/26;
			}
			else{
			symbols += (char)(modul+64);
			number = (number-modul)/26;
			}
		}
		
		return reverse_symbols.append(symbols).reverse().toString();
	}
	
	public static String get_rightSembols (String symbols){
		
		
		return get_sequence_symbols( get_sequence_number(symbols)+1);
	}
	
	

}
