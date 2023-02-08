import java.io.*;

import java.util.*;

public class Main{

    public static void main(String args[])  throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        ArrayList<Word> arr = new ArrayList<>();

        for (int i=0; i<n; i++) 
           arr.add(new Word(br.readLine()));
        
        Collections.sort(arr);

        // 중복 제거
        for(int i=0, j =0;i<n-1;i++,j++){
            if(arr.get(j).word.equals(arr.get(j+1).word)){
                arr.remove(j);
                j--;
            }
        }
        
        for (Word word:arr){
            bw.write(word.word);
            bw.write("\n");
        }
        bw.flush();
        bw.close();

    }
}
class Word implements Comparable<Word>{
    String word;
    public  Word(String s){
        this.word = s;
    }

    @Override
    public int compareTo(Word anotherWord) {
        int i = this.word.length()-anotherWord.word.length();
      if(i==0) {
          return word.compareTo(anotherWord.word);
      }else{
          return i;
      }
    }
}