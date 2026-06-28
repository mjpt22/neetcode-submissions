class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; 
                return digits; 
            } 
            digits[i] = 0;
        }
        // in the case of a number being 999, add an extra digit to the front
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;  
    }
}
