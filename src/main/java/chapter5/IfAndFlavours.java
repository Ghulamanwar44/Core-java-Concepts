package chapter5;

public class IfAndFlavours {
    String name= "Lion";
    java.io.File file = new java.io.File("F");

    public static void main(String []args) {

        String result = "1";
        int score = 10;
        if ( (score = score + 10) == 100 )
            result = "A";
        else if ( (score = score + 29) == 50 )
            result = "B";
        else if ( (score = score + 200) == 50 )
            result = "C";
        else
            result = "F";
        System.out.println ( result + ":" + score );

        // Missing else block - (It's acceptable to define one course of action for an if construct)

        boolean testValue = false;
        if ( testValue == true )
            System.out.println ( "value is true" ); // works well without else block

        boolean testVal = false;
        if ( testVal == true )
            System.out.println ( "true" ); // at-least one statement b/w if & else. Removing this line gives compile time error
        else
            System.out.println ( "value is false" );

        boolean testValue2 = false;
        if ( testValue == true ) {
        } // empty code block works well
        else
            System.out.println ( "value is false" );

        // Following also works well -> interesting and bizarre piece of code:
        int sc = 00;
        if ( (sc = sc + 10) > 10 ) ;


        // Implications of the presence and absence of {} in if-else constructs

        String name = "Harris";
        int score2 = 100;
        if ( name.equals ( "Harris" ) )
            score2 = 200;
        name = "Larry";     // this runs and is not part of if condition
        System.out.println ( score2 + name );


        // with Code block and braces in if , if -else conditions

        String name2 = "Lion";
        int scor = 100;
        if ( name2.equals ( "Lion" ) ) {
            scor = 200;
            name2 = "Harry";
        } else
            scor = 120;
        System.out.println ( name2 + " " + scor );

        // without Code block and braces in if , if -else conditions

        String color = "Lion";
        if ( color.equals ( "Lion" ) )
            System.out.println ( "Lion" );
        else
            System.out.println ( "Not a Lion" );
        System.out.println ( "Again , not a Lion" ); // not part of the if statement

        // You can define another statement, construct, or loop to execute for an if condition, without using {}, as follows:

        String car = "Indigo";
        if ( car.equals ( "Indigo" ) )
            for (int i = 0; i < 3; i++)
                System.out.println ( i );

        // "=" assigns new value  :Appropriate versus inappropriate expressions passed as arguments to an if construct

        boolean allow = false;
        if ( allow = true ) {   // allow = true if block executes
            System.out.println ( "Value is true" );
        } else
            System.out.println ( "value is false" );

        // "==" value check

        boolean allows = false;
        if ( allows == true ) {   // allow == true results in false hence else block executes
            System.out.println ( "Value is true" );
        } else
            System.out.println ( "value is false" );


        // Nested if constructs

        int runs = 110;
        if ( runs > 200 ) {
            if ( score < 400 )
                if ( score > 300 )
                    System.out.println ( 1 );
                else
                    System.out.println ( 2 );
        } else
            System.out.println ( 3 );  // prints : 3

        if ( runs > 20 )
            if ( runs < 400 )
                if ( runs > 300 )
                    System.out.println ( 1 );
                else
                    System.out.println ( 2 ); // prints: 2
            else
                System.out.println ( 3 );

        // Ternary Constructs

        int bill = 2000;
        int discount = (bill > 2000) ? 15 : 10;  // assigns 10 to discount
        System.out.println ( discount );

        discount = (bill > 2000) ? bill - 15 : bill - 100;
        System.out.println ( discount ); // output: 1900

        if ( bill > 2000 )
            discount = 15;
        else discount = 10;
        System.out.println ( discount ); // output: 10

        IfAndFlavours obj = new IfAndFlavours ();
        obj.ternaryConstruct ();

        //If the expression used to evaluate a ternary operator doesn’t return a boolean or a Boolean value, the code won’t compile:

        int qty = 10;  // int disc = ++qty ? 10: 20;   - > wont compile

        // Long sale = (5000 > 2000 )? new Integer(10): new Integer(15)-;
        // System.out.println (" discout ::::: -> "+sale );

        // NESTED TERNARY CONSTRUCTS

        int amount = 2000;
        int qt = 10;
        int days = 10;
        int dis = (amount > 1000)?
                (qt > 11) ?
                        10
                        : days > 9 ? 20: 30
                : 5;
        System.out.println ("Dis:::"+ dis );




    }
        public void ternaryConstruct () {
            int bill = 2000;
            int discount = (bill > 2000) ? getSpecDisc ( ) : getRegDisc ( );
            System.out.println ( discount );
        }

        int getRegDisc () {
            return 11;
        }

        int getSpecDisc () {
            return 15;
        }
}

