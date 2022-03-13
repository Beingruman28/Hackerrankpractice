import java.util.Scanner;

public class UsingLoops {

    
        public static void main(String[] args) 
        {
            Scanner s = new Scanner(System.in);
             
        int N = s.nextInt();
        if(N>=2||N<=20){
            for(int i=1;i<=10;i++){
                
                System.out.println(N+" x "+i+" = "+N*i );
                s.close();
            }
        }
        }
}