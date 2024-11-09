import java.sql.SQLOutput;
import java.util.Scanner;
public class odd {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter a positive integer:");
        int num = obj.nextInt();

        System.out.println("odd numbers from 1 to" + num + " "+":");

        for(int i=1; i<=num; i++){

            if(i % 2 == 0)
                continue;

            System.out.println(i + " ");
        }
    }
}
