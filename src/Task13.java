import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст первой строки: ");
        String string1 = scan.nextLine();
        int len1 = string1.length();
        System.out.print("Введите текст второй строки: ");
        String string2 = scan.nextLine();
        int len2 = string2.length();
        if (len1 > len2) {
            System.out.print(string1);
        }
        else if (len1 < len2) {
            System.out.print(string2);
        }
        else {
            System.out.print("Введённые строки равны");
        }
    }
}