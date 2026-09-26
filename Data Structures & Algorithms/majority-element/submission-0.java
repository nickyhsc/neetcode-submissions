class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> elements = new HashMap<>();
        for(int num : nums){
            if(elements.containsKey(num)){
                elements.put(num, elements.get(num)+1);
            }else{
                elements.put(num, 1);
            }
        }
        int highestVal = 0;
        int highestKey = nums[0];
        for(Map.Entry<Integer, Integer> curr : elements.entrySet()){
            if(curr.getValue() > highestVal){
                highestVal = curr.getValue();
                highestKey = curr.getKey();
            }
        }
        return highestKey;
    }
}