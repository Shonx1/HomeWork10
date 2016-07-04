package Task04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word");
		String word = in.nextLine();
		System.out.println("Enter text");
		String text = in.nextLine();
		String[] str = text.split("[.]");
		for (String a : str) {
			if (a.contains(word)) {
				System.out.print(a + ".");
			}
		}
	}

}