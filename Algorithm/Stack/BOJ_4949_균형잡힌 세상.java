import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //짝을 이루는 경우의 문제 -> 스택
        
        while (true) {

            String s = br.readLine();
            boolean isValid = true;

            Stack<Character> stack = new Stack<>();

            if (s.equals(".")) {
                break;
            }

            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);

                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')'){
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        isValid = false;
                        break;
                    }
                    stack.pop();
                }
            }
            System.out.println(stack.isEmpty() && isValid ? "yes" : "no");
        }
    }
}
