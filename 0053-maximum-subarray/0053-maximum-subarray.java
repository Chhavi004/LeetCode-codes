class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int curr = 0;
        for(int n : nums){
            curr += n;
            sum = Math.max(sum,curr);
            if(curr <0){
                curr = 0;
            }
        }
        return sum;
    }
}