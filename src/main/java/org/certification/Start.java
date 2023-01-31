package org.certification;

class Start {
    static int numOfObjects = 0;

    Start() {
        numOfObjects++;
       // System.out.println("No args constructor");
    }

    public void show() {
        System.out.println("Show data method");
    }


    public static void main(String[] args) {

        Start stObject = new Start();
        Start obj2 = new Start();
        Start obj3 = new Start();

        stObject.show();
        //obj2.show();
        System.out.println("callig number of objects created: " + Start.numOfObjects);
    }

}