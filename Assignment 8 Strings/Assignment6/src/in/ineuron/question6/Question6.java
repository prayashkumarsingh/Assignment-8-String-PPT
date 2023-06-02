package in.ineuron.question6;
import java.util.*;

public class Question6 {
	public static List<Integer> anagrams(String s, String p) {
	    List<Integer> ans = new ArrayList<>();
	    int[] count = new int[128];
	    int required = p.length();

	    for (final char c : p.toCharArray())
	      ++count[c];

	    for (int l = 0, r = 0; r < s.length(); ++r) {
	      if (--count[s.charAt(r)] >= 0)
	        --required;
	      while (required == 0) {
	        if (r - l + 1 == p.length())
	          ans.add(l);
	        if (++count[s.charAt(l++)] > 0)
	          ++required;
	      }
	    }

	    return ans;
	  }
	public static void main(String[] args) {
		String s = "cbaebabacd";  
		String p = "abc";
		System.out.println(anagrams(s,p));

	}

}
