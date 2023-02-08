import java.util.Scanner;

public class Main {
    static int time = 45;
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min-time<0) hour=(24+(hour-1))%24;
        min=(60+(min-time))%60;

        System.out.println(hour+" "+min);
    }
}
