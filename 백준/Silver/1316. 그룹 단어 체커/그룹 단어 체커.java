import java.io.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int count = 0;
        
        for (int i = 0; i < num; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) count++;
        }
        bw.write(String.valueOf(count));
        bw.flush();
    }

    public static boolean isGroupWord(String word) {
        String s = removeDuplication(word);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) return false;
            }
        }
        return true;
    }

    public static String removeDuplication(String word) {
        String s = word;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j--))
                    s = s.replaceFirst(s.charAt(i) + "", "");
                else
                    break;
            }
        }
        return s;
    }


}
