class Solution {
    public int[] findErrorNums(int[] nums) {
    	int num1 = 0, num2 = 0;
    	for (int num : nums) {
    		if (nums[Math.abs(num) - 1] < 0){
    			num1 = Math.abs(num);
    			continue;
    		}
    		nums[Math.abs(num) - 1] = nums[Math.abs(num) - 1] * (-1);
    	}
    	for (int i = 0; i < nums.length; i++) {
    		if(nums[i] > 0) num2 = i + 1;
    	}
   		return new int[] {num1, num2};
    }
}