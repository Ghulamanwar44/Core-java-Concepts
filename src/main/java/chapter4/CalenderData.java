package chapter4;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class CalenderData {
    public static void main(String []args){

        // LocalDate -LocalDate will work perfectly for storing dates like a birthday or anniversary, visiting a place, or starting a job, school etc.

        LocalDate date1 = LocalDate.of(2015,12,27); // Accept month as int value
        LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 27); // Accept month as enum constant
        LocalDate date3= LocalDate.now ();
        LocalDate date4 = LocalDate.parse ( "2016-04-08" );
        System.out.println ("date1: "+date1+"\ndate2: "+date2 +"\ndate3: "+date3+"\ndate4: "+date4);

        LocalDate date= LocalDate.parse("2020-08-30");
        System.out.println ("Month: "+date.getMonth () +" Year: "+date.getYear ()+" Month Value: "+date.getMonthValue ());
        System.out.println ( "Day of Month: "+date.getDayOfMonth ()+"\nDay of week: "+date.getDayOfWeek ()+"\nDay of year: "+date.getDayOfYear ());

        LocalDate shreyaBday = LocalDate.parse("2002-08-30");
        LocalDate paulBday = LocalDate.parse("2002-07-29");

        System.out.println (shreyaBday.isAfter ( paulBday ) );
        System.out.println(shreyaBday.isBefore(paulBday));
        System.out.println(shreyaBday.isBefore(shreyaBday));

        // Manipulating LocalDate minusXX()
        LocalDate bday = LocalDate.of(2052,03,10);

        System.out.println (bday.minusDays(10) );
        System.out.println (bday.minusMonths ( 2 ) );
        System.out.println (bday.minusWeeks(30) );
        System.out.println (bday.minusYears ( 1 ) +"\n");

        // Manipulating LocalDate plusXX()
        System.out.println (bday.plusDays ( 1 ) );
        System.out.println (bday.plusMonths ( 1 ) );
        System.out.println (bday.plusWeeks ( 1 ) );
        System.out.println (bday.plusYears ( 1 ) +"\n");

        // Manipulating LocalDate withXX() -( The withXX() methods return a copy of the date instance replacing the specified day, month, or year in it:)
        System.out.println ( bday.withDayOfMonth ( 1 ));
        System.out.println (bday.withDayOfYear ( 1 ) );
        System.out.println (bday.withMonth(7) );
        System.out.println ( bday.withYear (1));

        LocalDate interviewDate = LocalDate.of ( 2016,02,28 );
        System.out.println (interviewDate.atTime(16,30) );
        System.out.println (interviewDate.atTime(16,30,20));
        System.out.println (interviewDate.atTime(16,30,20,300 ));
        System.out.println (interviewDate.atTime( LocalTime.of(16,30)) );


        // You can use the method toEpochDay() to convert LocalDate to the epoch date the count of days from January 1, 1970:
        LocalDate launchBook = LocalDate.of(2016,2,8);
        LocalDate aDate = LocalDate.of(1970,1,8);
        System.out.println (launchBook.toEpochDay() );
        System.out.println (aDate.toEpochDay() );

        // LocalTime - To store times like breakfast, conference talk start time, or in-store sale end time. It's immutable. (format hours-minutes-seconds)
       // LocalTime timeHrsMin = LocalTime.of(120,12);
        LocalTime timeHrsMin2 = LocalTime.of(13,12);
        LocalTime HrsMinSec =  LocalTime.of(0,12,6);
        LocalTime HrsMinSecNano = LocalTime.of(12,7,10,898978848);
        System.out.println (timeHrsMin2 );
        System.out.println (HrsMinSecNano );

        LocalTime time= LocalTime.now();
        System.out.println (time.getSecond() );
        System.out.println (time.getHour () );
        System.out.println (time.getMinute() );
        System.out.println (time );
        LocalTime time2= LocalTime.parse("15:08:30");
        System.out.println (time2);
        System.out.println (LocalTime.MIDNIGHT.equals ( LocalTime.MIN ) );

        // QUERYING LOCALTIME
        LocalTime localTime1= LocalTime.of(16,20,12,62436);
        System.out.println (localTime1.getHour ( ) );
        System.out.println (localTime1.getMinute() );
        System.out.println (localTime1.getSecond() );
        System.out.println (localTime1.getNano() );

        LocalTime shreyaFinishTime = LocalTime.parse("17:09:04");
        LocalTime paulFinishTime = LocalTime.parse("17:09:12");
        if(shreyaFinishTime.isBefore(paulFinishTime))
            System.out.println("Shreya wins");
        else
            System.out.println("Paul wins");

        LocalTime movieStartTime =LocalTime.parse("21:00:00");
        int commuteMin = 35;
        LocalTime shreyaStartTime = movieStartTime.minusMinutes(commuteMin);
        System.out.println ("Start by " + shreyaStartTime + " from office" );

        int worldRecord = 10;
        LocalTime raceStartTime = LocalTime.of(8,10,55);
        LocalTime raceEndTime = LocalTime.of(8,11,11);
        if(raceStartTime.plusSeconds(worldRecord).isAfter(raceEndTime)){
            System.out.println ("New World Record" );
        }
        else
            System.out.println ("TRY HARDER!"
            );

        LocalTime startTime = LocalTime.of(5,7,9);
        if(startTime.getMinute() < 30){
            startTime = startTime.withMinute(3);
        }
        System.out.println (startTime );

        LocalTime time3 = LocalTime.of(14,10,0);
        LocalDate dt = LocalDate.of(2016,12,22);
        LocalDateTime dateTime = time.atDate ( dt );
        System.out.println (dateTime );

        // LocalDateTime - If you want to store both date and time (without the time zone),use the class LocalDateTime.( year-month-dayThours:minutes:seconds:nanoseconds).
        LocalDateTime prizeCeremony = LocalDateTime.parse("2050-06-05T14:00:00");
        LocalDateTime dateTimeNow = LocalDateTime.now();

        if(prizeCeremony.getMonthValue() == 6)
            System.out.println ("can't invite president" );
        else
            System.out.println ("president invited" );

        LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2050-06-05T14:30:00");
        if(prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture))
            System.out.println ("Chief Guest Will leave before ceremony completes" );

        LocalDateTime eventMgrArrival = LocalDateTime.of(2050,6,5,14,30,0);
        if(eventMgrArrival.isAfter(prizeCeremony.minusHours(3)))
            System.out.println ("Manager is supposed to arrive 3 hrs earlier" );

        // PERIOD
        Period period1 = Period.ofMonths(5);
        Period period2 = Period.ofWeeks(7);
        Period period3 = Period.ofDays(15);
        Period period4 = Period.ofDays(-6);
        System.out.println (period1+"\n"+period2 +"\n"+period3+"\n"+period4);

        Period p5Yrs7 = Period.parse("P5y1m2d");
        Period p5Yrs8 = Period.parse("p9m");
        Period p5Yrs9 = Period.parse("P60d");
        Period p5Yrs10 = Period.parse("P5W");
        System.out.println (p5Yrs7 );
        System.out.println ( p5Yrs10);
        Period perio = Period.of(1, 2, 7);
        Period perio2 = Period.ofYears(2);
        System.out.println ( perio);
        System.out.println (perio2 );

        LocalDate carnivalStart = LocalDate.of(2050, 12, 31);
        LocalDate carnivalEnd = LocalDate.of(2051,1,2);

        Period periodBetween = Period.between ( carnivalStart, carnivalEnd );
        System.out.println (periodBetween );

        LocalDate birthday = LocalDate.of(2020,10,29);
        LocalDate today = LocalDate.now (  );
        Period period10days = Period.of(0,0,10);

        System.out.println (birthday.minus(period10days) );
        if (birthday.minus(period10days).isBefore ( today ));
        System.out.println ("Time to send out reminders to friends.");


        Period period10Days = Period.of(0, 0, 10);
        Period period1Month = Period.of(0, 1, 0);
        System.out.println(period10Days.minus(period1Month)+"   -> 1");
        System.out.println(period10Days.minusDays(5)+"  -> 2");
        System.out.println(period10Days.minusMonths(5)+" -> 3");
        System.out.println(period10Days.minusYears(5)+" ->  4");

        System.out.println (Period.of(15,10,5).toTotalMonths() );

        // INSTANTIATE OR ACCESS DATETIMEFORMATTER

        DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate ( FormatStyle.MEDIUM );
        DateTimeFormatter formatter2 =
                DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter formatter3 =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        DateTimeFormatter formatter4 =
                DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,
                        FormatStyle.SHORT);
        System.out.println (formatter1 );
        System.out.println (formatter2 );
        System.out.println (formatter3 );
        System.out.println (formatter4 );

        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_DATE;
        System.out.println (formatter5 );

        DateTimeFormatter formatter6= DateTimeFormatter.ofPattern("2057 08 11");
        System.out.println (formatter6 );

        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);

        CalenderData.showFormats ();

     }
    static void showFormats(){
        LocalDate date = LocalDate.of(2057,8,11);
        LocalTime time = LocalTime.of(14,30,15);

        DateTimeFormatter d1 = DateTimeFormatter.ofPattern("y");
        DateTimeFormatter d2 = DateTimeFormatter.ofPattern("YYYY");
        DateTimeFormatter d3 = DateTimeFormatter.ofPattern("Y M D");
        DateTimeFormatter d4 = DateTimeFormatter.ofPattern("e");

        DateTimeFormatter t1 = DateTimeFormatter.ofPattern("H h m s");
        DateTimeFormatter t2 = DateTimeFormatter.ofPattern("'Time now:'HH mm a");

        System.out.println(d1.format(date)+" -> 1");
        System.out.println(d2.format(date));
        System.out.println(d3.format(date));
        System.out.println(d4.format(date));
        System.out.println(t1.format(time));
        System.out.println(t2.format(time));
    }

}