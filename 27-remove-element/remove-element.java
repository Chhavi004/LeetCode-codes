class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for(int read = 0;read < nums.length;read++){
            if(nums[read] != val ){
                nums[k] = nums[read];
                k++;
            }
        }

        return k;

    }
}