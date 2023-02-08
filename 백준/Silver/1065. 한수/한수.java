import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int count=0;
        for(int i=1;i<=num;i++){
            if(isHanNumber(i)) count++;

        }
        bw.write(count+"");
        bw.flush();
    }
    static boolean isHanNumber(int num){
        String number = num+"";
        if(number.length()<3) return true;
        for(int i=0;i<number.length()-2;i++){
            if(number.charAt(i)-number.charAt(i+1) == number.charAt(i+1)-number.charAt(i+2)){
                return true;
            }
            else return false;
        }
        return false;
    }

}
