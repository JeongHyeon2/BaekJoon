import java.io.*;

import java.util.*;

public class Main{

    public static void main(String args[])  throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        Member[] arr = new Member[n];

        for (int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Member(Integer.parseInt(st.nextToken()),st.nextToken(),i);
        }

        Arrays.sort(arr);

        for (Member member:arr){
            bw.write(String.valueOf(member.age));
            bw.write(" ");
            bw.write(member.name);
            bw.write("\n");
        }

        bw.flush();
        bw.close();

    }
}
class Member implements Comparable<Member>{
    String name;
    int age,priority;
    public  Member(int age,String name,int p){
        this.name = name;
        this.age = age;
        this.priority = p;
    }

    @Override
    public int compareTo(Member member) {
        int i = this.age - member.age;
        if(i==0)
            return  this.priority-member.priority ;
        else
            return i;
    }

}