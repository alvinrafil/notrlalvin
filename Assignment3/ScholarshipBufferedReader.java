import java.io.*;

public class ScholarshipBufferedReader {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance exam score: ");
        double entrance = Double.parseDouble(br.readLine());

        double average = (nsat + entrance) / 2;

        if (salary > 10000 || nsat < 90 || entrance < 85) {
            System.out.println("REJECTED");
        }
        else if (salary <= 3500 && average >= 91) {
            System.out.println("ACCEPTED");
        }
        else {
            System.out.println("FOR FURTHER STUDY");
        }
    }
}