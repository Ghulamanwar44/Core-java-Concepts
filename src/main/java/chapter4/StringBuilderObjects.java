package chapter4;
 public class StringBuilderObjects {
    public static void main(String []args){

        // The principal operations on a StringBuilder are the 'append' and 'insert' methods, which are overloaded so, as to accept data of any type.

        // append() -> (The append method adds the specified value at the end of the existing value of a StringBuilder Object)
        StringBuilder sb1= new StringBuilder();
        sb1.append(20.99);
        sb1.append(10);
        sb1.append('a');
        sb1.append(true);
        sb1.append("Hi");
      //  System.out.println (sb1 );

        char[] name = {'J','a','v','a','8'};
        sb1.append(name,1,3);
        System.out.println (sb1 );


        // insert() -> insert method enables you to insert the requested data at a particular position/
        StringBuilder sb2 = new StringBuilder ( "Bon" );
        sb2.insert(2,'r');
        System.out.println (sb2 );

        StringBuilder sb3 = new StringBuilder ( ("123") );
        char[] name1 = {'J','a','v','a'};
        sb3.insert(1,name1,1,3);
        System.out.println (sb3 );

        // delete() , deleteCharAt()
        StringBuilder sb4= new StringBuilder("0123456");
        sb4.delete(2,4);
        System.out.println (sb4 );
        sb4.deleteCharAt ( 1 );  // deletes at index position 1
        System.out.println (sb4 );

        // trim() doesn't exist in StringBuilder

        // replace , reverse
        StringBuilder sb5= new StringBuilder("JAVAMAIL");
        sb5.replace(1,4,"ZB");
        System.out.println (sb5 );
        sb5.reverse ();
        System.out.println (sb5 );

        // subsequence()
        StringBuilder sb6= new StringBuilder("012345667");
        System.out.println (sb6.subSequence ( 2,4 ) );
        System.out.println (sb6 ); // 01234567 (subSequence doesn't modify original sb6 )


        StringBuilder sbuild=new StringBuilder (  );
        sbuild.append("java");
        sbuild.append(new Person("Oracle"));
        System.out.println (sbuild );

    }
}
class Person{
     String name;
     Person(String str)
     {
         name = str;
     }
}
