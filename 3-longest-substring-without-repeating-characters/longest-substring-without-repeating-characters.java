class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0){
            return 0;
        }
        int[] count = new int[256];
        int start = 0;
        int maxLen = 0;

        for(int end = 0; end < s.length(); end++){
            char curr = s.charAt(end);
            count[curr]++;
            while(count[curr] > 1){
                count[s.charAt(start)]--;
                start++;
            }
            maxLen = Math.max(maxLen, end-start+1);

        }
        return maxLen;
    }
}