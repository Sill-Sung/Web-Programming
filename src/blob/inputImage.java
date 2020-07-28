package blob;
import java.io.File;
import java.io.FileInputStream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class inputImage {
	public static void main(String[] args) {
		// Driver �ν��Ͻ�ȭ
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		// Database Connect
		Connection conn = null;
		PreparedStatement pstmt = null;
		String id = "shoppingmall";
		String password = "SHOPPINGMALL";
		
		try {
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", id, password);
			File f1= new File("C:/Users/COMPUTER/Desktop/ShoppingMall/image/image1.jpg");
			FileInputStream fis1 = new FileInputStream(f1);
			File f2 = new File("C:/Users/COMPUTER/Desktop/ShoppingMall/image/image2.jpg");
			FileInputStream fis2 = new FileInputStream(f2);
			
			pstmt = conn.prepareStatement("insert into Image(image_index, image_sub1, image_sub2)  values(Image_seq.NEXTVAL,?,?)");
			
			pstmt.setBinaryStream(1, fis1,(int)f1.length());
			pstmt.setBinaryStream(2, fis2,(int)f2.length());
			
			// Query ����
			int rownum = pstmt.executeUpdate();
			if(rownum>0) {	// ����� query�� 1�� �̻��� ��� ����
				System.out.println("insert COMPLETE");
			}else {			// ����� query�� ���� ��� ����
				System.out.println("insert FAIL");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				// Connection�� ������ ��� ���ҽ� ����
				if(conn != null) {
					conn.close();
				}
				// PreparedStatement �ν��Ͻ��� ������ ��� ���ҽ� ����
				if(pstmt != null) {
					pstmt.close();
				}
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
