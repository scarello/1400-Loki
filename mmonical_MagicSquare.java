//Name: Michael J Monical
//Class: 1400-003
//Program #: 11
//Due Date: April 23rd, 2016
//Colleagues : None






import java.util.Scanner;
import java.io.File;
public class mmonical_MagicSquare {




    static Scanner input;
    public static void main(String[] args) {
        try{
            int[][] copySquare;
            int numSquare;
            boolean boo = true;
            Scanner keyboard = new Scanner(System.in);
            String inFile;
            System.out.println("Enter input filename: ");
            inFile = keyboard.next();



            File file = new File( inFile );
            input = new Scanner( file );
            numSquare = input.nextInt();
            System.out.printf("Checking a %d x %d Magic Square!\n", numSquare , numSquare);
            int magicNumber = (numSquare*((numSquare*numSquare)+1)/2); 
            copySquare = new int[numSquare][numSquare];
            displaySquare(copySquare, magicNumber);
            System.out.println();
            if (!checkRows(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            if (!checkColumns(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            if (!checkDiagonals(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();
            if (!checkUnique(copySquare, magicNumber)){
                boo = false;
            }
            System.out.println();

            if (boo == false){
                System.out.println("MAGIC SQUARE: BAD");
            }
            else
                System.out.println("MAGIC SQUARE: GOOD");

        }
        catch (Exception ex){
            System.out.println("An error has occured!");
            System.out.println(ex.toString());
        }
    }
    /**
     *   displaySquare()
     *
     *   This method displays the square in nice, tidy rows and columns.
     *   Each row should be labeled as [XX], where XX is the number of the
     *   row, and each column should have an [XX] above it as a header
     *   where XX is the column number.     
     *
     *   The method should also display a textual header about the size of
     *   the square and the magic  number of the square. See the example runs
     *   for an idea what the output should look like.
     *   
     *   @param square a 2-d int array representing the square
     *   @param a an  int containing  the calculated  magic   number
     *   @return None
     */

    public static void displaySquare(int[][] square, int a){// TODO code application logic here


        System.out.printf("The magic number is %d\n" , a);
        System.out.print("    ");
        for(int i = 1; i <= square.length; i++ ){

            System.out.printf("[%2d] ", i);

        }
        System.out.println();
        for(int i = 0; i < square.length; i++)
        {
            System.out.printf("[ %d]", i+1);
            for(int j = 0; j < square.length; j++)
            {
                square[i][j]= input.nextInt();
                System.out.printf("%4d ", square[i][j]);
            }
            System.out.println();

        }
    }
    /**
     *   checkRows()
     *
     *   This method checks each row to see if it is a valid row, with all
     *   values adding up to the magic number sent in as an argument. Label
     *   the row outputs starting at 1.      
     *   
     *   The output should be either the text GOOD or BAD, depending on the
     *   status of the individual row. If the row is  BAD, also include what
     *   that row added up to instead of the magic number. See the example 
     *   runs for an idea what the output should look like.
     *
     *   The method should return true if all of the rows are valid and false
     *   otherwise.
     *   
     *   @param foo a 2-d int array representing the square
     *   @param b an int containing the calculated magic number
     *   @return  boolean true or false if all of the rows are valid
     */

    public static boolean checkRows(int[][] foo, int b){
        boolean boo = true;

        for(int i = 0; i < foo.length; i++){
            int sum = 0;
            for(int j = 0; j < foo.length; j++){
                sum += foo[i][j];

            }
            if (sum != b){
                boo =  false;
                System.out.printf("ROW %2d:BAD (%d instead of %d)\n", i+1, sum, b);
            }
            else
                System.out.printf("ROW %2d:GOOD\n", i+1 );

        }

        return boo;
    }
    /**
     *   checkColumns()
     *
     *  This method checks each column to see if it is a valid column, with all
     *   values adding up to the magic number sent in as an argument. Label
     *   the column outputs starting at 1.      
     *   
     *   The output should be either the text GOOD or BAD, depending on the
     *   status of the individual column. If the column is BAD, also include what
     *   that column added up to instead of the magic number. See the example 
     *   runs for an idea what the output should look like.
     *
     *   The method should return true if all of the columns are valid and false
     *   otherwise.
     *   
     *   @param foo a 2-d int array representing the square
     *   @param b an  int containing the calculated  magic   number
     *   @return boolean true or false if all of the columns are valid
     */
    public static boolean checkColumns(int[][] foo, int b){
        boolean boo = true;
        for(int i = 0; i < foo.length; i++){
            int sum = 0;
            for(int j = 0; j < foo.length; j++){
                sum += foo[j][i];

            }
            if (sum != b){
                boo =  false;
                System.out.printf("COL %2d:BAD (%d instead of %d)\n", i+1, sum, b);
            }
            else
                System.out.printf("COL %2d:GOOD\n", i+1 );
        }
        return boo;

    }
    /**
     *   checkDiagonals()
     *
     *   This method checks the two major diagonals to see if they are valid,
     *   with all values adding up to the magic number sent in  as  an  argument.       
     *   Label the diagonal from upper-left corner (position [0][0]) to the
     *   bottom-right corner (position [n-1][n-1]) as DIAG 1. Label the
     *   other diagonal as DIAG 2.      
     *   
     *   The output should be either the text GOOD or BAD, depending on the
     *   status of the individual diagonal. If  the diagonal is BAD, also include 
     *   what that diagonal added up to instead of the magic number. See the
     *   example runs for an idea what the output should look like.
     *
     *   The method should return true if both of the diagonals are valid and false
     *   otherwise.
     *   
     *   @param foobar a 2-d int array representing the square
     *   @param d an int containing the calculated magic number
     *   @return boolean true or false if both of the diagonals are valid
     */

    public static boolean checkDiagonals(int[][] foobar, int d){
        boolean boo = true;
        int sum = 0;
        for(int i = 0; i < foobar.length; i++){
            for(int j = 0; j < foobar.length; j++){
                if(i == j)
                    sum += foobar[i][j];

            }   
        }
        if (sum != d)
        {
            boo =  false;
            System.out.println("DIAG 1: BAD");
        }
        else
            System.out.println("DIAG 1: GOOD");

        sum = 0;
        for(int i = foobar.length - 1; i >= 0; i--){
            for(int j = foobar.length - 1; j >= 0; j--){
                if(i == j)
                    sum += foobar[i][j];
            }
        }
        if (sum != d)
        {
            boo =  false;
            System.out.println("DIAG 2: BAD");
        }
        else
            System.out.println("DIAG 2: GOOD");

        return boo;
    }
    /**
     *   checkUnique()
     *
     *   This method checks to see if each value used in the potential magic
     *   square has been used once and only once in the entirety of the square.
     *   
     *   Different-sized squares will have different potential ranges of values
     *   to test. For instance, a 4x4 square will have 16 potential values
     *   to test (1-16). A 7x7 square will have 49 potential values to test.
     *   
     *   If all values in the appropriate range have been used only once,
     *   the output should be the text GOOD for the label UNIQUE.
     *   
     *   If a value was used more than once or wasn't used at all, it  should  
     *   be listed in order from smallest to largest with a space between each
     *   offending value.
     *
     *   See the example runs for an idea what the output should look like.
     *
     *   The method should return true if all values have been used exactly once    
     *   and false otherwise.
     *   
     *   @param dilligaf a 2-d int array representing the square
     *   @return boolean true or false if all values are used exactly once
     */
    public static boolean checkUnique(int[][] dilligaf, int e){

        boolean boo = true;           
        int [] tempAr = new int [dilligaf.length*dilligaf.length+1];
        for (int j = 0; j < dilligaf.length; j++) {
            for (int k = 0; k < dilligaf[j].length; k++) {

                tempAr[dilligaf[j][k]]++;
            }
        }
        System.out.print("Unique: ");
        for(  int x = 1 ; x < tempAr.length; x++ ){

            if ( tempAr[x]!= 1 ){
                System.out.print(x+" ");
                boo=false;
            }
        }

        if ( boo ) {
            System.out.println( "Good" );

        }
        else{
            System.out.println(" ");
        }

        return boo;

    }

}
