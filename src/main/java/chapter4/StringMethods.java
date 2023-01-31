package chapter4;

public class StringMethods {
    public static void main (String args[]) {

        String str = "String"; //

        // charAt()
        try {
            System.out.println ( str.charAt ( 3 ) ); // i
            System.out.println ( str.charAt ( 6 ) ); // java.lang.StringIndexOutOfBoundsException: String index out of range: 6
        } catch ( Exception e ) {
            System.out.println ( "invalid index position: " + e );
        }

        // indexOf()
        String letters = "ABCABA";
        System.out.println ( letters.indexOf ( 'B' ) );      // prints: 1
        System.out.println ( letters.indexOf ( "CA" ) );   // prints: 2
        System.out.println ( letters.indexOf ( 'B', 2 ) ); // prints: 4

        // substring()
        String exam = "Oracle";
        String sub = exam.substring ( 2 );
        System.out.println ( sub );                // prints: acle
        String result = exam.substring ( 2, 4 );
        System.out.println ( result );            // prints: ac (Char at position 4 not included)

        // trim()
        String varWithSpaces = " AB CB   ";
        System.out.print ( ":" );
        System.out.print ( varWithSpaces );
        System.out.println ( ":" ); //   prints->  : AB CB   :

        System.out.print ( ":" );
        System.out.print ( varWithSpaces.trim ( ) );
        System.out.println ( ":" );     // prints->   :AB CB:   ( trim() method returns a new String by removing all the leading and trailing white space in a String.)

        // replace()
        String st = "ABCAB";
        System.out.println ( st.replace ( 'B', 'b' ) );
        System.out.println ( st.replace ( "CA", "12" ) );
        System.out.println ( st ); // prints: ABCAB (Prints ABCAB because previous replace() method calls don’t affect the char[] array within st)

        // length
        System.out.println ( "Shreya".length ( ) ); // prints: 6


        // startsWith()
        String alpha = "ABCAB";
        System.out.println ( alpha.startsWith ( "AB" ) ); // true
        System.out.println ( alpha.startsWith ( "A", 3 ) ); // true

        // endsWith()
        System.out.println ( alpha.endsWith ( "CAB" ) );  // true
        System.out.println ( alpha.endsWith ( "CaB" ) );  // false
        System.out.println ( alpha.endsWith ( "B" ) );    // true
        System.out.println ( alpha.endsWith ( "b" ) );    // false


    }
}

