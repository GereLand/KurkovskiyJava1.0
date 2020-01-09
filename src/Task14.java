import java.util.Scanner;

public class Task14 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите числовую переменную: ");
        String s = scan.nextLine();
        int x = 0;
        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}