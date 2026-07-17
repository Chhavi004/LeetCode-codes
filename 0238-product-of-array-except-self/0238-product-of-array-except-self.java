class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int left = 1;
        int right = 1;
        
        res[0] = 1;

        for(int i = n-1 ;i >= 0 ;i--){
            res[i] = right;
            right = right * nums[i];
        }
        for(int i = 0; i< n;i++){
            res[i] = res[i] * left;
            left = left * nums[i];
        }
        return res;
    }
}