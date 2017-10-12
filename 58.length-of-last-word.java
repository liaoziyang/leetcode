class Solution {
    public int lengthOfLastWord(String s) {
        String[] sa = s.split(" ");
        if(sa.length == 0)
          return 0;
        return sa[sa.length - 1].length();
    }
}