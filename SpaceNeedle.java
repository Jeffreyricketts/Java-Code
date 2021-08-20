public class SpaceNeedle {
    public static final int LINES = 3; // to match the Chapter 2B assigment
    
    public static void main(String[] args) {
        spire();
        top();
        bottom();
        spire();
        column();
        top();
    }
    
    // draw two vertical bars - reused in spire and column
    public static void bars() {
        System.out.print("||");
    }
    
    // spire - draw the LINES lines of the spire
    public static void spire() {
        // there are 3*LINES spaces per line in all of LINES lines, then the bars
        for (int line = 1; line <= LINES; line++) {
            for (int space = 1; space <= 3*LINES; space++) {
                System.out.print(" ");
            }
            bars();
            System.out.println(); // every line ends in a println
        }
    }

    // column - draw the LINES*4 lines of the column
    public static void column() {
        // there are 3*LINES -3 spaces per line in all of LINES*4 lines, then |%%, then the bars, then %%|
        // the number of spaces is 3 less than the spaces per line in spire
        for (int line = 1; line <= LINES*4; line++) {
            for (int space = 1; space <= 3*LINES -3; space++) {
                System.out.print(" ");
            }
            System.out.print("|%%");
            bars();
            System.out.println("%%|"); // every line ends in a println
        }
    }

    // separator - draw a single line at the bottom of the top figure
    // when LINES is 4 the length of the line of equals signes is 24, or 6*LINES
    // that line is surrounded by | characters
    public static void separator() {
        System.out.print("|");
        for (int line = 1; line <= 6*LINES; line++) {
            System.out.print("\"");
        }
        System.out.println("|"); // every line ends in a println
    }

    // dome - draw the LINES lines of the beginning of the top in an outer loop
    // there are beginning spaces that decrease by 3 spaces for each line in LINES, so the multiplier is -3
    // the initial number of spaces is 3*LINES when line == 1, so the shift is 3*LINES
    // next there is a __/, followed by a series of colons that go up by 3 each line in LINES, multiplier 3
    // the number of colons on the first line is 0, so the shift is -3 for that inner loop
    // then there are bars, followed by another loop to produce the same number of colons, and finally \__
    public static void dome() {
        for (int line = 1; line <= LINES; line++) {
            for (int space = 1; space <= -3*line + 3*LINES; space++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int colon = 1; colon <= 3*line -3; colon++) {
                System.out.print(":");
            }
            bars();
            for (int colon = 1; colon <= 3*line -3; colon++) {
                System.out.print(":");
            }
            System.out.println("\\__"); // every line ends in a println
        }
    }

    // top - draw the LINES lines of the top, which is a dome followed by a separator
    public static void top() {
        dome();
        separator();
    }

    // carat - draw a single /\ figure to be reused in bottom
    public static void carat() {
        System.out.print("/\\");
    }

    // bottom - draw the LINES lines of the bottom figure in an outer loop
    // this begins with spaces that go up by 2 each line in LINES, so the multiplier is 2
    // there are 0 spaces on the first line, so the shift is -2
    // then there is a \_, followed by a series of carats
    // the number of carats goes down by 2 each line, so the multiplier is -2
    // the initial number of carats is 3*LINES+1 when line == 1, so the shift is 3*LINES+1
    // finally there is a _/ figure
    public static void bottom() {
        for (int line = 1; line <= LINES; line++) {
            for (int space = 1; space <= 2*line - 2; space++) {
                System.out.print(" ");
            }
            System.out.print("\\_");
            for (int carat = 1; carat <= -2*line + (3*LINES + 1); carat++) {
                carat();
            }
            System.out.println("_/"); // every line ends in a println
        }
    }
}
