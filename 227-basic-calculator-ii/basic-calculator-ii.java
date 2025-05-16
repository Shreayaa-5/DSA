class Solution {
    public int calculate(String s) {
        Stack<Integer> ss = new Stack<>();
        char prevsign = '+';
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            }

            if (isOperator(c) || i == s.length() - 1) {
                if (prevsign == '+') {
                    ss.push(num);
                } else if (prevsign == '-') {
                    ss.push(-num);
                } else if (prevsign == '*') {
                    ss.push(ss.pop() * num);
                } else if (prevsign == '/') {
                    ss.push(ss.pop() / num);
                }

                num = 0;
                prevsign = c;
            }
        }

        int result = 0;
        while (!ss.isEmpty()) {
            result += ss.pop();
        }
        return result;
    }

    // Move this method outside calculate()
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
