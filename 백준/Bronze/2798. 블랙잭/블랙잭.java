import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cardNum = Integer.parseInt(st.nextToken());
        int num = Integer.parseInt(st.nextToken());
        int[] arr = new int[cardNum];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < cardNum; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int answer = 0;
        Loop:
        for (int i = 0; i < cardNum; i++) {
            for (int j = i + 1; j < cardNum; j++) {
                for (int k = j + 1; k < cardNum; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if(sum<=num) {
                        if (sum == num) {
                            answer = num;
                            break Loop;
                        }
                        if (sum > answer) answer = sum;
                    }
                }
            }
        }
        bw.write(String.valueOf(answer));
        bw.flush();

    }


}