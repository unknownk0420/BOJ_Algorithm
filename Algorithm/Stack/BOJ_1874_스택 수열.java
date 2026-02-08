import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = 1;

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        //1부터 N까지의 수가 테스트 케이스의 값이랑 같은지 즉 짝이 되는지 확인하는 문제 -> 스택

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            if (k <= num) {//num 값이 스택에 값이 포함되지 않은 경우이므로 오름차순으로 push
                while (k <= num) {
                    stack.push(k++);
                    sb.append("+\n");
                }

                if (!stack.isEmpty() && stack.peek() == num) {
                    stack.pop();
                    sb.append("-\n");
                }
            } else {//num의 값이 스택에 값이 포함된 경우
                if (stack.peek() != num) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
                sb.append("-\n");
            }
        }
        System.out.println(sb);
    }
}
