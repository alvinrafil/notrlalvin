import javax.swing.JOptionPane;

public class Looping2JOptionPane {
    public static void main(String[] args) {

        String output = "Even Numbers from 2 to 100:\n";

        for (int i = 2; i <= 100; i += 2) {

            output += i + " ";

            if (i % 20 == 0) {
                output += "\n";
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
