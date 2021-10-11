/**
 * Write a function to check if the value of a binary number (passed as a string)
 * equals the hexadecimal representation of a string. 
 */
public class Convert {

    public static boolean compareBinToHex(String binary, String hexadecimal){
        int num1 = convertFromBase(binary, 2);
        int num2 = convertFromBase(hexadecimal, 16);

        if(num1 < 0 || num2 < 0){
            return false;
        }

        return num1 == num2;

    }
    
    public static int convertFromBase(String number, int base){
        int value = 0;

        for (int i = number.length() - 1; i >= 0; i--){
            int digit = digitToValue(number.charAt(i));
            if(digit < 0 || digit >= base){
                return -1;
            }

            int exp = number.length() - 1 - i;
            value += digit * Math.pow(base, exp);
        }

        return value;

    }

    private static int digitToValue(char charAt) {
        return Character.getNumericValue(charAt);
    }

    public static void main(String[] args) {
        System.out.println(compareBinToHex("110", "6"));
    }
}

