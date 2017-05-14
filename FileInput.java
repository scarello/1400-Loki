import java.util.Scanner;
import java.io.File;

public class FileInput
{
    public static void main (String args[])
    {
        try{
            //create a regular Scanner for keyboard input
            Scanner keyboard = new Scanner( System.in );
            //Now create a String variable and read the filename
            System.out.println( "Enter input filename: " );
            String inFile;
            //Notice the uese of the System.in Scanner here
            inFile = keyboard.next();
            
            //Need to create a FIle variable based on the inFile file name
            File file = new File( inFile);
            //Now create a Scanner attached to the file instead of System.in
            //this Sanner will be used for file input!!
            Scanner input = new Scanner( file );

            //read the first thing out of the file, which is a String
            String first = input.next();
            System.out.println( "First item of the file is: " + first );

            //read the next thing out of the file, which is an integer
            int v1 = input.nextInt();
            System.out.println("First int on the second line is: " + v1 );

            //Read another integer from the file
            int v2 = input.nextInt();
            System.out.printf( "last int on the second line is: %d\n", v2);

            //Set up a loop that reads the rest of the int data from the file
            System.out.println("Now reading the rest of the data!");
            while ( input.hasNext() ){
                int v = input.nextInt();
                System.out.printf("Avalue from the file: %d\n", v);
            }
        }
        catch ( Exception ex )
        {
            ex.printStackTrace();
        }
    }
}
