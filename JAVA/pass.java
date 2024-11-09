import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter The Mark:");
        int marks = obj.nextInt();

        if(marks  >=50)
            System.out.println("Pass");
        else
            System.out.println("fail");
    }

}
