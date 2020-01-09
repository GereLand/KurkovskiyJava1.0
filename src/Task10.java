import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите количество строк матрицы = ");
        int x = scan.nextInt();
        System.out.print("Введите количество столбцов матрицы = ");
        int y = scan.nextInt();
        int[][] array = new int[x][y];
        int c = 1;
        int e = 1;
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                {
                    System.out.print("Введите данные в ячейку " + c + "." + e + " = ");
                    array[a][b] = scan.nextInt();
                }
                e++;
            }
            e = 1;
            c++;
        }
        for (int j = 0; j < y; j++) {
            System.out.println(array[0][j] * 3);
        }
    }
}