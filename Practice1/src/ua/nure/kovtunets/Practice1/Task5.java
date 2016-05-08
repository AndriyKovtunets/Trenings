package ua.nure.kovtunets.Practice1;

public class Task5 {

	final static int BASIS = 26; // numeration system with the base 26
	final static int ASCII_LENGTH = 64; // distance to the symbol A in ASCII table

	public static void main(String[] args) {

		String testSymbolsArguments[] = { "A", "B", "Z", "AA", "AZ", "BA", "ZZ", "AAA" };
		int testDigitsArguments[] = { 1, 2, 26, 27, 52, 53, 702, 703 };

		for (String s : testSymbolsArguments) {
			System.out.print(getSequenceDigits(s) + "\t");
		}
		System.out.println();
		for (int i : testDigitsArguments) {
			System.out.print(getSequenceSymbols(i) + "\t");
		}
		System.out.println();
		for (String s : testSymbolsArguments) {
			System.out.print(getRightColumn(s) + "\t");
		}

	}

	public static int getSequenceDigits(String symbols) {
		int sequence_number = 0;
		for (int i = 0; i < symbols.length(); i++) {
			sequence_number += Math.pow(BASIS, symbols.length() - i - 1) * (symbols.charAt(i) - ASCII_LENGTH);
		}
		return sequence_number;
	}

	public static String getSequenceSymbols(int number) {

		String symbols = "";
		StringBuffer reverse_symbols = new StringBuffer();
		int modul;
		while (number != 0) {
			modul = number % BASIS;
			if (modul == 0) {
				symbols += "Z";
				number = (number - 1) / BASIS;
			} else {
				symbols += (char) (modul + ASCII_LENGTH);
				number = (number - modul) / BASIS;
			}
		}

		return reverse_symbols.append(symbols).reverse().toString();
	}

	public static String getRightColumn(String symbols) {

		return getSequenceSymbols(getSequenceDigits(symbols) + 1);
	}

}
