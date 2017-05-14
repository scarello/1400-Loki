//Name: Michael J Monical
//Class: 1400-003
//Program #: 7 
//Due Date: March 3, 2016
//Colleagues : None





import java.util.Scanner;
public class mmonical_Dates
{
    public static void main (String [] args)
    {
        Scanner get = new Scanner (System.in);
        int year1, year2, month1, month2, day1, day2, dcount, dcountTmp, mcount, ycount, tmp;
        boolean leapyear1, invalid, leapyear2, leapyeartmp;
        dcount = 0;
        day1 = 0;
        day2 = 0;
        month1 = 0;
        month2 = 0;
        year1 = 0;
        year2 = 0;
        dcountTmp = 0;
        leapyear1 = false;
        leapyear2 = false;
        do {
            invalid = true;
            System.out.println("Enter first date now:");
            System.out.print("Enter month: ");
            month1 = get.nextInt();
            System.out.print("Enter day: ");
            day1 = get.nextInt();
            System.out.print("Enter year: ");
            year1 = get.nextInt();

            if ( year1 < 1900 || year1 > 2400 )
                continue;
            if ( month1 < 1 || month1 > 12 )
                continue;
            if ( year1 % 4 != 0 )
                leapyear1 = false;
            else if (year1 % 100 != 0)
                leapyear1 = true;
            else
                leapyear1 = year1 % 400 == 0;
            //System.out.print("its a leap year: " + leapyear1);
            if ( day1 < 1)
                continue;
            if( leapyear1 && month1 == 2 ){
                if ( day1 > 29 )
                    continue;
            }
            else{

                if ( month1 == 2 ){
                    if ( day1 > 28)
                        continue;
                } 
                else if ( month1 % 2 != 0){
                    if(month1 <= 7 ){
                        if (day1 > 31 )
                            continue;
                    }
                    else if (day1 > 30)
                        continue;
                }
                else{
                    if( month1 <= 7){
                        if( day1 > 30 )
                            continue; 
                    }
                    else{
                        if( day1 >= 31 )
                            continue;
                    }
                }
            }
            invalid = false;
        }while ( invalid );

        do
        {
            invalid = true;
            System.out.println("");
            System.out.println("Enter second date:");
            System.out.print("Enter month: ");
            month2 = get.nextInt();
            System.out.print("Enter day: ");
            day2 = get.nextInt();
            System.out.print("Enter year: ");
            year2 = get.nextInt();

            if ( year2 < 1900 || year2 > 2400 )
                continue;
            if ( month2 < 1 || month2 > 12 )
                continue;
            if ( year2 % 4 != 0 )
                leapyear2 = false;
            else if (year2 % 100 != 0)
                leapyear2 = true;
            else
                leapyear2 = year2 % 400 == 0;

            //System.out.print("its a leap year: " + leapyear1);
            if ( day2 < 1)
                continue;
            if( leapyear2 && month2 == 2 ){
                if ( day2 > 29 )
                    continue;
            }
            else{
                if ( month2 == 2 ){
                    if ( day2 > 28)
                        continue;
                } 
                else if ( month2 % 2 != 0){
                    if(month2 <= 7 ){
                        if (day2 > 31 )
                            continue;
                    }
                    else if (day2 > 30){
                        continue;
                    }
                }
                else{
                    if( month2 > 7){
                        if( day2 >= 31 )
                            continue;
                    }
                    else{
                        if( day2 > 30 )
                            continue;
                    }
                }
            }
            invalid = false;
        }while ( invalid );
        System.out.println("");
        System.out.printf("The first date  is %d/%d/%d\n", month1, day1, year1);
        System.out.printf("The other date is %d/%d/%d\n\n", month2, day2, year2);
        if (year2 < year1){
            tmp = year1;
            year1 = year2;
            year2 = tmp;
            tmp = month1;
            month1 = month2;
            month2 = tmp;
            tmp = day1;
            day1 = day2;
            day2 = tmp;
            leapyeartmp = leapyear1;
            leapyear1 = leapyear2;
            leapyear2 = leapyeartmp;
        }
        //System.out.printf("%d %d %d %d %d %d\n", month1, day1, year1, month2, day2, year2);
        for ( ycount = year1 + 1 ; ycount < year2; ycount++ ){
            if( ycount % 4 == 0 && ycount % 100 != 0 || ycount % 400 == 0 ){
                dcountTmp += 366;
            }
            else{
                dcountTmp += 365;
            }
        }
        dcount += dcountTmp;
        //System.out.printf("first check %d\n",dcountTmp);
        dcountTmp = 0;
        if (year1 != year2){
            for (mcount = month1 + 1; mcount < 13; mcount++){
                if (mcount == 2 && leapyear1)
                    dcountTmp += 29;
                else if (mcount == 2)
                    dcountTmp += 28;
                else if (mcount < 8){
                    if (mcount % 2 == 0)
                        dcountTmp += 30;
                    else
                        dcountTmp += 31;
                }
                else if (mcount >= 8) {
                    if (mcount % 2 == 0)
                        dcountTmp += 31;
                    else
                        dcountTmp += 30;
                }
                //                if (leapyear1 && mcount == 2){
                //                    dcountTmp += 29;
                //                }
                //                else if (mcount == 1 || mcount == 3 || mcount == 5 || mcount == 7 || mcount == 8 || mcount == 10 || mcount == 12){
                //                    dcountTmp += 31;
                //                }
                //                else if ( mcount == 2)
                //                {
                //                    dcountTmp += 28;
                //                }
                //                else if (mcount == 4 || mcount == 6 || mcount == 9 || mcount == 11)
                //                {
                //                    dcountTmp += 30;
                //                }
            }
            dcount += dcountTmp;
            //System.out.printf("second check %d\n", dcountTmp);
            dcountTmp = 0;
            for (mcount = 1; mcount < month2; mcount++){
                if (mcount == 2 && leapyear2)
                    dcountTmp += 29;
                else if (mcount == 2)
                    dcountTmp += 28;
                else if (mcount < 8){
                    if (mcount % 2 == 0)
                        dcountTmp += 30;
                    else
                        dcountTmp += 31;
                }
                else if (mcount >= 8) {
                    if (mcount % 2 == 0)
                        dcountTmp += 31;
                    else
                        dcountTmp += 30;
                }
                //                if ( leapyear2 && mcount == 2 )
                //                {
                //                    dcountTmp += 29;
                //                }
                //                else if (mcount == 1 || mcount == 3 || mcount == 5 || mcount == 7 || mcount == 8 || mcount == 10 || mcount == 12)
                //                {
                //                    dcountTmp += 31;
                //                }
                //                else if ( mcount == 2)
                //                {
                //                    dcountTmp += 28;
                //                }
                //                else if (mcount == 4 || mcount == 6 || mcount == 9 || mcount == 11)
                //                {
                //                    dcountTmp += 30;
                //                }
            }
            dcount += dcountTmp;
            // System.out.printf("third check %d\n",dcountTmp);
            dcountTmp = 0;
        }

        if ( month1 != month2 || year1 != year2 )
        {
            if (month1 == 2 && leapyear1)
                dcountTmp += 29 - day1;
            else if (month1 == 2)
                dcountTmp += 28 - day1;
            else if (month1 < 8){
                if (month1 % 2 == 0)
                    dcountTmp += 30 - day1;
                else if (month1 % 2 == 1)
                    dcountTmp += 31 - day1;
            }
            else if (month1 >= 8) {
                if (month1 % 2 == 0)
                    dcountTmp += 31 - day1;
                else if (month1% 2 == 1)
                    dcountTmp += 30 - day1;
            }
            dcountTmp += day2;
            dcount += dcountTmp;
            // System.out.println("month1 < month2");
            // System.out.printf("fourth check %d\n",dcountTmp);
        }
        else { 
            if (day1 < day2){
                dcountTmp += day2 - day1;
                dcount += dcountTmp;
                // System.out.println("day1 < day2");
                // System.out.printf("fourth check %d\n",dcountTmp);
            }
            else if (day2 < day1){
                dcountTmp += day1 - day2;
                dcount += dcountTmp;
                //   System.out.println("day2 < day 1");
                //    System.out.printf("fourth check %d\n",dcountTmp);
            }
            else {
                dcountTmp += 0;
                dcount += dcountTmp;
                //  System.out.println("day1 = day2");
                //  System.out.printf("fourth check %d\n",dcountTmp);
            }
        }
        // for (; day2 == day1 ; )
        // {
        //     dcount = 0;
        //  }
        System.out.printf("The total number of days between the dates is %d\n", dcount);
        System.out.printf("That's a total of %d weeks and %d days.\n", dcount / 7, dcount % 7);
        System.out.printf("That's %d hours.\n", dcount * 24);
        System.out.printf("That's %d minutes\n", dcount * 1440);

    }
}
