class Solution {
    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> h = new HashSet<String>();
        String res = "";
        h.add("");
        for (String word : words) {
        	if (word.length() > 0 && h.contains(word.substring(0, word.length()-1))) {
        		res = word.length() > res.length() ? word : res;
        		h.add(word);
        	}
        }
        return res;
    }
}