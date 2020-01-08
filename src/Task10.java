import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Количество строк матрицы = ");
        int x = scan.nextInt();
        System.out.print("Количество столбцов матрицы = ");
        int y = scan.nextInt();
        int[][] massiv = new int[x][y];
        int c = 1;
        int e = 1;
        for (int a = 0; a < x; a++) {
            for (int b = 0; b < y; b++) {
                {
                    System.out.print("Ячейка " + c + "." + e + " = ");
                    massiv [a][b] = scan.nextInt();
                }
                e++;
            }
            e = 1;
            c++;
        }
        for (int j = 0; j < y; j++) {
            System.out.println(massiv[0][j] * 3);
        }
    }
}