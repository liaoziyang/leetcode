class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0;
        char[] c = s.toCharArray();
        for (int i = 1; i < s.length(); i = i + 2) {
        	int begin = 0, end = i;
        	while (end < s.length()) {
        		if (isSymmetry(c, begin, end))
        			count++;
        		begin++;
        		end = begin + i;
        	}
        }
        return count;
    }

    public boolean isSymmetry(char[] c, int begin, int end) {
    	int d = c[begin] - c[end];
    	if (Math.abs(d) != 1)
    		return false;
    	while (begin < end) {
    		if (c[begin] - c[end] != d)
    			return false;
    		begin++;
    		end--;
    	}
    	return true;
    }
}