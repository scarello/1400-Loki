import java.util.Scanner;
public class Tester {
    public static void main ( String args[] ) {
        Scanner get = new Scanner ( System.in );
        System.out.print( "Enter filename of potential Sudoku: " );
        String filename = get.next();
        mmonical_SudokuChecker thing = new mmonical_SudokuChecker (filename);
        thing.display();
        boolean a = thing.checkRows();
        boolean b = thing.checkColumns();
        boolean c = thing.checkRegions();

        if ( a == true && b == true && c == true ) {
            System.out.println( "\nSudoku: YES" );
        }
        else {
            System.out.println( "\nSudoku: NO" );
        }
    }
}
