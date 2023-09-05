package Maths;
import java.util.*;

public class BionomialCoefficient {
    
    public static void main(String[] args){
        int factn =  1, factnmr = 1, factr = 1; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        for(int i = 1; i<= n; i++){
            factn =  factn * i;
        }

        for(int i = 1; i <= n-r; i++){
            factnmr = factnmr * i;
        }

        for(int i = 1; i <= r; i++){
            factr = factr * i;
        }

        System.out.println(factn/(factnmr*factr));
        sc.close();

    
    }
}
