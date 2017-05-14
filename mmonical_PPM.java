//Name: Michael J Monical
//Class: 1400-003
//Program #: 10
//Due Date: April 14, 2016
//Colleagues : None





import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class mmonical_PPM {
    public static void  main    (   String  args[] ) 
    {
        try
        {
            int[] copyBuffer;
            int i, j, k;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("Source file name: ");
            String inFile;
            inFile = keyboard.next();

            String outFile;
            System.out.println("Output file name: ");
            outFile = keyboard.next();

            System.out.println("Do you want to Red Negative? (y/n)");
            boolean red = keyboard.next().charAt(0) == 'y';

            System.out.println("Do you want to Green Negative? (y/n)");
            boolean green = keyboard.next().charAt(0) == 'y';

            System.out.println("Do you want to Blue Negative? (y/n)");
            boolean blue = keyboard.next().charAt(0) == 'y';

            System.out.println("Do you want to Greyscale? (y/n)");
            boolean grey = keyboard.next().charAt(0) == 'y';

            System.out.println("Do you want to Horizontal Flip? (y/n)");
            boolean flip = keyboard.next().charAt(0) == 'y';



            PrintWriter writer = new PrintWriter( outFile );

            File file = new File( inFile );
            Scanner input = new Scanner( file );

            writer.println(input.nextLine());

            int width = input.nextInt();
            writer.print(width);
            writer.print(" ");
            int height = input.nextInt();
            writer.println(height);
            copyBuffer = new int[width * 3];
            int saturation = input.nextInt();
            writer.println(saturation);

            for (i = 0; i < height; i++){
                for (j = 0; j < width * 3 ; j+=3){
                    copyBuffer[j] = input.nextInt();
                    copyBuffer[j+1] = input.nextInt();
                    copyBuffer[j+2] = input.nextInt();
                }
                if (red){
                    negateRed(copyBuffer);
                }
                if (green){
                    negateGreen(copyBuffer);
                }
                if (blue){
                    negateBlue(copyBuffer);
                }
                if (grey){
                    greyscale(copyBuffer);
                }
                if (flip){
                    flipHorizontal(copyBuffer);
                }
                for (k = 0; k < width * 3; k+=3){
                    writer.println(copyBuffer[k]);
                    writer.println(copyBuffer[k+1]);
                    writer.println(copyBuffer[k+2]);
                }
            }
            while (input.hasNextInt())
                writer.println(input.nextInt());
            writer.close();
            input.close();

            System.out.println("Thanks! " + inFile + " has been copied to " + outFile + "!");
        }
        catch (Exception ex){
            System.out.println("An error has occured!");
            ex.printStackTrace();
        }

    }
    /**
     *           negateRed   
     *           
     *           This method negates the red value in the image. All P3-format
     *           PPM images have an image depth of 255, so use that in  your
     *           method's calculations.
     *           
     *           @param  buffer an integer array containing the image buffer
     *           @param  columns an integer w/the number of columns in the image
     *           @return NONE
     */
    public static void negateRed(int[] copyBuffer){
        for (int i = 0; i < copyBuffer.length; i++){
            copyBuffer[i] = 255 - copyBuffer[i];
        }
    }
    /**
     *           negateGreen
     *
     *           This method negates the green value in the image. All P3-format
     *           PPM images have an image depth of 255, so use that in  your
     *           method's calculations.
     *
     *           @param  buffer an  integer array   containing  the image   buffer
     *           @param  columns an  integer w/the   number  of  columns in  the image
     *           @return NONE
     */

    public static void negateGreen(int[] copyBuffer){
        for (int i = 1; i < copyBuffer.length; i+=3){
            copyBuffer[i] = 255 - copyBuffer[i];
        }
    }
    /**
     *           negateBlue
     *
     *           This method negates the blue value in the image. All P3-format
     *           PPM images have an image depth of 255, so use that in  your
     *           method's calculations.
     *
     *           @param  buffer an  integer array   containing  the image   buffer
     *           @param  columns an  integer w/the   number  of  columns in  the image
     *           @return NONE
     */


    public static void negateBlue(int[] copyBuffer){
        for (int i = 2; i < copyBuffer.length; i+=3){
            copyBuffer[i] = 255 - copyBuffer[i];
        }
    }

    /**
     *           greyscale   
     *           
     *           This method converts each pixel to its greyscale equivalent by
     *           average the red, green and blue values and replacing each of those
     *           values with the calculated average.
     *           
     *           @param    buffer an integer array containing the image buffer
     *           @param    columns an integer w/the number of columns in the image
     *           @return   NONE
     */
    public static void greyscale(int[] copyBuffer){
        for (int i = 0; i < copyBuffer.length; i+=3){
            int average = (copyBuffer[i] + copyBuffer[i+1] + copyBuffer[i+2]) / 3;
            copyBuffer[i] = average;
            copyBuffer[i+1] = average;
            copyBuffer[i+2] = average;
        }
    }
    /**
     *           flipHorizontal  
     *           
     *           This method flips a single row of the image so that it is a horizontal mirror
     *           of the original row.
     *           
     *           @param  buffer an integer array containing the image buffer
     *           @param  columns in integer w/the number of columns in the image
     *           @return  NONE
     */
    public static void flipHorizontal(int[] copyBuffer){
        int lastIndex = copyBuffer.length - 1;
        for (int i = 0; i < copyBuffer.length  / 2; i+=3){
            int temp1 = copyBuffer[lastIndex - (i + 2)];
            int temp2 = copyBuffer[lastIndex - (i + 1)];
            int temp3 = copyBuffer[lastIndex - (i)];
            copyBuffer[lastIndex - (i + 2)] = copyBuffer[i];
            copyBuffer[lastIndex - (i + 1)] = copyBuffer[i+1];
            copyBuffer[lastIndex - (i)] = copyBuffer[i+2];
            copyBuffer[i] = temp1;
            copyBuffer[i+1] = temp2;
            copyBuffer[i+2] = temp3;
        }
    }
} 
