class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if(len%2!=0 || s.length()<2 || s==null) return false;

        Stack<Character> stack = new Stack<>();

        for(char ch : s.toCharArray()){
                if(ch =='(' ||ch =='{' || ch =='['){
                    stack.push(ch);

                }
                else{
                    if(stack.isEmpty()) return false;
                    char top = stack.pop();
                    if(ch=='}' && top!='{' ||
                    ch==']' && top!='[' ||
                    ch==')' && top!='(')
                    
                        return false;
                }
        } 
    // stack is clean
    return stack.isEmpty();
    }
}
