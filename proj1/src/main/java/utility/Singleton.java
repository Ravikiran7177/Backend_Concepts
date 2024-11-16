package utility;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Singleton {
	
	public static Connection getConnection(Connection con) throws ClassNotFoundException, SQLException {
		if(con==null) {
			String url="jdbc:mysql://localhost:3306/ravi";
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	return DriverManager.getConnection(url,"root","root");
		}else {
			return con;
		}
	};
	
}
