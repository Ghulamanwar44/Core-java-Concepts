package chapter3;

class Phone {
    String phoneNumber = "123456789";
    void setNumber () {
        this.phoneNumber=phoneNumber;
      // phoneNumber = "987654321";
    }
}
class TestPhone {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setNumber();
        System.out.println (p1.phoneNumber);
    }
}
/*A local variable takes precedence over an instance variable
defined in the class with the same names. Because there is no change in the value of
the instance variable phoneNumber, 123456789 is printed to the console from the
method main, defined in the class TestPhone*/
