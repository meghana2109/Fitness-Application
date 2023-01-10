import java.util.Date;

public class MainClass {
    public static void main(String[] args) {
        User u1 = new User(01,"Megna","m","meg123","123456",new Date(1993,10,9),"HMS Hisar",69,162);
        User u2 = new User(02,"Pawan","k","paw123","123456",new Date(1992,07,21),"HMS Hisar",75,174);

        FitnessCoach f1 = new FitnessCoach(01,"Athul","Reddy","AthulFit","12345",34,"992765421",9.8);

        Appointment a1 = new Appointment(01,u1,f1,new Date());
        Appointment a2 = new Appointment(02,u2,f1,new Date());

        System.out.println("=======================================================================================");

        System.out.println("Appointment Details for "+a1.user.firstName +" are as below:-");
        System.out.println("Fitness Coach : "+a1.fitnessCoach.firstName);
        System.out.println("Date : "+a1.date);

        System.out.println("=======================================================================================");

        System.out.println("Appointment Details for "+a2.user.firstName +" are as below:-");
        System.out.println("Fitness Coach : "+a2.fitnessCoach.firstName);
        System.out.println("Date : "+a2.date);

        System.out.println("=======================================================================================");

    }
}
