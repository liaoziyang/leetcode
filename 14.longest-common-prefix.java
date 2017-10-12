class Solution {
    public String longestCommonPrefix(String[] strs) {
    	int len = strs.length;
    	if(len == 0)
    		return "";
        String res = strs[0];
        for(int i = 1; i < strs.length; i++){
        	StringBuilder sb = new StringBuilder();
        	char[] ca1 = res.toCharArray();
        	char[] ca2 = strs[i].toCharArray();
        	for (int j = 0; j < ca1.length && j < ca2.length; j++) {
        		if(ca1[j] == ca2[j])
        			sb.append(ca1[j]);
        		else
        			break;
        	}
        	res = sb.toString();
        }
        return res;
    }
}