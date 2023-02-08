import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int caseNum = Integer.parseInt(br.readLine());

        for(int i=0;i<caseNum;i++){
            st = new StringTokenizer(br.readLine());
            int studentNum = Integer.parseInt(st.nextToken());
            int [] arr = new int[studentNum];
            int totalSum=0;
            for(int j=0;j<studentNum;j++){
                arr[j]=Integer.parseInt(st.nextToken());
                totalSum+=arr[j];
            }
            int overAvgStudentNum=0;
            double avg = totalSum/studentNum;
            for(int j=0;j<studentNum;j++){
                if(avg<arr[j]) overAvgStudentNum++;
            }
            double rate = ((double)overAvgStudentNum/(double)studentNum)*100;
            bw.write(String.format("%.3f",rate));
            bw.write("%\n");
        }
        bw.flush();

    }
}

