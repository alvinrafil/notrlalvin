import java.io.*;

public class Looping1BR {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        double num, highest = 0, lowest = 0;

        for (int a = 1; a <= 10; a++) {
            System.out.print("Enter number " + a + ": ");
            num = Double.parseDouble(br.readLine());

            if (a == 1) {
                highest = num;
                lowest = num;
            } else {
                if (num > highest) {
                    highest = num;
                }

                if (num < lowest) {
                    lowest = num;
                }
            }
        }

        System.out.println("Highest Number: " + highest);
        System.out.println("Lowest Number: " + lowest);
    }
}