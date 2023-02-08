import java.io.*;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        Coordinate [] arr = new Coordinate[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Coordinate(Integer.parseInt(st.nextToken()),Integer.parseInt(st.nextToken()));

        }

        Arrays.sort(arr);
        for (Coordinate coordinate:arr){
            bw.write(String.valueOf(coordinate.x+" "+ coordinate.y));
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }

}
class Coordinate implements Comparable<Coordinate>{
    public Coordinate(int x, int y){
        this.x = x;
        this.y = y;
    }
    int x;
    int y;

    @Override
    public int compareTo(Coordinate coordinate) {
        if(this.y>coordinate.y){
            return 1;
        }else if(this.y == coordinate.y){
            if(this.x>coordinate.x) return 1;
            else if(this.x<coordinate.x) return -1;
            else return 0;
        }
        else return -1;
    }
}



