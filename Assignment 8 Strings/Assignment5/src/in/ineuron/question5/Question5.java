package in.ineuron.question5;

public class Question5 {
	public static int compress(char[] chars) {
		int lo = 0;
		int hi = 0;
		while (hi < chars.length) {
			char c = chars[hi];
			int count = 0;
			while (hi < chars.length && chars[hi] == c) {
				hi += 1;
				count += 1;
			}
			chars[lo] = c;
			lo += 1;
			if (count != 1) {
				for (char digit : String.valueOf(count).toCharArray()) {
					chars[lo] = digit;
					lo += 1;
				}
			}
		}
		return lo;
	}

	public static void main(String[] args) {
		char[] a = { 'a', 'a', 'b', 'b', 'c', 'c' };
		System.out.println(compress(a));

	}

}
