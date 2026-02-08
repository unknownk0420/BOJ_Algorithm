import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int k = Integer.parseInt(st.nextToken());

        //가장 최근(스택의 peek() 메서드)에 쓴 수를 지운다(스택의 pop() 메서드). -> 스택
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());

            if (number != 0) {
                stack.push(number);
            }

            if (!stack.isEmpty() && number == 0) {
                stack.pop();
            }
        }

        int sum = 0;

        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }

        System.out.println(sum);
    }
}
