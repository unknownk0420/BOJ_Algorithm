import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        Stack<Integer> stack = new Stack<>();
        //스택의 명령어를 묻는 문제 -> 스택

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            if (s.equals("push")) {
                int element = Integer.parseInt(st.nextToken());
                stack.push(element);
            } else if (s.equals("pop")) {
                System.out.println(stack.isEmpty() ? -1 : stack.pop());
            } else if (s.equals("size")) {
                System.out.println(stack.size());
            } else if (s.equals("empty")) {
                System.out.println(stack.isEmpty() ? 1 : 0);
            } else {
                System.out.println(stack.isEmpty() ? -1 : stack.peek());
            }
        }
    }
}
