import java.io.*;

public class Task17 {
    public static void main(String[] args) {
        String text;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Для завершения ввода текст введите слово 'Флюгегехаймен' ");
        System.out.println("Можете начать ввод текста: ");
        try (FileWriter fw = new FileWriter("Task17-1.txt")) {
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