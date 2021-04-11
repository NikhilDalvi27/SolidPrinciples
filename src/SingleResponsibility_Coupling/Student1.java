package SingleResponsibility_Coupling;

import java.util.Date;

//todo This Class will handle Core Student Profile Data

public class Student1 {

    private String studentId;
    private Date studentDOB;
    private String address;

    //todo Solution for TIGHT COUPLING
    // take the database related code and move it to a seperate class,
    // thus the Tight Coupling is Removed
    public void save(){
        new StudentRepository().save();

    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
