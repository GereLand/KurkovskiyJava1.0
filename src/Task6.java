import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("X=");
        int x = scan.nextInt();
        System.out.println("Y=");
        int y = scan.nextInt();
        System.out.println("Z=");
        int z = scan.nextInt();
        int sum = (x + y + z)/3;
        System.out.print("Sum: " + sum);
    }
}