package chapter3;

public class Exam {
    @Override
    public String toString() {
        return "Exam{" +
                "name='" + name + '\'' +
                '}';
    }

    String name;
    public void setName(String newName)
    {
        name=newName;
       // return  newName;
    }
}
class ObjectLife1{
    public static void main(String args[])
    {
        Exam myExam = new Exam();
        myExam.setName("OCA");
        myExam = null;
        myExam = new Exam();
        myExam.setName("PHP");
        System.out.println(myExam);
    }
}
