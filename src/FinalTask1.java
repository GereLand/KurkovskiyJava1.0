import java.util.Scanner;

public class FinalTask1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String binary = in.nextLine();
        int x = binary;
//        int x = Integer.parseInt(binary, 2);
        System.out.println(x);
    }
}
// Не забыть дописать исключения