package chapter6;

import java.time.LocalDateTime;

public class HeadManager implements Interviewer{

/*
    int interviewConducted(){
       return 1;

       // You must implement an abstract method of an interface using the explicit access modifier public.
*/

    public String interviewResult(){
        return null;
    }


    public int interviewConducted () {
        return 0;
    }

    @Override
    public Object interViewResult () {
        return null;
    }

    @Override
    public void conductInterview () {

    }

    @Override
    public void submitInterviewStatus () {
        Interviewer.super.submitInterviewStatus ( );
    }

}
class project{
    public static void main(String args[]){
        Interviewer inv = new HeadManager ();
        //inv.bookConferenceRoom( LocalDateTime.now ( ),2);

        Manager mgr= new Manager ();
       // mgr.bookConferenceRoom(LocalDateTime.now (),2);

        Interviewer.bookConferenceRoom ( LocalDateTime.now(),2 );

    }
}
