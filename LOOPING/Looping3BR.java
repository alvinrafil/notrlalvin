import java.io.*;

public class Looping3BR {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double balance = 20000;
        double amount;

        for (;;) {

            System.out.print("Enter amount (0 to stop): ");
            amount = Double.parseDouble(br.readLine());

            if (amount == 0) {
                break;
            }

            if (amount > 0) {
                balance += amount;
            } else {
                if (Math.abs(amount) <= balance) {
                    balance += amount;
                } else {
                    System.out.println("INSUFFICIENT FUNDS!");
                }
            }

            System.out.printf("Outstanding Balance: P%.2f%n", balance);
        }

        System.out.printf("Final Balance: P%.2f%n", balance);
    }
}