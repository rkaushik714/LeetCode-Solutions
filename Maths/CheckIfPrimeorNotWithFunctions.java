package Maths;


public class CheckIfPrimeorNotWithFunctions{
    public static boolean isPrime(int n){
         if(n == 2) {
        return true;
    }
    for(int i = 2; i < n-1; i++){
        if( n % i == 0){
            return false;
        }
    }
    return true;
}

    public static void main(String[] args){
    boolean ans = isPrime(3);
    System.out.println(ans);
    }
}