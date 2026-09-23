import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
      int a=10,b=12,c=10;
    
        
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        
        System.out.println("Maximum is: " + max);
        sc.close();
    }
}