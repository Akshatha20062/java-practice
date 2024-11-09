import java.util.Scanner;

public class Biodata {
    public static void main(String[] args) {
        Scanner bio = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = bio.nextLine();
        System.out.println("Enter the age:");
        int age = bio.nextInt();
        System.out.println("Enter the height");
        float height = bio.nextFloat();
        System.out.println("Enter the ph no:");
        long ph_no = bio.nextLong();
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("height:" + height);
        System.out.println("phone no:" + ph_no);
    }
}
