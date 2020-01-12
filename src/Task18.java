import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String allGP1;
        try (BufferedReader br = new BufferedReader(new FileReader("src/Task18-1.txt")))
        {
            while ((allGP1 = br.readLine()) != null) {
//                int len1 = allGP1.length();
//                System.out.println(len1);
                System.out.println(allGP1);
            }
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода: " + exc);
        }
//        String text;
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Для завершения ввода текст введите слово 'Флюгегехаймен' ");
//        System.out.println("Можете начать ввод текста: ");
//        try (FileWriter fw = new FileWriter("Task17-1.txt")) {
//            do {
//                System.out.print("- ");
//                text = br.readLine ();
//                if (text.compareTo("Флюгегехаймен") == 0) break;
//                text = text + "\r\n";
//                fw.write(text);
//            }
//            while(text.compareTo("Флюгегехаймен") != 0);
//        }
//        catch (IOException exc) {
//            System.out.println("Ошибка ввода-вывода: " + exc);
//        }

        try (FileInputStream allGP2 = new FileInputStream("src/Task18-1.txt");
             FileOutputStream gpnew = new FileOutputStream("src/Task18-2.txt")) {
            byte[] buffer = new byte[allGP2.available()];
            allGP2.read(buffer, 0, buffer.length);
            gpnew.write(buffer, 0, buffer.length);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}