import java.util.Scanner;

public class StdInandStdOutProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Integer : ");
        int i = scan.nextInt();
        System.out.println("Enter the Number : ");
        double d = scan.nextDouble();
        System.out.println("Enter the String : ");
        String s = scan.nextLine();
        s = scan.nextLine();
        scan.close();

        // Write your code here.

        System.out.println("You have entered: : " + s);
        System.out.println("You have entered: : " + d);
        System.out.println("You have entered: : " + i);
    }
}
