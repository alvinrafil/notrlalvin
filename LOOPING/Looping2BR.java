import java.io.*;

public class Looping2BR {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.println("Even Numbers from 2 to 100:");

        for (int i = 2; i <= 100; i += 2) {

            System.out.print(i + " ");

            if (i % 20 == 0) {
                System.out.println();
            }
        }
    }
}
