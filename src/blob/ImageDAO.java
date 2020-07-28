package blob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ImageDAO {
	// Field
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	
	String DriverName = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:ex";
	String id = "shoppingmall";
	String pw = "SHOPPINGMALL";
	
	// Constructor
	public ImageDAO() {
		try {
			Class.forName(DriverName);
			conn = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
