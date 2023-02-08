import java.io.*;


public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String num = br.readLine();
        String newNum = num;
        int count=0;
       do {
           if (Integer.parseInt(num) >= 10) {
               int i = num.charAt(0)-'0' + (int)num.charAt(1)-'0';
               num = ((num.charAt(1)-'0') * 10 + i%10) + "";
           } else {
               int i = num.charAt(0)-'0';
               num = ((num.charAt(0)-'0') * 10 + i%10) + "";
           }
           count++;
       }while(!newNum.equals(num));

       bw.write(count+"");
       bw.flush();
    }
}

