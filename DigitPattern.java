package SkillsPw.Others;

public class DigitPattern {
    public static void main(String[] args) {
        printDigits();  // Call this to print all digits from 0 to 9
    }

    // Function to print all digits (0-9)
    public static void printDigits() {
        for (char digit = '0'; digit <= '9'; digit++) {
            System.out.println("\nDigit: " + digit);
            printDigit(digit);
            System.out.println();  // Space after each digit
        }
    }

    // Function to print a specific digit pattern
    public static void printDigit(char digit) {
        int rows = 5;
        for (int row = 0; row < rows; row++) {
            printDigitRow(digit, row);
            System.out.println();  // Move to the next row after each row is printed
        }
    }

    // Function to print a specific row of a given digit using column-wise logic
    public static void printDigitRow(char digit, int row) {
        switch (digit) {
            case '0': print0(row); break;
            case '1': print1(row); break;
            case '2': print2(row); break;
            case '3': print3(row); break;
            case '4': print4(row); break;
            case '5': print5(row); break;
            case '6': print6(row); break;
            case '7': print7(row); break;
            case '8': print8(row); break;
            case '9': print9(row); break;
            default: System.out.print("     ");  // Space filler for unsupported digits
        }
    }

    // Pattern functions for each digit from 0 to 9

    public static void print0(int row) {
        if (row == 0 || row == 4) System.out.print(" *** ");
        else System.out.print("*   *");
    }

    public static void print1(int row) {
        if (row == 0) System.out.print("  *  ");
        else if (row < 4) System.out.print("  *  ");
        else System.out.print("*****");
    }

    public static void print2(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("    *");
        else System.out.print("*    ");
    }

    public static void print3(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else System.out.print("    *");
    }

    public static void print4(int row) {
        if (row < 3) System.out.print("*   *");
        else if (row == 3) System.out.print("*****");
        else System.out.print("    *");
    }

    public static void print5(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("*    ");
        else System.out.print("    *");
    }

    public static void print6(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("*    ");
        else System.out.print("*   *");
    }

    public static void print7(int row) {
        if (row == 0) System.out.print("*****");
        else System.out.print("    *");
    }

    public static void print8(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else System.out.print("*   *");
    }

    public static void print9(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("*   *");
        else System.out.print("    *");
    }
}