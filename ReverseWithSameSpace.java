package javaCode;

public class ReverseWithSameSpace {
	public static void main(String[] args) {
		String str = "shailendra kumar patna";

		String[] words = str.split(" ");

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < words.length; i++) {

			StringBuilder reversedWord = new StringBuilder(words[i]).reverse();

			result.append(reversedWord);

			if (i != words.length - 1) {
				result.append(" ");
			}
		}

		System.out.println(result.toString());
	}

}
