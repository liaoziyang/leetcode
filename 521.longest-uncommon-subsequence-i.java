class Solution {
    public int findLUSlength(String a, String b) {
        if(a.length() > b.length()) return a.length();
        if(a.length() < b.length()) return b.length();
        if(a.equals(b)) return -1;
        int maxlength = -1;
        for(int i = 0; i < a.length(); i++) {
        	for(int j = i; j < a.length(); j++) {
        		if(!b.contains(a.substring(i, j)) && (j - i + 1) > maxlength)
        			maxlength = j - i + 1;
        	}
        }
        return maxlength;
    }
}