/*How to take input  
Java uses the Scanner class for input.
*/

import java.util.Scanner; 

public class P05_Input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the problem number: ");

        int problems = sc.nextInt();

        System.out.println("You solved " + problems + " problems.");

        //Multiple Input types
        System.out.print("enter accuracy percentage: ");
        float accuracy=sc.nextFloat();

        System.out.print("enter platform name:");
        String platform=sc.next();

        System.out.println("Accuracy: "+accuracy);
        System.out.println("Platform: "+platform);

        //Practice
        //1.Takes Username
        System.out.print("Enter name: ");
        String name=sc.next();
        System.out.println("Hello "+ name);
        sc.close();
    }
}