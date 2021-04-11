package SingleResponsibility_Coupling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;

public class Student0 {

    private String studentId;
    private Date studentDOB;
    private String address;

    //todo this methods converts Student class into serialized form
    // and persists into a Database
    // This Code will need a change when the current DB
    // is changed from MYSQL to NOSQL(MongoDB)
    // So Student Class is tightly coupled with the DataBase Layer used Which is bad
    public void save(){
        String objectStr =  MyUtils.serializeIntoAString(this);
        Connection connection = null;
        Statement stmt = null;
        try {
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection("");
        stmt = connection.createStatement();
        stmt.execute("SOME INSERT ");
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public String getStudentId(){
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

}
