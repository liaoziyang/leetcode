class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while (index < bits.length - 1) {
        	if (bits[index] == 0) index++;
        	if (bits[index] == 1) index = index + 2;
        }
        return index == bits.length - 1;
    }
}