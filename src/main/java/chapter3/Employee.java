package chapter3;

public class Employee {
    private String name;
    int age;

    public void setName(String val){
        name=val;
    }

    public int daysOffWork(int... days) {
        int daysOff = 0;
        for (int i = 0; i <
                days.length; i++) {
            daysOff += days[i];
        }
        return daysOff;
    }

    public static void main(String []args)
    {
        Employee e1=new Employee();
        // e1.setName("Java");   --- correct
        String str="Mala";
        e1.setName(str); // correct

        System.out.println(e1.daysOffWork(1,2,3,4));
        System.out.println(e1.daysOffWork(1,2,3));
    }

    Employee()
    {
        age=22;
    }
    public void printEmp(){
        System.out.println("name = " + name + "age = " + age);
    }
}
/*
You can access the object field name of the object of the class Employee either by using
its variable name or by using the method setName. The following line of code assigns a
value "Selvan" to the field name of object e1:
* */