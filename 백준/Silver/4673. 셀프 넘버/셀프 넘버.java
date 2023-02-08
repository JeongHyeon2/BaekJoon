import java.io.*;


public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int arraySize = 10000;
        boolean [] arr = new boolean[arraySize];
        for(int i=0;i<arr.length;i++){
            int num = d(i+1);
            if(num-1<arr.length){
                arr[num-1]=true;
            }
        }
        for(int i=0;i<arr.length;i++){
            if(!arr[i]) bw.write((i+1)+"\n");
        }
        bw.flush();
        
    }
    public static int d(int num){
        int num1 = num;
        String n = String.valueOf(num);
        for(int i=0;i<n.length();i++){
            num1+=Character.getNumericValue(n.charAt(i));
        }
        return num1;
    }
}
