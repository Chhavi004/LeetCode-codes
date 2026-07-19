class Solution {
    List<String> ans = new ArrayList<>();
    Stack<Character> stack = new Stack<>();    
    public List<String> generateParenthesis(int n) {
        backtracking(0,0,n);
        return ans;        
    }
    public void backtracking(int open,int close,int n){
        if(stack.size() == 2*n){
            StringBuilder sb = new StringBuilder();
            for(char ch : stack){
                sb.append(ch);
            }
            ans.add(sb.toString());
            return;

        }
        if(open < n){
            stack.push('(');
            backtracking(open+1,close,n);
            stack.pop();
        }
        if(close < open){
            stack.push(')');
            backtracking(open,close+1,n);
            stack.pop();
        }
    }
}