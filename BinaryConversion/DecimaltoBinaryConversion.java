// package BinaryConversion;

// public class DecimaltoBinaryConversion {
//     public static void decTobin(int decNum){
//         int myNum = decNum;
//         int binNum = 0;
//         int pow = 1;
//         while(decNum > 0){
//             int rem = decNum % 2;
//             binNum = binNum +  rem * (int)Math.pow(10,pow);
//             pow++;
//             decNum = decNum/2;
//         }
//         System.out.println(binNum);
//     }
//     public static void main(String[] args) {
//         int decimalNumber = 5; // Replace with your desired decimal number
//         decTobin(decimalNumber);
// }
// }

package BinaryConversion;

public class DecimaltoBinaryConversion {
    public static void decToBin(int decNum) {
        if (decNum == 0) {
            System.out.println(0);
            return;
        }

        int binNum = 0;
        int base = 1;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + rem * base;
            decNum = decNum / 2;
            base *= 10;
        }

        System.out.println(binNum);
    }

    public static void main(String[] args) {
        int decimalNumber = 5; // Replace with your desired decimal number
        decToBin(decimalNumber);
    }
}
