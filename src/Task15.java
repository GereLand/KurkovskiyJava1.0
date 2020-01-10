import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int y = scan.nextInt();
        int[] array = new int[y];
        for (int x = 0; x < y; ) {
            System.out.print("Введите данные в ячейку " + (x + 1) + " = ");
            array[x] = scan.nextInt();
            x++;
        }
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
            System.out.print("Отсортированный массив данных: ");
            for (int x : array) {
                System.out.print(x + " ");
            }
        }
}