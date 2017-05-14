import   java.util.Scanner;
import  java.io.PrintWriter;
public class FileOutput {
    public static void  main    (   String  args[] ) {
        try {
            //  Create  a   Scanner attached    to  System.in   so  you can read    filename
            Scanner keyboard    = new Scanner(  System.in   );
            String  outFile;
            System.out.print( "Enter    output  filename:   " );
            outFile =   keyboard.next();
            //Create a PrintWriter, which will allow you to write to
            //a file instead of to the screen.
            PrintWriter writer = new PrintWriter( outFile );

            int x   = 42;

            //Notice how the PrintWriter variable can use println() and printf(),
            //just like our System.out.println() and System.out.printf() that we're used to.
            writer.println( "Here's a line of  output!" );
            writer.printf( "Look, it's a number: %d\n",  x );
            //  Now do  output  to  the screen.
            System.out.println( "I just wrote some data to a file!" );
            writer.close();
        }
        catch ( Exception ex ) {
            ex.printStackTrace();
        }
    }
}
