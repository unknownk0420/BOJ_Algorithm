import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        //짝을 지어서 제거 -> 스택

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String p = st.nextToken();
            boolean isValid = true;

            Stack<Character> stack = new Stack<>();

            for (int j = 0; j < p.length(); j++) {
                char c = p.charAt(j);

                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        isValid = false;
                        break;
                    } else {
                        stack.pop();
                    }
                }
            }
            if (stack.isEmpty() && isValid) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
