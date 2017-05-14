//Name: Michael Monical
//Class: 1400-003
//Program #: 5
//Due Date: February 17th, 2016
//Colleagues : I did stop into the tutors to help straighten out my 
//              print statement. I didn't get his name though.






import java.util.Scanner;
public class mmonical_NumberConversions
{
    public static void main ( String [] args )
    {
        System.out.print (" Enter a number between 0 and 1048575: ");
        Scanner get = new Scanner (System.in);
        int x = get.nextInt();
        
        while ( x < 0 || x > 1048575)
        {
            System.out.print ( " Enter a number between 0 and 1048575: ");
            x = get.nextInt();

        }
            System.out.println ("Convert to (b)inary or (o)ctal?");
            char ch = get.next().charAt(0);
        while ( ch != 'o' && ch != 'b' ) 
        {
            System.out.println ("Convert to (b)inary or (o)ctal?");
            ch = get.next().charAt(0);
        }
        int counter;
        int oct;
        int n;
        int base;
            if (ch == 'o' )
            
            {
                base = 8;
                counter = 7;
                oct = 262144;
                System.out.printf ( " Converting to octal ... \n" );
            }
            else
            {
                base = 2;
                counter = 20;
                oct = 524288;
                System.out.printf ( " Converting to binary ... \n" );
            }
                
                while ( counter > 0 )
                {        
                    n = x / oct;
                    x = x % oct;
                    oct = oct /base ;
                    System.out.printf ("%d" , n);
                    counter = counter - 1;
                }           
            
            System.out.print("\n");
            } 
    }


