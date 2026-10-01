class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length == 0) return 0;

        int curr=0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] != nums[curr]){
                curr++;
                nums[curr] = nums[i];
            }
        }
        return curr+1;
    }
}