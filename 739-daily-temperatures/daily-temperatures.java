class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] ans = new int[size];
        for(int i = size - 2; i>=0; i--){
            int j = i+1;
            while(j<size){
                if(temperatures[j] > temperatures[i]){
                    ans[i] = j - i;
                    break;
                }
                else if(ans[j] == 0){
                    break;
                }
                else{
                    j = j + ans[j];
                }
            }
            
        }
        return ans;
    }
}