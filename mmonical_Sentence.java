//Name: Michael J Monical
//Class: 1400-003
//Program #: 6 
//Due Date: February 24th, 2016
//Colleagues : I did stop into the tutors for more print issues. I was
//struggling with grouping the letters and out of bounds.







import java.util.Scanner;

public class mmonical_Sentence
{
    public static void main (String [ ] args)
    {

        Scanner get = new Scanner (System.in);


        char ch;
        int a = 0;
        boolean boolflag = false;
        int counter = 0;
        System.out.print ("Enter a sentence to ROT13: ");
        String sentence = get.nextLine();

        while ( a != sentence.length() )
        {
            ch = sentence.charAt(a++);
            boolflag = false;

            switch (ch)
            {
                case 'a' : case 'A':
                    System.out.printf("N");
                    break;

                case 'b' : case 'B':
                    System.out.printf("O");
                    break;
                case 'c' : case 'C':
                    System.out.printf("P");
                    break;
                case 'd' : case 'D':
                    System.out.printf("Q");
                    break;
                case 'e' : case 'E':
                    System.out.printf("R");
                    break;
                case 'f' : case 'F':
                    System.out.printf("S");
                    break;
                case 'g' : case 'G':
                    System.out.printf("T");
                    break;
                case 'h' : case 'H':
                    System.out.printf("U");
                    break;
                case 'i' : case 'I':
                    System.out.printf("V");
                    break;
                case 'j' : case 'J':
                    System.out.printf("W");
                    break;
                case 'k' : case 'K':
                    System.out.printf("X");
                    break;
                case 'l' : case 'L':
                    System.out.printf("Y");
                    break;
                case 'm' : case 'M':
                    System.out.printf("Z");
                    break;
                case 'n' : case 'N':
                    System.out.printf("A");
                    break;
                case 'o' : case 'O':
                    System.out.printf("B");
                    break;
                case 'p' : case 'P':
                    System.out.printf("C");
                    break;
                case 'q' : case 'Q':
                    System.out.printf("D");
                    break;
                case 'r' : case 'R':
                    System.out.printf("E");
                    break;
                case 's' : case 'S':
                    System.out.printf("F");
                    break;
                case 't' : case 'T':
                    System.out.printf("G");
                    break;
                case 'u' : case 'U':
                    System.out.printf("H");
                    break;
                case 'v' : case 'V':
                    System.out.printf("I");
                    break;
                case 'w' : case 'W':
                    System.out.printf("J");
                    break;
                case 'x' : case 'X':
                    System.out.printf("K");
                    break;
                case 'y' : case 'Y':
                    System.out.printf("L");
                    break;
                case 'z' : case 'Z':
                    System.out.printf("M");
                    break;
                default:
                    System.out.printf("");
                    boolflag = true;
                    break;
            }
        if (!boolflag)
        {
            counter++;
            if (counter == 5)
            {
                System.out.printf(" ");
                counter = 0;
            }
        }
            
        }
        System.out.println("\n");


    }
}
