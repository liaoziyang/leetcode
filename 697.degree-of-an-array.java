class Solution {
    public int findShortestSubArray(int[] nums) {
    	int max = 0;
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        for (int num : nums) {
        	int count = m.getOrDefault(num, 0) + 1;
        	if (count > max) max = count;
        	m.put(num, count);
        }
        List<Integer> l = new ArrayList<Integer>();
        for (int num : m.keySet()) {
        	if (m.get(num) == max) l.add(num);
        }
        int min_length = Integer.MAX_VALUE;
        for (int i = 0; i < l.size(); i++) {
        	min_length = min_length > getSubArrayLength(nums, l.get(i), max) ? getSubArrayLength(nums, l.get(i), max) : min_length;
        }
        return min_length == Integer.MAX_VALUE ? 0 : min_length;
    }

    public int getSubArrayLength(int[] nums, int num, int count) {
    	int length = 0;
    	int c = 0;
    	for (int n : nums) {
    		if (length > 0 && c < count) {
    			length++;
    			if (n == num) c++;
    		}
    		if (n == num && length == 0) {
    			length = 1;
    			c++;
    		}
    	}
    	return length;
    }
}