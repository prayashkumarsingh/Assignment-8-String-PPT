package in.ineuron.question3;

public class Question3 {
	public static int distance(String s1, String s2) {
	    final int k = lcs(s1, s2);
	    return (s1.length() - k) + (s2.length() - k);
	  }

	  private static int lcs(final String A, final String B) {
	    final int m = A.length();
	    final int n = B.length();
	    int[][] dp = new int[m + 1][n + 1];

	    for (int i = 1; i <= m; ++i)
	      for (int j = 1; j <= n; ++j)
	        if (A.charAt(i - 1) == B.charAt(j - 1))
	          dp[i][j] = 1 + dp[i - 1][j - 1];
	        else
	          dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

	    return dp[m][n];
	  }
	  public static void main(String[] args)
	    {
	        String s1 = "sea";
	        String s2 = "eat";
	        System.out.println(distance(s1,s2));
	        
	    }

}
