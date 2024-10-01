import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int range = sc.nextInt();
        // int counter = 1;

        // While loop

        // while (counter <= range) {
        //     System.out.print(counter + " ");
        //     counter++;
        // }

        // for loop
        // for(counter=1; counter<range; counter++){
        //     System.out.print(counter + " ");
        // }

        // for(int line=1; line<=4; line++){
        //     for (int j=1; j<4; j++){
        //         System.err.println("****");
        //     }
        // }


        //  Sum of n NAtural numbers
//         int n= sc.nextInt();
//         int i =1;
//         int sum = 0;
//          while (i<=n) {
//             sum += i;
//             i++;
            
//          }
// System.out.println(sum);

// Reverse Of a NUMMBER
int n = sc.nextInt();


while (n > 0) {
    int last = n%10;
    System.out.print(last);
    n = n/10;
    
}
System.out.print(n);
    }
}