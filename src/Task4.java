import java.util.Scanner;

public class Task4 {
    public static void main (String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input binary: ");
        String binary = in.nextLine();
        int x = Integer.parseInt(binary,2);
        System.out.println(x);
    }
}