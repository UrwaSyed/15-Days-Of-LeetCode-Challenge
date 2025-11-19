class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1 != len2){
            return false;
        }
        int[] count = new int[26];
        for(int i = 0; i < len1; i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int j = 0; j< 26; j++){
            if(count[j] != 0){
                return false;
            }
        }

    return true;    
    }
}