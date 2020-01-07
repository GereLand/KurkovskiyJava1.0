import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Размер массива = ");
        int x = scan.nextInt();
        int[] mas = new int[x];
        for (int y = 0; y < x;) {
            System.out.print("Массив 1 = ");
            mas[y] = scan.nextInt();
            y++;
        }
        for (int m: mas) {
            System.out.println(m*2);
        }
    }
}