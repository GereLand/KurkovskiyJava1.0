import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task16 {
    public static void main(String[] args) {
    String gp1;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Task16-1.txt")))
        {
            while ((gp1 = br.readLine()) != null) {
                System.out.println(gp1);
        }
        }
    catch (IOException exc) {
        System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}