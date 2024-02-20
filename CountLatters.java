package Count_Latters;

import java.util.Scanner;

public class CountLatters {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String string = scan.nextLine();
		int Alphabets = 0;
		int digits = 0;
		int SpecialSymbols = 0;
		char[] c = string.toCharArray();
		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			if (ch >= '0' && ch <= '9')
				digits++;
			else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
				Alphabets++;
			else if (("!@#$%^&*").indexOf(ch) != -1)
				SpecialSymbols++;
		}
		System.out.println("Alphabets = " + Alphabets);
		System.out.println("digits = " + digits);
		System.out.println("SpecialSymbols =" + SpecialSymbols);

	}
}
