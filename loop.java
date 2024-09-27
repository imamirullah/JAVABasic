import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int counter = 1;

        // While loop

        while (counter <= range) {
            System.out.print(counter + " ");
            counter++;
        }
    }
}