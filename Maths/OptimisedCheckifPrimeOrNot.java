package Maths;

public class OptimisedCheckifPrimeOrNot {
    public static boolean IsPrime(int a){
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

    public static void main(String[] args){
        boolean ans = IsPrime(7);
        System.out.println(ans);
    }
}
