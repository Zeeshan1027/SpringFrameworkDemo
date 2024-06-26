package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        //Doctor doctor = new Doctor();
        //Doctor doctor = context.getBean(Doctor.class);
        //Nurse doctor = context.getBean(Nurse.class);
        //Nurse doctor =(Nurse) context.getBean("nurse");
        //Staff staff =context.getBean(Doctor.class);
        //Staff staff =context.getBean(Nurse.class);
        Nurse staff =context.getBean(Nurse.class);
        staff.assist();
        //System.out.println(staff.getQualification());
    }
}
