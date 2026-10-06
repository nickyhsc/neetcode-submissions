class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        if(s.length()%2 != 0) return false;

        Stack<Character> elements = new Stack<>();
        for(char c:s.toCharArray()){
            if(c == '('){
                elements.push(')');
            }else if(c == '{'){
                elements.push('}');
            }else if(c == '['){
                elements.push(']');
            }else{
                if(elements.isEmpty() || elements.pop() != c) return false;
            }
        }
        return elements.isEmpty();
    }
}
