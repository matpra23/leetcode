class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int res = 0;
        int min = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == target){
                res = i;
            }
            if(target > nums[i]){
                res = i+1;
            }
        }
        return res;
    }
}
