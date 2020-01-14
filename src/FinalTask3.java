import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество рублей: ");
        double r = scanner.nextDouble();
        System.out.println("Введите курс доллара в рублях): ");
        double c = scanner.nextDouble();
        double result = convertRubToUsd(r, c);
        System.out.println(r + " рублей = " + (double) Math.round(result * 100d) / 100d + " $ США");
    }
    public static double convertRubToUsd(double rub, double course) {
        return rub / course;
    }
}
