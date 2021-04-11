package SingleResponsibility_Coupling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentRepository {
    //todo This class will look only after the Database Operations

    public void save(){
        String objectStr =  MyUtils.serializeIntoAString(new Student1());
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
}
