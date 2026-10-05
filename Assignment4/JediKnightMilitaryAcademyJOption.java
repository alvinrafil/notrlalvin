import javax.swing.JOptionPane;

public class JediKnightMilitaryAcademyJOption {
    public static void main(String[] args) {

        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height in cm:")
        );

        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:")
        );

        char citizenship = JOptionPane.showInputDialog(
                "Enter citizenship code (C/N):"
        ).charAt(0);

        char recommendee = JOptionPane.showInputDialog(
                "Enter recommendee code (R/N):"
        ).charAt(0);

        if (recommendee == 'R' ||
                (height >= 200 && age >= 21 && age <= 25 && citizenship == 'C')) {

            JOptionPane.showMessageDialog(null, "ACCEPTED");
        } else {
            JOptionPane.showMessageDialog(null, "REJECTED");
        }
    }
}