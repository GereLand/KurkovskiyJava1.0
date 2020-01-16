import java.text.DecimalFormat;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой вес: ");
        double a = in.nextDouble();
        System.out.print("Введите свой рост: ");
        double b = in.nextDouble();
        b = b / 100;
        b = b * b;
        String fornatedDouble = new DecimalFormat("#0.0").format(a / b);
        System.out.println("Ваш ИМТ = " + fornatedDouble);
    }
}