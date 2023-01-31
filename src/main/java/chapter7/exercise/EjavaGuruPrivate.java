package chapter7.exercise;

class Ejava {
    void method(){
        try{
            guru();
            return;
        }finally{
            System.out.println("finally 1");
        }
    }
    void guru(){
        System.out.println("guru");
        throw new StackOverflowError();
    }
    public static void main(String args[]){
        Ejava ej=new Ejava();
        ej.method();
    }
}
 class EjavaGuruPrivate {
    public static void main(String args[]) {
        EjavaGuruPrivate var = new EjavaGuruPrivate();
        var.printArrValues(args);
    }
    void printArrValues(String[] arr) {
        try {
            System.out.println(arr[0] + ":" + arr[1]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (IndexOutOfBoundsException e) {
        }
    }}
