package Maths;
import java.util.*;

public class PrintReverseofaNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number which needs to be reversed : ");
        int n = sc.nextInt();
        while(n > 0){
           int lastDigits  = n % 10;
           System.out.print(lastDigits);
           n = n/10;
        }
        sc.close();
    }
    
}
