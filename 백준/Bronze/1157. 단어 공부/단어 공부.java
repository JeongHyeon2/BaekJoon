import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String s = br.readLine().toUpperCase();
        int [] alphabetCount =new int[26];
        for(int i=0;i<s.length();i++){
            alphabetCount[s.charAt(i)-'A']++;
        }
        int max=0;
        int index=0;
        boolean flag = false;
        for(int i=0;i<alphabetCount.length;i++){
            if(alphabetCount[i]>max) {
                max=alphabetCount[i];
                index=i;
                flag=false;
            }
            else if(alphabetCount[i]==max){
                flag=true;
            }
        }
        if(flag) bw.write("?");
        else bw.write(String.valueOf((char)(index+'A')));
        bw.flush();

    }
}