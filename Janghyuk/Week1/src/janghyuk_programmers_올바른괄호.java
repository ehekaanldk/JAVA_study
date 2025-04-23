import java.util.Stack;

class janghyuk_programmers {
    public boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                stack.push(c);
            }

            else if (c == ')') {
                // 닫는 괄호가 나왔는데 스택이 비어 있다면 짝이 안 맞는거
                if (stack.isEmpty()) {
                    return false;
                }

                stack.pop(); // 비어있지 않고 C == ')' 라면 스택안에 '(' 가있는 것이기 때문에 '('를 POP 해줌
            }
        }


        // 모든 괄호 처리 후, 스택이 비어있다면 올바른 괄호
        return stack.isEmpty();
    }
}