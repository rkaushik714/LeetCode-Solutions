package Maths;

public class PrimesinRange {

    public static boolean isPrime(int a){
        if(a==2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(a); i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }


    public static void primesInRange(int n){
        for(int i = 2; i <= n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args){
        primesInRange(23);
    }
}
