import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int sum = 0;
        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        Arrays.sort(arr);
        String s = String.format("%.0f", sum / (double) num);
        if(s.equals("-0")){
            bw.write("0");
        }else{
            bw.write(s);
        }
        bw.write("\n");
        bw.write(String.valueOf(arr[num / 2]));
        bw.write("\n");

        Count [] countArr = new Count[num];
        int cntNum = arr[0];
        int idx=0;
        countArr[0] = new Count(arr[0],0);
        for(int i=0;i<num;i++){
            if(cntNum!=arr[i]) {
                idx++;
                countArr[idx] = new Count(arr[i],0);
                countArr[idx].countP();
            }else{
                countArr[idx].countP();
            }
            cntNum=arr[i];
        }
        int max = 0;
        int index=0;
        for(int i=0;i<idx+1;i++){
            if(max<countArr[i].getCount()) {
                max = countArr[i].getCount();
                index=i;
            }
        }

        int count = 0;
        for(int i=0;i<idx+1;i++){
            if(max == countArr[i].getCount()) count++;
        }

        if(count==1){
            bw.write(String.valueOf(countArr[index].getNum()));
        }else{
            int j=0;
           for(int i=0;i<idx+1;i++){
               if(max==countArr[i].getCount()) {
                   j++;
                   if(j==2){
                       bw.write(String.valueOf(countArr[i].getNum()));
                       break;
                   }
               }
           }
        }

        bw.write("\n");
        bw.write(String.valueOf(arr[arr.length - 1] - arr[0]));
        bw.flush();
    }
}
class Count{

    public void countP(){
        count++;
    }
    public int getNum(){
        return num;
    }
    public int getCount(){
        return count;
    }

    public Count(int num, int count) {
        this.num = num;
        this.count = count;
    }

    private int num;
    private int count;
}
