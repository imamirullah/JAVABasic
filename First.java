import java.util.*;
// public class First {
//     public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int sum = a + b;
//        System.out.println(sum);
//     }
// }

// public class First {
//     public static void main(String[] args) {
// Scanner sc = new Scanner(System.in); // Corrected 'Scan' to 'Scanner'
// String input = sc.next();
// System.out.println(input); // Added a line to print the input
// sc.close(); // It's a good practice to close the scanner

// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// int b = sc.nextInt();
// int res = a * b ;
// System.out.println(res);

// float b = 20.61526f;
// int a = (int)b;
// System.out.println(a);

//         Scanner customer = new Scanner(System.in);
//         int a = customer.nextInt();
//         int b = customer.nextInt();
//         int c = customer.nextInt();

//         int bill = a + b + c;
//         double gst = bill * 0.18;
//         double total = bill + gst;
//         System.out.println("Total Bill " +   total);
//     }
// }

// OPERATORS
public class First {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;
        if (income > 500000) {
            tax = 0;
        } else if (income <= 500000 && income < 100000) {
            tax = (int) (income * 0.2);
        } else {
            tax = (int) (income * 0.3);
        }
        System.out.println("tax is" + tax);
    }
}