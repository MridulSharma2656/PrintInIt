package SkillsPw.Others;

public class AlphabetPattern {
    public static void main(String[] args) {
        printAlphabet();  // Call this to print all alphabets
    }

    // Function to print all alphabets (A-Z)
    public static void printAlphabet() {
        for (char letter = 'A'; letter <= 'Z'; letter++) {
            System.out.println("\nLetter: " + letter);
            printLetter(letter);
            System.out.println();  // Space after each letter
        }
    }

    // Function to print a specific letter pattern
    public static void printLetter(char letter) {
        int rows = 5;
        for (int row = 0; row < rows; row++) {
            printLetterRow(letter, row);
            System.out.println();  // Move to the next row after each row is printed
        }
    }

    // Function to print a specific row of a given letter using column-wise logic
    public static void printLetterRow(char letter, int row) {
        switch (letter) {
            case 'A': printA(row); break;
            case 'B': printB(row); break;
            case 'C': printC(row); break;
            case 'D': printD(row); break;
            case 'E': printE(row); break;
            case 'F': printF(row); break;
            case 'G': printG(row); break;
            case 'H': printH(row); break;
            case 'I': printI(row); break;
            case 'J': printJ(row); break;
            case 'K': printK(row); break;
            case 'L': printL(row); break;
            case 'M': printM(row); break;
            case 'N': printN(row); break;
            case 'O': printO(row); break;
            case 'P': printP(row); break;
            case 'Q': printQ(row); break;
            case 'R': printR(row); break;
            case 'S': printS(row); break;
            case 'T': printT(row); break;
            case 'U': printU(row); break;
            case 'V': printV(row); break;
            case 'W': printW(row); break;
            case 'X': printX(row); break;
            case 'Y': printY(row); break;
            case 'Z': printZ(row); break;
            default: System.out.print("     "); // For unsupported letters
        }
    }

    // Pattern functions for each letter from A to Z

    public static void printA(int row) {
        if (row == 0) System.out.print(" *** ");
        else if (row == 1) System.out.print("*   *");
        else if (row == 2) System.out.print("*****");
        else System.out.print("*   *");
    }

    public static void printB(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("**** ");
        else System.out.print("*   *");
    }

    public static void printC(int row) {
        if (row == 0 || row == 4) System.out.print(" ****");
        else System.out.print("*    ");
    }

    public static void printD(int row) {
        if (row == 0 || row == 4) System.out.print("**** ");
        else System.out.print("*   *");
    }

    public static void printE(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print("*****");
        else System.out.print("*    ");
    }

    public static void printF(int row) {
        if (row == 0 || row == 2) System.out.print("*****");
        else System.out.print("*    ");
    }

    public static void printG(int row) {
        if (row == 0) System.out.print(" ****");
        else if (row == 2) System.out.print("*  **");
        else if (row == 4) System.out.print(" ****");
        else System.out.print("*    ");
    }

    public static void printH(int row) {
        if (row == 2) System.out.print("*****");
        else System.out.print("*   *");
    }

    public static void printI(int row) {
        if (row == 0 || row == 4) System.out.print("*****");
        else System.out.print("  *  ");
    }

    public static void printJ(int row) {
        if (row == 0) System.out.print("*****");
        else if (row == 4) System.out.print("**** ");
        else System.out.print("   * ");
    }

    public static void printK(int row) {
        if (row == 0 || row == 4) System.out.print("*   *");
        else if (row == 1) System.out.print("*  * ");
        else System.out.print("* *  ");
    }

    public static void printL(int row) {
        if (row < 4) System.out.print("*    ");
        else System.out.print("*****");
    }

    public static void printM(int row) {
        if (row == 0) System.out.print("*   *");
        else if (row == 1) System.out.print("** **");
        else System.out.print("*   *");
    }

    public static void printN(int row) {
        if (row == 1) System.out.print("**  *");
        else if (row == 2) System.out.print("* * *");
        else System.out.print("*   *");
    }

    public static void printO(int row) {
        if (row == 0 || row == 4) System.out.print(" *** ");
        else System.out.print("*   *");
    }

    public static void printP(int row) {
        if (row == 0 || row == 2) System.out.print("**** ");
        else if (row == 1) System.out.print("*   *");
        else System.out.print("*    ");
    }

    public static void printQ(int row) {
        if (row == 0 || row == 4) System.out.print(" *** ");
        else if (row == 3) System.out.print("*  **");
        else System.out.print("*   *");
    }

    public static void printR(int row) {
        if (row == 0 || row == 2) System.out.print("**** ");
        else if (row == 1) System.out.print("*   *");
        else if (row == 3) System.out.print("* *  ");
        else System.out.print("*   *");
    }

    public static void printS(int row) {
        if (row == 0 || row == 2 || row == 4) System.out.print(" ****");
        else if (row == 1) System.out.print("*    ");
        else System.out.print("    *");
    }

    public static void printT(int row) {
        if (row == 0) System.out.print("*****");
        else System.out.print("  *  ");
    }

    public static void printU(int row) {
        if (row < 4) System.out.print("*   *");
        else System.out.print(" *** ");
    }

    public static void printV(int row) {
        if (row < 3) System.out.print("*   *");
        else if (row == 3) System.out.print(" * * ");
        else System.out.print("  *  ");
    }

    public static void printW(int row) {
        if (row < 3) System.out.print("*   *");
        else if (row == 3) System.out.print("* * *");
        else System.out.print(" * * ");
    }

    public static void printX(int row) {
        if (row == 0 || row == 4) System.out.print("*   *");
        else if (row == 2) System.out.print(" *** ");
        else System.out.print(" * * ");
    }

    public static void printY(int row) {
        if (row < 2) System.out.print("*   *");
        else if (row == 2) System.out.print(" *** ");
        else System.out.print("  *  ");
    }

    public static void printZ(int row) {
        if (row == 0 || row == 4) System.out.print("*****");
        else if (row == 1) System.out.print("   * ");
        else if (row == 2) System.out.print("  *  ");
        else System.out.print(" *   ");
    }
}