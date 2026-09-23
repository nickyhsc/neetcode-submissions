class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> left = new HashMap<>();
        int[] output = new int[2];

        for(int i=0; i<nums.length; i++){
            int gap = target - nums[i];
            if(left.containsKey(gap)){
                output[0] = left.get(gap);
                output[1] = i;
            }
            left.put(nums[i], i);
        }
        return output;
    }
}
