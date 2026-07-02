class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curr = 0;
        for(int num : nums){
            curr += num;
            maxSum = Math.max(maxSum , curr);
            if(curr < 0){
                curr = 0;
            }
        }
        return maxSum;


    }
}