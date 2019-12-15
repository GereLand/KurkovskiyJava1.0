import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        String a = in.nextLine();
        System.out.print("Input b: ");
        String b = in.nextLine();
        int c = Integer.parseInt(a);
        int d = Integer.parseInt(b);
        int x = c * d;
        System.out.println(x);
    }
}
