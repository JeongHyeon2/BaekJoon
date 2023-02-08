import java.io.*;

public class Main {
    static int people = 0;

    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            int floor = Integer.parseInt(br.readLine());
            int room = Integer.parseInt(br.readLine());
            bw.write(String.valueOf(resident(floor,room)));
            bw.write("\n");
        }
        bw.flush();


    }

    public static int resident(int floor, int room) {

        int arr[][] = new int[floor + 1][room];
        for (int i = floor; i >= 0; i--) {
            arr[i][0] = 1;
        }
        for (int i = 0; i < room; i++) {
            arr[floor][i] = i + 1;

        }

        for (int i = floor - 1; i >= 0; i--) {
            for (int j = 1; j < room; j++) {
                arr[i][j] = arr[i + 1][j] + arr[i][j - 1];
            }

        }
        return arr[0][room-1];
    }

}

