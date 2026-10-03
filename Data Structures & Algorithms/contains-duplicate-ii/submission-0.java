class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> bag = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(bag.contains(nums[i])){
                return true;
            }
            bag.add(nums[i]);
            if(bag.size() > k){
                bag.remove(nums[i-k]);
            }
        }
        return false;
    }
}