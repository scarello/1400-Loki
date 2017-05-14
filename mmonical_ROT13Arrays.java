//Name: Michael J Monical
//Class: 1400-003
//Program #: 9 
//Due Date: March 31, 2016
//Colleagues : none 


import java.util.Arrays;
import java.util.Scanner;

public class mmonical_ROT13Arrays {


    public static Scanner get = new Scanner (System.in);
    public static void main(String[] args) {

        String[] sentences = new String[5];
        getSentences ( sentences );
        displayOriginal ( sentences );
        displayROT13 (sentences);
        displayCombinedROT13 (sentences);

    }
    /**

      * getSentences

      *

      * This method allows the user to enter text into each of the

      * element of the String array that it receives.

      *

      * @param sentences An array of String[] data

      * @return None

      */
    public static void getSentences(String[] sentences){
        System.out.println("Enter your five sentences below:\n");
        for ( int x = 0; x < sentences.length; x++){
            System.out.printf("Sentence %d>", x + 1);
            sentences[x] = get.nextLine();
        }
        System.out.println("");
    }
    /**

      * displayOriginal

      *

      * This method displays all of the elements of the array of

      * String data that it receives, line by line (element by element).

      *

      * @param sentences An array of String[] data

      * @return None

      */
    public static void displayOriginal(String[] sentences){
        System.out.println("The Original text:");
        for (String sentence : sentences) {

            System.out.println(sentence);
        }
        System.out.println("");
    }
    /**

      * charConvert

      *

      * This method will take one char value as a parameter and convert

      * it to its appropriate ROT13 equivalent. The return value will be the

      * new ROT13 char equivalent.

      *

      * This method will not do any output.

      *

      * @param toConvert A character to convert as a char

      * @return The new ROT13 equivalent value as a char

      */
    public static char charConvert(char toConvert) {
        int decChar = (int) toConvert;

        if (decChar < 123){
            if (decChar > 94){
                decChar = decChar - 32;
            }
        }
        decChar = (decChar + 13) % 91;
        if (decChar < 64)
            decChar = decChar + 65;
        return (char) decChar;

    }
    /**

      * convertSentence

      *

      * This method will do the actual conversion of a String of data to its

      * ROT13 equivalent in 5-character chunks of data. It should call on

      * the charConvert() method to do the actual character conversion for each

      * individual character. In other words, individual character conversion

      * should not happen within this method.

      *

      * This method will not do any output.

      *

      * @param sentence A String variable to convert

      * @return The 5-characters in a group ROT13 result as a String

      */
    public static String convertSentence(String sentence){
        char c;
        int decChar, counter = 0;
        String newSentence = "";
        for (int x = 0; x < sentence.length(); x++){
            c = sentence.charAt(x);
            decChar = (int) c;
            if (decChar < 123){
                if (decChar > 94){
                    decChar = decChar - 32;
                }
            }
            if (decChar > 64){
                if (decChar < 91){
                    newSentence = newSentence + charConvert(c);
                    counter++;
                    if (counter == 5){
                        newSentence = newSentence + " ";
                        counter = 0;
                    }
                }
            }

        }
        return newSentence;
    }
    /**

      * displayROT13

      *

      * This method will display in ROT13 format all of the elements of the

      * array of String data that it receives . It will need to call on the

      * method convertSentence() to convert each string before it displays it.

      * Note that the original array should not be modified with ROT13 data.

      *

      * @param sentences An array of String[] data

      * @return None

      */
    public static void displayROT13(String[] sentences){
        System.out.println("The line-by-line ROT13:");
        for (String sentence : sentences){
            System.out.println(convertSentence(sentence));

        }
        System.out.println("");
    }
    /**

      * displayCombinedROT13

      *

      * This method takes an array of String data and combines all of the Strings

      * into a single String that is then processed by the convertSentence()

      * method. The method should essentially display the same results as the

      * displayROT13() method, except that there won't be separate lines of

      * output but rather one large result instead.

      *

      * @param sentences An array of String[] data

      * @return None

      */
    public static void displayCombinedROT13(String[] sentences){
        String newSentence = "";
        System.out.println("The combined ROT13:");

        for (int i = 0; i < sentences.length; i++){
            newSentence = newSentence + sentences[i];
        }
        System.out.println(convertSentence(newSentence));
    }

}








