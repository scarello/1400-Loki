import java.util.Scanner;
public class L3Practice {
    public static void main ( String [] args ) {
        Scanner input = new Scanner ( System.in );

        int x = input.nextInt();
        do{

            System.out.print("Please enter a positive integer >=1: ");

                    x = input.nextInt();

                    }while( x < 1 );

                    System.out.printf("You entered %d", x );

    }
} 


