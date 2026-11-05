import javax.swing.JOptionPane;

public class Looping1JOptionPane {
    public static void main(String[] args) {

        double num, highest = 0, lowest = 0;

        for (int i = 1; i <= 10; i++) {

            num = Double.parseDouble(
                    JOptionPane.showInputDialog(
                            "Enter number " + i + ":"));

            if (i == 1) {
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

        JOptionPane.showMessageDialog(null,
                "Highest Number: " + highest +
                        "\nLowest Number: " + lowest);
    }
}
