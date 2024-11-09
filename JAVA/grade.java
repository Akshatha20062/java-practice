chithimport java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter the Marks:");
        int marks = obj.nextInt();

        if(marks >= 90)
            System.out.println("Grade:A");
        else if(marks >=70 && marks <= 89)
            System.out.println("Grade:B");
        else if(marks >= 50 && marks <= 69)
            System.out.println("Grade:C");
        else
            System.out.println("Fail");
    }
}