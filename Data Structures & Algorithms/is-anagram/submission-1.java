class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        // we need to sort so both array contents are sorted 
        // alphabetically so we can compare them to each other 
        Arrays.sort(sArray); Arrays.sort(tArray);

        if (Arrays.equals(sArray,tArray)) {
            return true; 
        }

        return false; 
    }
}