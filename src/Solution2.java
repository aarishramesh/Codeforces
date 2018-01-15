import java.util.HashMap;
import java.util.Scanner;

public class Solution2 {
	
	static HashMap<Entry, Integer> palindromeCountMap = new HashMap<Entry, Integer>();
	
	static void initialize(String s) {
        // This function is called once before all queries.
		int left = 0, right = 1;
		do {
			String subStr = s.substring(left, right);
			// Check whether subStr is palindrome using XOR
			int xor = 0;
			for (int )
			
			if (right == s.length())
				left++;
			else
				right++;
		} while (left != right);
    }

    static int answerQuery(int l, int r) {
        // Return the answer for this query modulo 1000000007.
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        initialize(s);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int l = in.nextInt();
            int r = in.nextInt();
            int result = answerQuery(l, r);
            System.out.println(result);
        }
        in.close();
    }
    
    static class Entry {
    	int left, right;

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + left * 10;
			result = prime * result + right;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Entry other = (Entry) obj;
			if (left != other.left)
				return false;
			if (right != other.right)
				return false;
			return true;
		}
    	
    	
    }
}
