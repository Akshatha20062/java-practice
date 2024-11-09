import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the level for star pyramid");
        int num = obj.nextInt();

        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


