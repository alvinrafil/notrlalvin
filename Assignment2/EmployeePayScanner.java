import java.util.Scanner;

public class EmployeePayScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hourly pay rate: ");
        double rate = sc.nextDouble();

        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

        double grossPay = rate * hours;
        double taxRate;

        if (grossPay <= 2000) {
            taxRate = 0.10;
        } else if (grossPay <= 4000) {
            taxRate = 0.12;
        } else if (grossPay <= 10000) {
            taxRate = 0.15;
        } else {
            taxRate = 0.20;
        }

        double withholdingTax = grossPay * taxRate;
        double netPay = grossPay - withholdingTax;

        System.out.println("\nGross Pay: Php " + grossPay);
        System.out.println("Withholding Tax: Php " + withholdingTax);
        System.out.println("Net Pay: Php " + netPay);

        sc.close();
    }
}