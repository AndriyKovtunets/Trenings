package ua.nure.kovtunets.Practice1;

public class Task3 {

	public static void main(String[] args) {

		if (getValidation(args) == false)
			;
		else {

			long a = Long.parseLong(args[0]);
			long b = Long.parseLong(args[1]);

			while (b != 0) {
				long mod = a % b;
				a = b;
				b = mod;
			}
			System.out.println(a);
		}
	}

	public static boolean getValidation(String[] args) {

		final short minRange = 48; // range encodings number for ASCI table
		final short maxRange = 57;
		int symbol = 0;

		// check for entering symbols
		for (int i = 0; i < args.length; i++) {
			for (int j = 0; j < args[i].length(); j++) {
				symbol = args[i].charAt(j);
				if (symbol < minRange || symbol > maxRange) {
					System.out.println("Pleas enter only integer number");
					return false;
				}
			}
		}

		// check for amount arguments
		if (args.length != 2) {
			System.out.println("Pleas enter two numbers");
			return false;
		}

		// check for positive numbers
		if (Double.parseDouble(args[0]) < 0) {
			System.out.println("Pleas enter positive numbers");
			return false;
		}

		return true;
	}

}
