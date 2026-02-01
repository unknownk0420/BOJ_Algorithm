import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //연속된 부분의 합 -> 슬라이딩 윈도우

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] C = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            C[i] = Integer.parseInt(st.nextToken());
        }

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += C[i];
        }

        int max = sum; // 초기 윈도우 값이 최대인 경우

        for (int i = k; i < n; i++) {
            sum += C[i];
            sum -= C[i - k];

            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}
