import java.util.Scanner;
public class farenheit{
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.print("Enter the temperature in Farenheit:");
                double farenheit = num.nextDouble();
                double celsius = (farenheit -32)*5/9;
        System.out.printf("celsius:%.2f",celsius);
    }
}
