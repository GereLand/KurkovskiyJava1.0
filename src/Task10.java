import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы = ");
        int x = scan.nextInt();
        System.out.print("Введите количество столбцов матрицы = ");
        int y = scan.nextInt();
        int[][] array = new int[x][y];
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                {
                    System.out.print("Введите данные в ячейку " + (a+1) + "." + (b+1) + " = ");
                    array[a][b] = scan.nextInt();
                }
            }
        }
        for (int j = 0; j < y; j++) {
            System.out.println(array[0][j] * 3);
        }
    }
}