import java.sql.SQLOutput;
import java.util.Scanner;

public class password {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        String password = "Akshatha@12";

        while(true) {

            System.out.print("Enter password;");
            String pass = obj.next();

            if (pass.equals(password))
            {
                System.out.println("password Accepted");
                break;
            }
            else
            {
                System.out.println("password incorrect");
            }
        }
    }
}
