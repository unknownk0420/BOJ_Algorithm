import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String p = st.nextToken();
        int count = 0;

        //레이저는 짝을 이루는 괄호가 되야 하므로 스택 자료구조를 활용하는 문제 -> 스택
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < p.length(); i++) {
            char c = p.charAt(i);

            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
                if (p.charAt(i - 1) == '(') {//닫힌 괄호일 때 전 문자가 '('인 경우 즉 레이저인 경우
                    count += stack.size();//스택에는 현재 열려 있는 막대기 수가 들어 있음
                } else {//막대 끝에서 마지막 조각 1개
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
