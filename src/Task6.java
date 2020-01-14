import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("X=");
        int x = scan.nextInt();
        System.out.print("Y=");
        int y = scan.nextInt();
        System.out.print("Z=");
        int z = scan.nextInt();
        double sum = (x + y + z)/3.0;
        System.out.println("Sum: " + sum);
        double sum2 = sum/2;
        if(sum2 > 3)
            System.out.println("Программа выполнена корректно");
        }
}