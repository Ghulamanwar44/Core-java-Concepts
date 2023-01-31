package chapter6;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDateTime;
import java.time.LocalTime;

interface Interviewer {

    abstract Object interViewResult();


    // you might include the abstract keyword if you wish to
    abstract void conductInterview();

    //The definition of a default method must include the keyword default:
    default void submitInterviewStatus(){
        System.out.println ("Accept" );
    }

    // static methods - . It must be called using the interface name.
   static void bookConferenceRoom(LocalDateTime dateTime, int duration){
         System.out.println ("Interview scheduled on: " + dateTime);
         System.out.println ("Book conference room for: "+duration +" hrs" );
     }
}
