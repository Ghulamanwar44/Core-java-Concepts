package chapter3.eight;

class EJava {

    public EJava(){
        this(7);
        System.out.println("public");
    }

    private EJava(int val){
        this("sunday");
        System.out.println("private");
    }

    protected EJava(String val){
        System.out.println("protected");
    }
}

class TestEJava{
    public static void main(String args[]){
        EJava eJava =new EJava();
    }
}
