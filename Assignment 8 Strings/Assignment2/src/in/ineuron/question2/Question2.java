package in.ineuron.question2;

public class Question2 {
	public static boolean validString(final String s) {
		int low = 0;
		int high = 0;

		for (final char c : s.toCharArray()) {
			switch (c) {
			case '(':
				++low;
				++high;
				break;
			case ')':
				low = Math.max(0, --low);
				--high;
				break;
			case '*':
				low = Math.max(0, --low);
				++high;
				break;
			}
			if (high < 0)
				return false;
		}

		return low == 0;
	}

	public static void main(String[] args) {
		String s = "()";

		System.out.println(validString(s));

	}

}
