import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number = ");
        int number = scan.nextInt();
        int X = 5;
        int Y = 10;
        int Z = 15;
        if (number == X)
            System.out.println("Данное значение имеется в константах");
        else if (number == Y)
            System.out.println("Данное значение имеется в константах");
        else if (number == Z)
            System.out.println("Данное значение имеется в константах");
        else System.out.println("Такой константы нет!");
    }
}