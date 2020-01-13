import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String allGP1;
        int st = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Task18-1.txt")))
        {
            while ((allGP1 = br.readLine()) != null, st++) {
                System.out.println(allGP1);
            }
            System.out.println(st)
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        String text;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения ввода текст введите слово 'Флюгегехаймен' ");
        System.out.println("Можете начать ввод текста: ");
        for (int fin = st) //Составить цикл с количеством строк
        try (FileWriter fw = new FileWriter("src/Task18-1.txt")) {
            do {
                System.out.print("- ");
                text = br.readLine ();
                if (text.compareTo("Флюгегехаймен") == 0) break;
                text = text + "\r\n";
                fw.write(text);
            }
            while(text.compareTo("Флюгегехаймен") != 0);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
        }
    }
}