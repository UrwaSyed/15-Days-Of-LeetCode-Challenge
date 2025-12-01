class Solution {
    public void nextPermutation(int[] nums) {
        int size = nums.length;
        int i = size-2;
        while(i>=0 && nums[i] >=nums[i+1]){
            i--;
        }
        if(i>=0){
            int k = size-1;
            while(nums[k] <= nums[i]){
                k--;
            }
        
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
        }
    
        int a = i+1;
        int b = size-1;
        while(a<b){
            int temp = nums[a];
            nums[a] =nums[b];
            nums[b] = temp;
            a++;
            b--;
        }
    }
}