package week4;

import java.util.Scanner;

/**
 *
 * @author Dillon Davis
 */
public class C12N6hex2Dec {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a hex number: ");
        String hex = sc.nextLine();
        System.out.println("The decimal number for the nex number " + hex + " is "
                + hexToDecimal(hex.toUpperCase()));

    }

    public static int hexToDecimal(String hex) {
        int decimalValue = 0;
        for (int i = 0; i < hex.length(); i++) {
            char hexChar = hex.charAt(i);
            decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
        }
        return decimalValue;
    }

    public static int hexCharToDecimal(char ch) {
        if (ch >= 'A' && ch <= 'F') {
            return 10 + ch - 'A';
        } else if (ch <= '9' && ch >= '0') {
            return ch - '0';
        }
        else
            throw new NumberFormatException("Illegal character: " + ch);
    }
}
