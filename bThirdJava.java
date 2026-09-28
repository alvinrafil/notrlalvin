import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class bThirdJava {

    public static void main(String[] args) {

        BufferedReader detain = new BufferedReader(new InputStreamReader(System.in));
        String name = "";
        System.out.println("Please Enter Your Name");
        try {
            name = detain.readLine();
        }catch(IOException e){
            System.out.println("Enter");}
            System.out.println("Hello" + name + "!");
    }
}
