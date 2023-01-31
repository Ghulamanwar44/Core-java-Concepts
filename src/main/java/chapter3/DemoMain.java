package chapter3;
 class Demo {

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        phoneNumber = phoneNumber;
    }
//
//    public Demo(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }

    String phoneNumber;
}
class DemoMain {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        d1.setPhoneNumber("12345");
        System.out.println(d1.getPhoneNumber());
    }
}