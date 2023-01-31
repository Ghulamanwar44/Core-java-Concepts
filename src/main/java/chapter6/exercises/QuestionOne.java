package chapter6.exercises;

class Animal{
    void jump(){
        System.out.println ("Animal" );
    }
}

class Cat extends Animal{
    void jump(){
        System.out.println ("Cat" );

    }
}

class Rabbit extends Animal{
    void jump(){
        System.out.println ("Rabbit" );
    }
}
public class QuestionOne {
    public static void main(String args[]){
        Animal cat = new Cat();
        Rabbit rabbit = new Rabbit();
        cat.jump ();
        rabbit.jump();
    }

}
