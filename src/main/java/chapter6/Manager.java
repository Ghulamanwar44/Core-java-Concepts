package chapter6;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

class Manager extends Mulazim implements Interviewer,Trainable{
 public int teamSize =20;

 public static void main(String args[]){
  Programmer p=new Programmer ();

  // calling attendTraining method via object of Programmer
  p.attendTraining ();
  p.writeCode ();

  // calling attendTraining+conductInterview method via object of Manager
  Manager m = new Manager ();
  m.attendTraining ();
  m.conductInterview ();
 }
  public void attendTraining(){
   System.out.println ("Mgr - conductInterview" );
  }


 @Override
 public Object interViewResult () {
  return null;
 }

 public void conductInterview(){
   System.out.println ("Mgr - attendTraining" );
  }

 @Override
 public void submitInterviewStatus () {
  Interviewer.super.submitInterviewStatus ( );
 }


}
