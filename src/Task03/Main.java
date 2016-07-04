package Task03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter word");
		String word = in.nextLine();
		System.out.println("Enter text");
		String text = in.nextLine();
		int count = 0;
		String[] str = text.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].matches(word)) {
				count++;
			}
		}
		for (String a : str) {

		}
		System.out.print("The word: " + word + ", occures :" + count + "times");
	}
}