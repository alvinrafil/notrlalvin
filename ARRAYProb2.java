public class ARRAYProb2 {
    public static void main(String[] args) {

        // Gumawa tayo ng array na may 5 elements.
        double[] temperatures = new double[5];

        // Maglagay tayo sa temperatures ng 0 to 4 sa bawat index ng array natin.
        temperatures[0] = 32.5;
        temperatures[1] = 34.0;
        temperatures[2] = 31.8;
        temperatures[3] = 33.2;
        temperatures[4] = 35.1;

        System.out.println("Original Temperatures:");

        // Gumamit tayo ng for loop para maipakita ang lahat ng temperatures.
        for (int i = 0; i < temperatures.length; i++) {

            // Ipapakita natin rito ang temperatures sa bawat index.
            System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
        }

        // Ina-update natin ang temperature sa third day mula 31.8 papuntang 32.0.
        temperatures[2] = 32.0;

        // Updated na ang temperature sa third day.
        System.out.println("Updated Temperature for Third Day: " + temperatures[2]);
    }
}
