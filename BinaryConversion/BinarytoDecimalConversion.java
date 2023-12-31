package BinaryConversion;

public class BinarytoDecimalConversion {
    public static void convert(int binNum){
        int myNum = binNum;
        int decNum = 0;
        int pow = 0;
        while(binNum>0){
            int lastdigit = binNum % 10;
            decNum = decNum + ( lastdigit * (int)Math.pow(2,pow) );
            pow++;
            binNum = binNum/10;
        }
        System.out.println("The decimal of " + myNum + "=" + decNum);
    }
    public static void main(String[] args){
        convert(101);
    }
}
