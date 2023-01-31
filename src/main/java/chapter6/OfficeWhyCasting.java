package chapter6;

public class OfficeWhyCasting {
    public static void main(String args[]){
        Interviewer[] interviewers = new Interviewer[2];
        interviewers[0]=new Manager ();
        interviewers[1]=new HRExecutive();
        for(Interviewer interviewer: interviewers){

            if( interviewer instanceof Manager)
            {
                int teamSize =((Manager)interviewer).teamSize;
                if (teamSize > 10)
                {
                    interviewer.conductInterview();
                } else
                {
                    System.out.println("Mgr can't interview with team size less than 10");
                }
            } else
                if (interviewer instanceof HRExecutive)
                {
                 interviewer.conductInterview();
                }

        }
         }

    private static class HRExecutive implements Interviewer {
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
}

