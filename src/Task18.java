import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String allGP1;
        int st = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Task18-1.txt"))) {
            while ((allGP1 = br.readLine()) != null) {
                System.out.println(allGP1);
                st++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        String text;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите изменения для вышеуказанного текста: ");
        int y = 1;
        try (FileWriter fw = new FileWriter("src/Task18-1.txt")) {
            for (int fin = 0; fin < st; fin++) {
                System.out.print(y + "- ");
                text = br.readLine();
                fw.write(text + "\r\n");
                y++;
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        String gpnew;
        try (BufferedReader br2 = new BufferedReader(new FileReader("src/Task18-1.txt"))) {
            while ((gpnew = br2.readLine()) != null) {
                System.out.println(gpnew);
            }
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
    }
}