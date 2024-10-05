import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Display {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        File file = new File("planes.csv");
        int num1, num2;
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        try {
            String text;
            Scanner fin = new Scanner(file);
            int i = 0;
            while (fin.hasNextLine() && i <= num2) {
                if (0 < num1 && num1 <= num2) {
                    System.out.println(fin.nextLine());
                    i++;
                }
            }
            fin.close();
        } catch (Exception e) {
            System.out.println("Cannot find logfile!\n Exiting...");
        }
    }
}