import java.io.*;

import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] origin = new int[n];	// 원본 배열
        int[] sorted = new int[n];	// 정렬 할 배열
        HashMap<Integer, Integer> rankingMap = new HashMap<>();	// rank

        for(int i=0;i<n;i++){
            origin[i] = Integer.parseInt(st.nextToken());
            sorted[i]=origin[i];
        }
        Arrays.sort(sorted);

        int rank = 0;
        for(int value : sorted){
            if(!rankingMap.containsKey(value)){
                rankingMap.put(value,rank++);
            }
        }
        for(int key : origin){
            bw.write(String.valueOf(rankingMap.get(key)));
            bw.write(" ");
        }


        bw.flush();
        bw.close();

    }

}

