class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] array1 = word1.toCharArray();
        char[] array2 = word2.toCharArray();
        char[] merge = new char[array1.length + array2.length];
        int counts = 0;
        if(array1.length >= array2.length){
            counts = array1.length;
        }else{
            counts = array2.length;
        }
        int k = 0;
        for(int i=0; i<counts; i++){
            if(i<array1.length && i<array2.length){
                merge[k++] = array1[i];
                merge[k++] = array2[i];
            }else if(i<array1.length){
                merge[k++] = array1[i];
            }else{
                merge[k++] = array2[i];
            }

        }
        return new String(merge);
    }
}