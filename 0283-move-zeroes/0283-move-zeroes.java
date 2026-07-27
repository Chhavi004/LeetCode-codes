class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int move = 0;
        
        for(int i = 0;i<n;i++){
            if(nums[i] != 0){
                nums[move] = nums[i]; 
                move++;
            }
        }
        while( move < n){
            nums[move++] = 0;
        }
    }
}