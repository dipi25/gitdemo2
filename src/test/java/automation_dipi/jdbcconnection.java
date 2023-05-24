package automation_dipi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Statement;

public class jdbcconnection {

	 
	public static void main(String[] args) throws SQLException {
		String host="localhost";
		String port="3306";
		// TODO Auto-generated method stub
 Connection conn=DriverManager.getConnection("jdbc:mysql://"+ host +":" +port + "/sys","root" ,"root");
    Statement s= conn.createStatement();  
  
  s.execute("select * from emp where name='RAM' ");
	}

}
