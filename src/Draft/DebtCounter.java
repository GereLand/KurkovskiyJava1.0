package Draft;

import java.text.DecimalFormat;
import java.util.Scanner;

class DebtСounter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите сумму долга: ");
        double credit = in.nextDouble();
        if (credit > 50000) {
            double procent = credit * 100 / 50000;
            double commission = ((procent - 100)/100) * (credit - 50000);
            double dolg = credit + commission;
            String x = new DecimalFormat("#0.00").format(commission);
            String y = new DecimalFormat("#0.00").format(dolg);
            System.out.println("Сумма комиссии = " + x + "₽");
            System.out.print("Сумма возврата = " + y + "₽");
        } else {
            System.out.print("Сумма долга не превышает лимит!");
        }
    }
}