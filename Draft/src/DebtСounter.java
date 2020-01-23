import java.text.DecimalFormat;
import java.util.Scanner;

public class DebtСounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму долга: ");
        double credit = in.nextDouble();
        if (credit > 100) {
            double procent = credit * 100 / 50000;
            String commission = new DecimalFormat("#0.00").format(((procent - 100)/100) * (credit - 50000));
            System.out.println("Сумма комиссии = " + commission + "₽");
            String dolg = new DecimalFormat("#0.00").format(credit + commission);
            System.out.print("Сумма возврата = " + dolg + "₽");
        } else {
            System.out.print("Сумма долга не превышает лимит.");
        }
    }
}