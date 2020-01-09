import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст строки: ");
        String string2 = scan.nextLine();
        System.out.println(string2.replaceAll(" ", ""));
    }
}