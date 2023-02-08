import java.io.*;

import java.util.*;

public class Main {

    static int count = 0;
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            bw.write(String.valueOf(isPalindrome(br.readLine())));
            bw.write(" ");
            bw.write(String.valueOf(count));
            bw.write("\n");
            count=0;
        }
        
        bw.flush();
        bw.close();

    }
    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

}

