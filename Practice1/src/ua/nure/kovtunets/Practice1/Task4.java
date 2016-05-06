package ua.nure.kovtunets.Practice1;

public class Task4 {

	public static void main(String[] args) {


if(getValidation(args)==false) ;
else
{
			int sum = 0;
			for (char c : args[0].toCharArray()) {
				sum += Integer.parseInt(String.valueOf(c));
			}
			System.out.println(sum);
}
	}

	public static boolean getValidation (String[] args){
		
		final short MIN_RANGE=48; // range encodings number for ASCI table
		final short MAX_RANGE=57;
		
		int c=0;
		// додати константу
		if (args.length != 1){ System.out.println("Pleas enter one numbers"); return false;}
		
		for(int i=0; i<args.length; i++){
		for(int j=0; j<args[i].length();j++){
			c=args[i].charAt(j); 
		if	(c<MIN_RANGE || c>MAX_RANGE) { System.out.println("Pleas enter only number"); return false;}
		
		}
	}
		
		return true;
	}	
	
	
}


	