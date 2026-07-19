class Solution {

    List<String> ans = new ArrayList<>();
    Stack<Character> stack = new Stack<>();

    public List<String> generateParenthesis(int n) {

        backtrack(0, 0, n);

        return ans;
    }

    private void backtrack(int open, int close, int n) {

        if (stack.size() == 2 * n) {

            StringBuilder sb = new StringBuilder();

            for (char ch : stack)
                sb.append(ch);

            ans.add(sb.toString());

            return;
        }

        if (open < n) {

            stack.push('(');

            backtrack(open + 1, close, n);

            stack.pop();
        }

        if (close < open) {

            stack.push(')');

            backtrack(open, close + 1, n);

            stack.pop();
        }
    }
}