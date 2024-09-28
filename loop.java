import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;

        // While loop

        // while (counter <= range) {
        // System.out.print(counter + " ");
        // counter++;
        // }

        // for loop
        // for(counter=1; counter<range; counter++){
        // System.out.print(counter + " ");
        // }

        // Outer loop for the number of lines
        for (int line = 1; line <= 4; line++) {
            // Inner loop for printing stars
            for (int j = 1; j <= line; j++) {
                System.out.print(" *");
            }
            // Move to the next line after printing stars for the current line
            System.out.println();
        }
    }
}