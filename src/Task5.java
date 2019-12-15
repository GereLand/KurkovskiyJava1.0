import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        String a = in.nextLine();
        int b = Integer.parseInt(a);
        System.out.println(b + "*1=" + b);
        System.out.println(b + "*2=" + (b * 2));
        System.out.println(b + "*3=" + (b * 3));
        System.out.println(b + "*4=" + (b * 4));
        System.out.println(b + "*5=" + (b * 5));
        System.out.println(b + "*6=" + (b * 6));
        System.out.println(b + "*7=" + (b * 7));
        System.out.println(b + "*8=" + (b * 8));
        System.out.println(b + "*9=" + (b * 9));
        System.out.println(b + "*10=" + (b * 10));
    }
}
