import java.util.*;

public class PrimitiveDataTypes {
	
    public static void main(String []argh)
    {  
       Scanner sc = new Scanner(System.in);
              int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
           
            {
                    try
            {
                long x=sc.nextLong();
                if (x == 0 || x == 1) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* boolean");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                continue;
            } else if (x == (byte)x) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                continue;
            }
              else if (x == (short)x) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
                continue;
            } else if (x == (int)x) {
                System.out.println(x + " can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
                continue;
            } else {
                System.out.println(x + " can be fitted in:");
                System.out.println("* long");
                continue;
            }
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
                    sc.close();
    }
    }
}
}
