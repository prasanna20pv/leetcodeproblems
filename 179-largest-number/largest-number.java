class Solution {
    public String largestNumber(int[] nums) {
         String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }
        
        for (int i = 0; i < strNums.length - 1; i++) {
            for (int j = 0; j < strNums.length - i - 1; j++) {
                String a = strNums[j];
                String b = strNums[j + 1];
                if ((a + b).compareTo(b + a) < 0) {
                    String temp = strNums[j];
                    strNums[j] = strNums[j + 1];
                    strNums[j + 1] = temp;
                }
            }
        }
        
        if (strNums[0].equals("0")) {
            return "0";
        }
        StringBuilder largestNumber = new StringBuilder();
        for (String str : strNums) {
            largestNumber.append(str);
        }
        
        return largestNumber.toString();
    }
}