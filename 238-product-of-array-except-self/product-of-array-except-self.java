class Solution {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] res = new int[size];

        int leftProd = 1;
        for(int i = 0; i< size; i++){
            res[i] = leftProd;
            leftProd = leftProd * nums[i];
        }

        int rightProd = 1;
        for(int i = size - 1; i >= 0; i--){
            res[i] = res[i] * rightProd;
            rightProd = rightProd * nums[i];
        }

        return res;
    }
}