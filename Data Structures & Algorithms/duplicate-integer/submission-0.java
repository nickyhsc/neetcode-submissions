class Solution {
    public boolean hasDuplicate(int[] nums) {
        Hashtable<Integer, Integer> duplicate = new Hashtable<>();

        for(int i=0; i<nums.length; i++){
            int currNum = nums[i];
            if(duplicate.containsKey(currNum)){
                return true;
            }else{
                duplicate.put(currNum, 1);
            }
        }
        return false;
    }
}