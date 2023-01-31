package chapter6.lambdaExpressions;

interface DrawableInterface{
    public void draw();
}
public class LambdaExpressionExample {
    public static void main(String args[]){
        int width=10;

        // without lambda, Drawable implementation using anonymous class
        DrawableInterface d= new DrawableInterface(){
            public void draw(){
                System.out.println ("Drawing "+width );
            }
        };
        d.draw();
    }
}
