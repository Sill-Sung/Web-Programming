package test;
/*	DB처리	*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class MemberDAO {
	// Field
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String DriverName = "oracle.jdbc.driver.OracleDriver";
	String query = null;
	
	String id = "shoppingmall";
	String pw = "SHOPPINGMALL";
	
	// Constructor
	public MemberDAO() {
		try {
			Class.forName(DriverName);
			conn = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Method
	
	//1. DB Connection close()
	public void DBclose() {
		try {
			if(pstmt != null) pstmt.close();
			if(rs != null) rs.close();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public ArrayList<MemberDO> ShowUserData(String id){
		ArrayList<MemberDO> userdata = new ArrayList<MemberDO>();
		
		query = "SELECT * FROM Userdata WHERE userId = '"+id+"'";
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberDO m = new MemberDO();
				m.setUserGrade(rs.getString("userGrade"));
				m.setUserName(rs.getString("userName"));
				m.setUserId(rs.getString("userId"));
				m.setUserPassword(rs.getString("userPassword"));
				m.setUserBirth(rs.getString("userBirth"));
				m.setUserSex(rs.getInt("userSex"));
				m.setUserPhone(rs.getString("userPhone"));
				m.setUserAddress(rs.getString("userAddress"));
				m.setUserEmail(rs.getString("userEmail"));
				
				userdata.add(m);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
		return userdata;
	}
	
	//2. Select All UserData
	public ArrayList<MemberDO> getMemberlist(){
		// Member.class
		ArrayList<MemberDO> list = new ArrayList<MemberDO>();
		
		query = "Select * from UserData";
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				//Member클래스의 인스턴스 생성
				MemberDO member = new MemberDO();
				
				member.setUserName(rs.getString("userName"));
				member.setUserId(rs.getString("userId"));
				member.setUserPassword(rs.getString("userPassword"));
				member.setUserAddress(rs.getString("userAddress"));
				member.setUserBirth(rs.getString("userBirth"));
				member.setUserEmail(rs.getString("userEmail"));
				member.setUserGrade(rs.getString("userGrade"));
				member.setUserPhone(rs.getString("userPhone"));
				member.setUserSex(rs.getInt("userSex"));
				
				//list(ArrayList)에 Member 클래스의 인스턴스 member을 추가함
				//question) 인스턴스 member는 무엇?
				//			arraylist에 인스턴스를 넣을 수 있는가?
				list.add(member);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
		return list;
	}

	//3. Insert UserData
	public void InsertUserData(MemberDO data) {
		try {
			query = "INSERT INTO UserData (userName, userId, userPassword, userBirth, userSex, userPhone, userEmail, userGrade) VALUES (?,?,?,?,?,?,?,?)";
		
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, data.getUserName());
			pstmt.setString(2, data.getUserId());
			pstmt.setString(3, data.getUserPassword());
			pstmt.setString(4, data.getUserBirth());
			pstmt.setInt(5, data.getUserSex());
			pstmt.setString(6, data.getUserPhone());
			pstmt.setString(7, data.getUserEmail());
			pstmt.setString(8, data.getUserGrade());
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
	}
}
