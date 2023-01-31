package task;

  class String {
    static int count=0;
    String(){
        count++;
        System.out.println ("number of objects" );
    }
    public static void main(String args[]){
        java.lang.String hello = "hello";
        System.out.println (count );

    }
}
