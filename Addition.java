import java.util.Scanner; // program uses class Scanner

public class Addition 
    {
        public static void main ( String args[] ) 
            {
                int first;              //first number
                int second;            // second number
                int sum;                // sum of numbers

        //create scanner to obtain input from the keyboard
        //System.in is the input complement to System.Out
                Scanner input = new Scanner ( System.in );
                System.out.print("Enter first integer: " );
                first = input.nextInt ();
                System.out.print("Enter Second Integer: ");
                second = input.nextInt();
                sum = first + second;
                System.out.printf( "Sum is %d\n", sum );
            }
    }
