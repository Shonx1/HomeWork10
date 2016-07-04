package Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter text");
		String text = in.nextLine();
		System.out.println("Enter word");
		String word = in.nextLine();
		String[] str = text.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (str[i].equals(word)) {
				str[i] = str[i].toUpperCase();
			}
		}
		for (String a : str) {
			System.out.print(a + " ");
		}
	}

}