class Solution {
    public int maxSubArray(int[] nums) {
        int curr = 0;
        int sum = nums[0];
        for(int num : nums){
            curr += num;
            sum = Math.max(sum,curr);
            if(curr < 0){
                curr = 0;
            }
        }
        return sum;      

    }
}