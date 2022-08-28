import java.text.Format;
import java.util.Scanner;

public class mortgage_calc {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);
        int principle, period;
        double ann_rate;

        while (true) {
            System.out.print("Enter principle: ");
            principle = scanner.nextInt();
            if (principle < 1_000 || principle > 1_000_000) {
                System.out.println("Enter a number between 1,000 and 1,000,000");
                continue;
            } else
                break;
        }

        while (true) {
            System.out.print("Enter period: ");
            period = scanner.nextInt();
            if (period < 1 || period > 30) {
                System.out.println("Enter a value between 1 and 30");
                continue;
            } else
                break;
        }

        while (true) {
            System.out.print("Enter annual interest rate: ");
            ann_rate = scanner.nextDouble();
            if (ann_rate <= 0 || ann_rate > 30) {
                System.out.println("Enter a value greater than 0 or less than 30");
                continue;
            } else
                break;
        }

        double mon_rate = ann_rate / 1200;
        int n = period * 12;

        double mortgage;
        double r = Math.pow(1 + mon_rate, n);
        mortgage = (principle * (mon_rate * r)) / (r - 1);

        System.out.format("Mortgage is: $%.2f", mortgage);
    }
}