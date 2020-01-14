import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        int n = in.nextInt();
        int binary = 0, y = 0;
        while (n != 0) {
            binary += ((n % 10) * Math.pow(2, y));
            n = n / 10;
            binary++;
        }
        System.out.printf("Число в десятичном формате:\n%d", binary);
    }
}