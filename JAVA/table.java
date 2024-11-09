import java.util.Scanner;
public class table {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the size of the multiplication table");
        int num = obj.nextInt();

        for(int i = 1; i <= num; i++){
            for (int j = 1; j <= num; j++)
                System.out.print((i * j) + " ");

            System.out.println();
        }
    }
}
