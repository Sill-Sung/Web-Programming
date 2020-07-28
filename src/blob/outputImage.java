package blob;
import java.io.FileOutputStream;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class outputImage {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			// *e.getMessage() : oracle ErrorNumber�� Error ���� ���
			System.out.println(e.getMessage());
		}
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String id = "shoppingmall";
		String password = "SHOPPINGMALL";
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		
		try {
			// 1. Connection  2. Query�� �غ�  3. Query���� �� ����� ����
			conn = DriverManager.getConnection(url, id, password);
			pstmt = conn.prepareStatement("SELECT * FROM Image");
			rs = pstmt.executeQuery();
			
			//rs.next();		������ �����ؾ� ��
			
			if(rs.next()) {
				do {
					String image_index = rs.getString("image_index");
					System.out.print(image_index+" : ");
					
					InputStream inputStream = rs.getBinaryStream("image_sub1");
					FileOutputStream fileOutputStream = new FileOutputStream("C:/Users/COMPUTER/Desktop/ShoppingMall/ouputimage/"+image_index+".jpg");
					
					byte[] buff = new byte[512];
					int len;
					while(true) {
						len = inputStream.read(buff);
						
						if(len<=0) {
							break;
						}
						
						fileOutputStream.write(buff, 0, len);
					}
				}while(rs.next());
			}
			else {
				System.out.println("there is nothing of data");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally{
			// ��� ���� ����
			try {
				if(conn!=null) conn.close();
				if(rs != null) rs.close();
				if(pstmt != null) pstmt.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
