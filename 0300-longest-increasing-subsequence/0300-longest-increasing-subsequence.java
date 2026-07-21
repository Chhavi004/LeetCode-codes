class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];

        for( int i=1;i<n;i++){
            for(int j = 0;j<i;j++){
                if(nums[j] < nums[i] && dp[i] <= dp[j]){
                    dp[i] = dp[j]+1;
                }
            }
        }
        Arrays.sort(dp);
        return dp[n-1] + 1;
    }
}