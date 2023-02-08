import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        Person arr[] = new Person[num];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i] = new Person(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }
        for (int i = 0; i < arr.length; i++) {
            int rank = 1;
            for (int j = 0; j < arr.length; j++) {
                if (compare(arr[i], arr[j]) == 1) rank++;
            }
            bw.write(String.valueOf(rank));
            bw.write(" ");
        }
        bw.flush();

    }

    static int compare(Person p1, Person p2) {
        if (p1.getHeight() < p2.getHeight() && p1.getWeight() < p2.getWeight()) return 1;
        else return 0;
    }
}

class Person {
    private int height;
    private int weight;

    public Person(int w, int h) {
        height = h;
        weight = w;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

}