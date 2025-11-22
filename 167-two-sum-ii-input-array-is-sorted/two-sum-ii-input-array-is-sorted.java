class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while(l < r){
            int sum = numbers[l] + numbers[r];
            if(sum == target){
                int[] ans = new int[]{l + 1, r +1};
                return ans;
            }
            else if(sum < target){
                l++;
            }
            else{
                r--;
            }

        }
        return new int[]{-1, -1};
    }
}