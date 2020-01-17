import java.text.DecimalFormat;
import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите свой вес: ");
        double weight = in.nextDouble();
        System.out.print("Введите свой рост: ");
        double height = in.nextDouble();
        height = height / 100;
        height = height * height;
        String fornatedDouble = new DecimalFormat("#0.0").format(weight / height);
        System.out.println("Ваш ИМТ = " + fornatedDouble);
    }
}