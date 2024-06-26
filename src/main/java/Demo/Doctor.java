package Demo;

import org.springframework.stereotype.Component;

@Component
public class Doctor implements Staff{

//    private String Qualification;
//
//    public Doctor(String qualification) {
//        Qualification = qualification;
//    }

    public void assist(){
        System.out.println("Doctor is assisting");
    }

//    public String getQualification() {
//        return Qualification;
//    }
//
//    public void setQualification(String qualification) {
//        Qualification = qualification;
//    }
}
