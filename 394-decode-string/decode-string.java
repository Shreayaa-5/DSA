class Solution {
    public String decodeString(String s) {
        Stack<Integer> number = new Stack<>();
        Stack<String> str = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                // Handle multi-digit numbers
                int num = 0;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                }
                number.push(num);
                i--; 
            } else if (s.charAt(i) == '[') {
                str.push("[");
            } else if (Character.isLetter(s.charAt(i))) {
                str.push(s.charAt(i) + "");
            } else if (s.charAt(i) == ']') {
                
                StringBuilder sl = new StringBuilder();
                while (!str.peek().equals("[")) {
                    sl.insert(0, str.pop());
                }
                str.pop(); 
                int repeat = number.pop();
                String repeated = sl.toString().repeat(repeat);
                str.push(repeated);
            }
        }

        
        StringBuilder result = new StringBuilder();
        while (!str.isEmpty()) {
            result.insert(0, str.pop());
        }
        return result.toString();
    }
}
