import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество рублей: ");
        double r = scanner.nextDouble();
        System.out.print("Введите курс доллара в рублях: ");
        double c = scanner.nextDouble();
        double result = convertRubToUsd(r, c);
        System.out.println(r + " рублей = " + (double) Math.round(result * 100d) / 100d + " $");
    }
    public static double convertRubToUsd(double rub, double course) {
        return rub / course;
    }
}