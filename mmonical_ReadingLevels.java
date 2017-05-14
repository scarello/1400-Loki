//Name: Michael J Monical
//Class: 1400-003
//Program #: 3
//Due Date : February  3, 2016
//Colleagues: None






import java.util.Scanner;

public class mmonical_ReadingLevels {
    
    public static void main ( String args [] ) {

        Scanner get = new Scanner ( System.in );

        double a, b, c, d, gfa, gfb, gff, ffa, ffb, ffc, grade;
    
        System.out.print( "Please enter the number of words in the sample: " );
        a = get.nextDouble( );
        System.out.print( "Please enter the number of sentences in the sample: " );
        b = get.nextDouble( );
        System.out.print( "Please enter the number of big words in the sample: " );
        c = get.nextDouble( );
        System.out.print( "Please enter the number of syllables in the sample: ");
        d = get.nextDouble( );
        
        //System.out.printf ( "The number of words you entered is: %.0f\n", a );
        //System.out.printf ( "The number of sentences you entered is: %.0f\n", b );
        //System.out.printf ( "The number of \"big words\" you entered is: %.0f\n", c );
        //System.out.printf ( "The number of syllables you entered is: %.0f\n\n", d );

        //The Gunning Fog Index
        gfa = a / b; //gfa stands for gunning fox a
        //System.out.printf ( "The average sentence length is %.2f\n", gfa);
        gfb = (c / a) * 100.0; // gfb stand for gunning fox b
        //System.out.printf ( "The percentage of \"big words\" is %.2f\n", gfb);
        gff = (gfa + gfb) * 0.40; //gff stands for gunning fox final
        System.out.printf ( "\nThe Gunning Fog Index of this sample is: %.2f\n", gff);
        

        //The Flesch Formula

        ffa = (a / b) * 1.015; //Flesch Formula variable a step 3
        ffb = (d / a) * 84.6; //Flesch formula b step 4
        ffc = 206.835 - (ffa + ffb);

        System.out.printf ( "The Reading Ease Score is: %.2f\n", ffc);

        //The Flesch Grade Level

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

//I did place an extra new line (\n) at the bottom for easier readability!!



    }
}


