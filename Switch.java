import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int number = 10;
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        if (range <= 10) {
            switch (number) {
                case 2:
                    System.out.println("samosa");
                    break;
                case 10:
                    System.out.println("apple");
                    break;
                case 13:
                    System.out.println("apple");
                    break;
                default:
                    System.out.println("kch ni bhai");
                    break;
            }
        }
        else{
            System.out.println("ku print kru");
        }
    }
}