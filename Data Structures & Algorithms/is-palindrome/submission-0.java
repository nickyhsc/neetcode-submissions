class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.strip().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] check = cleanStr.toCharArray();
        int left = 0;
        int right = check.length - 1;

        while(left < right){
            char temp = check[left];
            check[left] = check[right];
            check[right] = temp;
            left ++;
            right --;
        }

        return new String(check).equals(cleanStr);
    }
}
