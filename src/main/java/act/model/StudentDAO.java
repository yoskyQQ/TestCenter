//package act.model;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//@Service
//public class StudentDAO {
//	
//	
//    public void insert(StudentTest item) throws SQLException, ClassNotFoundException {
//    	System.out.println(item.toString());
//    	String driver= "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//    	String url= "jdbc:sqlserver://localhost:1433;databaseName=TogetherLearning";
//    	String username= "sa";
//    	String password= "as";
//        Class.forName(driver);
//        Connection connection= DriverManager.getConnection(url,username,password);
//        if(!connection.isClosed())
//            System.out.println("connection success");
//        String sql="INSERT INTO studentTest(studentId,itemName,itemId,itemScore,itemNo,testDate) VALUES('"+item.getStudentId()+"','"+item.getItemName()+"','"+item.getItemId()+"','"+item.getItemScore()+"','"+item.getItemNo()+"','"+item.getTestDate()+"')";
//        PreparedStatement statement = connection.prepareStatement(sql);
//        
//        System.out.println("sql="+sql);
//        int id = 0;
//        ResultSet results =  statement.executeQuery();
//        if(results != null){
//            try{
//              if(results.next()){
//                id = results.getInt(1);
//                System.out.println("id="+id);
//              }
//            }
//            catch(Exception resultSetException) {resultSetException.printStackTrace();
//            }
//            results.close();
//          }
//        statement.close();
//        connection.close();
//      
//    }
//}
