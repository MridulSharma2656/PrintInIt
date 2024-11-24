package SkillsPw.Others;

public class FestivalPattern {
    public static void main(String[] args) {
        printWord("HAPPY");
        System.out.println();  // Space between words
        printWord("DIWALI");
    }

    // Function to print each word column-wise
    public static void printWord(String word) {
        int rows = 5; // Fixed number of rows for each letter pattern

        // Iterate over rows (5 rows for each letter)
        for (int row = 0; row < rows; row++) {
            // Iterate over each character in the word
            for (char letter : word.toCharArray()) {
                printLetterColumnWise(letter, row);
                System.out.print("   ");  // Space between letters
            }
            System.out.println();  // Move to the next row after each column iteration
        }
    }

    // Function to print a specific row of a given letter using column-wise logic
    public static void printLetterColumnWise(char letter, int row) {
        switch (letter) {
            case 'H': printH(row); break;
            case 'A': printA(row); break;
            case 'P': printP(row); break;
            case 'Y': printY(row); break;
            case 'D': printD(row); break;
            case 'I': printI(row); break;
            case 'W': printW(row); break;
            case 'L': printL(row); break;
            default: System.out.print("      ");  // For unsupported letters (space filler)
        }
    }

    // Functions to generate column-wise patterns for each letter

    public static void printH(int row) {
        for (int col = 0; col < 5; col++) {
            if (col == 0 || col == 4 || row == 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printA(int row) {
        for (int col = 0; col < 5; col++) {
            if ((row == 0 && col > 0 && col < 4) || (row == 2) || (col == 0 && row > 0) || (col == 4 && row > 0)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printP(int row) {
        for (int col = 0; col < 5; col++) {
            if ((col == 0) || (row == 0 && col < 4) || (row == 2 && col < 4) || (col == 4 && row == 1)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printY(int row) {
        for (int col = 0; col < 5; col++) {
            if ((row < 2 && (col == row || col == 4 - row)) || (row >= 2 && col == 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printD(int row) {
        for (int col = 0; col < 5; col++) {
            if (col == 0 || (row == 0 && col < 4) || (row == 4 && col < 4) || (col == 4 && row != 0 && row != 4)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printI(int row) {
        for (int col = 0; col < 5; col++) {
            if (row == 0 || row == 4 || col == 2) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printW(int row) {
        for (int col = 0; col < 5; col++) {
            if (col == 0 || col == 4 || (row == 3 && (col == 1 || col == 3)) || (row == 4 && col == 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void printL(int row) {
        for (int col = 0; col < 5; col++) {
            if (col == 0 || (row == 4 && col < 5)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
}
