//Name: Michael J Monical
//Class: 1400-003
//Due Date : March 15, 2016
//Colleagues: asked tutors why I had to say private scanner and if i can move my do while statement.







import java.util.Scanner;

public class mmonical_ReadingMethods {
    private static Scanner get = new Scanner (System.in);
    public static void main ( String args [] ) {



        double a, b, c, d, gfa, gfb, gff, ffa, ffb, ffc, grade;


        a = getWords();
        b = getSentences();
        c = getBigWords();
        d = getSyllables();
        gff = GunningFog(a,b,c);
        ffc = FleschREScore(a,b,d);
        grade = FleschGL(a,b,d);
        displayResults(gff, ffc);
    }
    
    /**
     *   getWords
     *
     *   This    method  should  read    a   value   from    the user    until   the value   entered
     *   is  greater than    or  equal   to  100 (we need    at  least   100 words   to  make
     *   a   useful  reading level   determination).
     *   
     *   @param                      No  parameters  are required
     *   @return                 The number  of  words   as  a   double
     */
    
    public static double getWords(){
        double words;

        do{
            System.out.print( "Please enter the number of words in the sample: " );
            words = get.nextDouble();
        }while(words < 100);
        return words;
    }

    /**
     *   getSentences
     *
     *   This    method  should  read    a   value   from    the user    until   the value   entered
     *   is  greater than    or  equal   to  1.      It's    assumed that    there   should  be  at
     *   least   1   sentence    in  the sample.
     *   
     *   @param        No  parameters  are required
     *   @return       The number  of  sentences   as  a   double
     */
    
    public static double getSentences(){
        double sentence;
        do{
        System.out.print( "Please enter the number of sentences in the sample: " );
        sentence = get.nextDouble();
        }while( sentence < 1);
        return sentence;
    }

    /**
     *   getBigWords
     *
     *   This    method  should  read    a   value   from    the user    until   the value   entered
     *   is  greater than    or  equal   to  0.      "Big    words"  are words   with    three   or
     *   more    syllables.      It  is  possible    that    the reading sample  has 0   "big
     *   words", so  this    method  should  validate    for 0   or  above.
     *   
     *   @param       No  parameters  are required
     *   @return      The number  of  big words   as  a   double
     */

    public static double getBigWords(){
        double bigwords;
        do{
        System.out.print( "Please enter the number of big words in the sample: " );
        bigwords = get.nextDouble();
        }while(bigwords < 1 );
        return bigwords;
        
    }

    /**
     *   getSyllables
     *
     *   This    method  should  read    a   value   from    the user    until   the value   entered
     *   is  greater than    or  equal   to  1.      Assuming    there   are at  least   100 words
     *   in  the sample, there   should  be  at  least   1   syllable    in  the sample.
     *   
     *   @param                      No  parameters  are required
     *   @return                 The number  of  syllables   as  a   double
     */
    
    public static double getSyllables(){
        double syllables;
        do{
        System.out.print( "Please enter the number of syllables in the sample: ");
        syllables = get.nextDouble();
        }while(syllables <  1);
        return syllables; 
    }

    /**
     *   GunningFog
     *
     *   This    method  should  determine   the Gunning Fog Index   given   the number  of
     *   words,  sentences   and big words   in  a   passage.
     *   
     *   @param   words         The number  of  words   in  the sample  as  a   double
     *   @param   sentences     The number  of  sentences   in  the sample  as  a   double
     *   @param   big           The number  of  big words   in  the sample  as  a   double
     *   @return                 The Gunning Fog Index   as  a   double
     */
    
    public static double GunningFog(double a, double b, double c){
        double gfa, gfb;
        //The Gunning Fog Index
        gfa = a / b; //gfa stands for gunning fox a
        //System.out.printf ( "The average sentence length is %.2f\n", gfa);
        gfb = (c / a) * 100.0; // gfb stand for gunning fox b
        //System.out.printf ( "The percentage of \"big words\" is %.2f\n", gfb);
        return (gfa + gfb) * 0.40; //gff stands for gunning fox final 
    }
    
    /**
     *   FleschREScore
     *   
     *   This    method  should  determine   the Flesch  Reading Ease    Score   given   the 
     *   number  of  words,  sentences   and syllables   in  a   passage.
     *
     *   @param   words          The number  of  words   in  the sample  as  a   double
     *   @param   sentences      The number  of  sentences   in  the sample  as  a   double
     *   @param   syllables      The number  of  syllables   in  the sample  as  a   double
     *   @return       The Flesch  Formula Reading Ease    Score   as  a   double
     */
    
    public static double FleschREScore(double a,double b,double c){
        double ffa, ffb;
        ffa = (a / b) * 1.015; //Flesch Formula variable a step 3
        ffb = (c / a) * 84.6; //Flesch formula b step 4
        return 206.835 - (ffa + ffb);
    }

    /**
     *   FleschGL
     *   
     *   This    method  should  determine   the Flesch  Formula Grade   Level   given   the
     *   Flesch  Reading Ease    Score.
     *   
     *   @param   readingEaseScore  The Flesch  Formula Reading Ease    Score   as  a   double
     *   @return      Flesch  Grade   Level   as  a   String
     */
   
    public static double FleschGL(double a, double b, double d){
        double ffa, ffb;
        ffa = (a / b) * 1.015; //Flesch Formula variable a step 3
        ffb = (d / a) * 84.6; //Flesch formula b step 4
        return 206.835 - (ffa + ffb);
    }

    /**
     *   displayResults
     *   
     *   This    method  should  output  the final   results of  the Gunning Fog Index,
     *   the Flesch  Reading Ease    Score   and the Flesch  Grade   Level.
     *   
     *   @param  gunningFog             The Gunning Fog Index   as  a   double
     *   @param  readingEaseScore       The Flesch  Formula Reading Ease    Score   as  a   double
     *   @param  gradeLevel             The Flesch  Grade   Level   as  a   double.
     */
    public static void displayResults(double gff, double ffc){
        double grade;
        System.out.printf ( "\nThe Gunning Fog Index of this sample is: %.2f\n", gff);  
        System.out.printf ( "The Reading Ease Score is: %.2f\n", ffc);
        System.out.print( "The Flesch Grade Level is: ");
        grade = ffc;

        if(grade > 100)
            System.out.println ( "Not defined\n" );
        else if ( grade >= 90)
            System.out.println ( "4th to 5th grade\n" );
        else if ( grade >= 80 )
            System.out.println ( "5th to 6th grade\n" );
        else if (grade >= 70 ) 
            System.out.println ( "7th grade\n" );
        else if (grade >= 60 )
            System.out.println ( "8th to 9th grade\n" );
        else if (grade >= 50 )
            System.out.println ( "High School\n" );
        else if (grade >= 30)
            System.out.println ( "College\n" );
        else if (grade >= 0)
            System.out.println ( "Post Graduate\n" );
        else
            System.out.println ( "Not defined\n");

    }
}
