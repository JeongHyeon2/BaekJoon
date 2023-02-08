import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            time+=getTime(s.charAt(i));
        }
        bw.write(String.valueOf(time));
        bw.flush();
    }

    public static int getTime(char c) {
        if (c <= 'O')
            return 2 + (((c - 'A') / 3)+1);
        else if ('P' <= c && c <= 'S')
            return 8;
        else if ('T' <= c && c <= 'V')
            return 9;
        else
            return 10;

    }


}
