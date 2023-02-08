import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < num; i++) {
            int idx = 0, min = arr[i];
            for (int j = i; j < num; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    idx = j;
                }
            }
            if (idx != 0) {
                int temp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = temp;
            }
        }
        for (int i = 0; i < num; i++) {
            bw.write(String.valueOf(arr[i]));
            bw.write("\n");
        }
        bw.flush();
    }
}
