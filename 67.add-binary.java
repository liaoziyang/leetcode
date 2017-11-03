class Solution {
    public String addBinary(String a, String b) {
        int b1 = Integer.parseInt(a);
        int b2 = Integer.parseInt(b);
        if (b1 == 0 && b2 == 0) {
          return "0";
        }
        int num1 = 0, num2 = 0;
        while (b1 > 0) {
          num1 = num1 * 2 + b1 % 10;
          b1 = b1 / 10;
        }
        while (b2 > 0) {
          num2 = num2 * 2 + b2 % 10;
          b2 = b2 / 10;
        }
        int sum = num1 + num2;
        StringBuilder sb = new StringBuilder();
        while (sum > 0) {
          sb.insert(0, sum % 2);
          sum = sum / 2;
        }
        return sb.toString();
    }
}