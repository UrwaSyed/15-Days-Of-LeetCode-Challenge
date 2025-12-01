class Solution {
    private Boolean[][][] bool;
    public boolean isScramble(String s1, String s2) {
        int size = s1.length();
        bool = new Boolean[size][size][size +1];
        return check(s1, 0, s2, 0, size);
    }
    private boolean check(String s1, int i, String s2, int j, int l){
        if(bool[i][j][l] != null){
            return bool[i][j][l];
        }
        String a = s1.substring(i, i+ l);
        String b = s2.substring(j, j+l);
        if(a.equals(b)){
            return bool[i][j][l] = true;
        }
        int[] total = new int[26];
        for(int k = 0; k < l; k++){
            total[a.charAt(k) - 'a']++;
            total[b.charAt(k) - 'a']--;
        }
        for (int t: total){
            if(t!=0){
                return bool[i][j][l] = false;
            }

        }
        for(int k = 1; k < l; k++){
            if((check(s1, i,s2,j,k) && check(s1, i + k, s2, j + k, l - k)) || (check(s1, i,s2,j+l-k,k) && check(s1, i+k,s2,j,l-k))){
                return bool[i][j][l] = true;
            }
        }
        return bool[i][j][l] = false;
    }
}