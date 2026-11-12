import java.util.Arrays; // Ini-import natin ang Arrays para magamit ang deepToString().

public class ARRAYProb1 {
    public static void main(String[] args) {

        // Gumawa tayo rito ng 2D String array na may 2 rows at 3 columns.
        String[][] seats = {
                {"Alice", "Bob", "Charlie"},
                {"David", "Emma", "Frank"}
        };

        // Kukunin natin at ipapakita ang pangalan sa second row and third column.
        System.out.println("Second row, third column: " + seats[1][2]);

        // Pinalitan natin ang pangalan na Bob ng Vacant.
        seats[0][1] = "Vacant";

        // Dito ipapakita na natin ang buong seating arrangement gamit ang deepToString().
        System.out.println("Updated Seating Arrangement: " + Arrays.deepToString(seats));
    }
}
