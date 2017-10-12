class Solution {
    public int[] plusOne(int[] digits) {
        if (judge(digits)) {
          int[] res = new int[digits.length+1];
          res[0] = 1;
          for (int i = 1; i < res.length; i++) {
            res[i] = 0;
          }
          return res;
        } else {
          for(int i = digits.length - 1; i > -1; i--) {
            if (digits[i] == 9) {
              digits[i] = 0;
            } else {
              digits[i] = digits[i] + 1;
              break;
            }
          }
          return digits;
        }
    }

    public boolean judge(int[] digits) {
      for (int i = 0; i < digits.length; i++){
        if(digits[i] < 9)
          return false;
      }
      return true;
    }
}