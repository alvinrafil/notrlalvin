import java.util.Scanner;
import java.util.InputMismatchException;

public class bFifthJava {

    public static void main (String[] args) {
        String name;
        int age;
        Scanner inputDevice = new Scanner(System.in);

        try {
            System.out.print("Please Enter your Name: ");
            name = inputDevice.nextLine();

            System.out.print("PLease Enter your Age: ");
            //if the user type a text instead of a number, it shows error
            age = inputDevice.nextInt();

            //This only prints if the age was entered correctly
            System.out.print("Your Name is " + name + " and you are " + age + " years old");
        }
        catch (InputMismatchException e) {
            System.out.print("Error: age must be whole number");
            //catch the crash and display a friendly error message
        }
        finally {
            //Always run, ensuring the scanner is closed to prevent memory loss
            inputDevice.close();
        }

    }
}
