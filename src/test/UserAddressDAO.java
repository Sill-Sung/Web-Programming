package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

// UserAddress에 관한 DB Connection 및 DML(Select, Insert, Update)
public class UserAddressDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String DriverName = "oracle.jdbc.driver.OracleDriver";
	
	String query = null;
	String id = "shoppingmall";
	String pw = "SHOPPINGMALL";
	
	// Constructor
	public UserAddressDAO() {
		try {
			Class.forName(DriverName);
			conn = DriverManager.getConnection(url, id, pw);
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	// Method
	// All Connection close()
	public void DBclose() {
		try {
			if(pstmt != null)	pstmt.close();
			if(rs != null)		rs.close();
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	//수정해볼것
	//1,2 Method를 HashMap을 이용해 하나의 메소드로 만들기
	
	// 2. Select User Address
	public ArrayList<UserAddressDO> UserAddress(String userId){
		ArrayList<UserAddressDO> UserAddress = new ArrayList<UserAddressDO>();
		
		query = "SELECT * FROM UserAddress WHERE userId = '"+userId+"'";
		
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				UserAddressDO data = new UserAddressDO();
				
				data.setUserId(rs.getString("userId"));
				data.setRoadAddrPart1(rs.getString("roadAddrPart1"));
				data.setRoadAddrPart2(rs.getString("roadAddrPart2"));
				data.setJibunAddr(rs.getString("jibunAddr"));
				data.setEngAddr(rs.getString("engAddr"));
				data.setZipNo(rs.getString("zipNo"));
				data.setAdmCd(rs.getString("AdmCd"));
				data.setRnMgtSn(rs.getString("rnMgtSn"));
				data.setBdMgtSn(rs.getString("bdMgtSn"));
				data.setAddrDetail(rs.getString("addrDetail"));
				data.setDetBdNmList(rs.getString("detBdNmList"));
				data.setBdNm(rs.getString("BdNm"));
				data.setBdKdcd(rs.getString("bdKdcd"));
				data.setSiNm(rs.getString("SiNm"));
				data.setSggNm(rs.getString("sggNm"));
				data.setEmdNm(rs.getString("emdNm"));
				data.setLiNm(rs.getString("liNm"));
				data.setRn(rs.getString("rn"));
				data.setUdrtYn(rs.getString("udrtYn"));
				data.setBuldMnnm(rs.getInt("buldMnnm"));
				data.setBuldSlno(rs.getInt("buldSlno"));
				data.setMtYn(rs.getString("mtYn"));
				data.setLnbrMnnm(rs.getInt("lnbrMnnm"));
				data.setLnbrSlno(rs.getInt("lnbrSlno"));
				data.setEmdNo(rs.getString("emdNo"));
				
				UserAddress.add(data);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
		return UserAddress;
	}
	// 1. Select All User Address
	public ArrayList<UserAddressDO> SelectAllUserAddress(){
		ArrayList<UserAddressDO> UserAddress = new ArrayList<UserAddressDO>();
		query = "SELECT * FROM UserAddress";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				UserAddressDO data = new UserAddressDO();
				
				data.setUserId(rs.getString("userId"));
				data.setRoadAddrPart1(rs.getString("roadAddrPart1"));
				data.setRoadAddrPart2(rs.getString("roadAddrPart2"));
				data.setJibunAddr(rs.getString("jibunAddr"));
				data.setEngAddr(rs.getString("engAddr"));
				data.setZipNo(rs.getString("zipNo"));
				data.setAdmCd(rs.getString("AdmCd"));
				data.setRnMgtSn(rs.getString("rnMgtSn"));
				data.setBdMgtSn(rs.getString("bdMgtSn"));
				data.setAddrDetail(rs.getString("addrDetail"));
				data.setDetBdNmList(rs.getString("detBdNmList"));
				data.setBdNm(rs.getString("BdNm"));
				data.setBdKdcd(rs.getString("bdKdcd"));
				data.setSiNm(rs.getString("SiNm"));
				data.setSggNm(rs.getString("sggNm"));
				data.setEmdNm(rs.getString("emdNm"));
				data.setLiNm(rs.getString("liNm"));
				data.setRn(rs.getString("rn"));
				data.setUdrtYn(rs.getString("udrtYn"));
				data.setBuldMnnm(rs.getInt("buldMnnm"));
				data.setBuldSlno(rs.getInt("buldSlno"));
				data.setMtYn(rs.getString("mtYn"));
				data.setLnbrMnnm(rs.getInt("lnbrMnnm"));
				data.setLnbrSlno(rs.getInt("lnbrSlno"));
				data.setEmdNo(rs.getString("emdNo"));
				
				UserAddress.add(data);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
		return UserAddress;
	}
	
	// 3. Insert Data
	public void InsertUserAddress(UserAddressDO data) {
		try {
			query = "INSERT INTO UserAddress (userid, roadFullAddr,roadAddrPart1,addrDetail,roadAddrPart2,engAddr, jibunAddr, zipNo, admCd, rnMgtSn, bdMgtSn,detBdNmList,bdNm,bdKdcd,siNm,sggNm,emdNm,liNm,rn,udrtYn,buldMnnm,buldSlno,mtYn,lnbrMnnm,lnbrSlno,emdNo) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			
			pstmt = conn.prepareStatement(query);
			pstmt.setString(1, data.getUserId());
			pstmt.setString(2, data.getRoadFullAddr());
			pstmt.setString(3, data.getRoadAddrPart1());
			pstmt.setString(4, data.getRoadAddrPart2());
			pstmt.setString(5, data.getAddrDetail());
			pstmt.setString(6, data.getEngAddr());
			pstmt.setString(7, data.getJibunAddr());
			pstmt.setString(8, data.getZipNo());
			pstmt.setString(9, data.getAdmCd());
			pstmt.setString(10, data.getRnMgtSn());
			pstmt.setString(11, data.getBdMgtSn());
			pstmt.setString(12, data.getDetBdNmList());
			pstmt.setString(13, data.getBdNm());
			pstmt.setString(14, data.getBdKdcd());
			pstmt.setString(15, data.getSiNm());
			pstmt.setString(16, data.getSggNm());
			pstmt.setString(17, data.getEmdNm());
			pstmt.setString(18, data.getLiNm());
			pstmt.setString(19, data.getRn());
			pstmt.setString(20, data.getUdrtYn());
			pstmt.setInt(21, data.getBuldMnnm());
			pstmt.setInt(22, data.getBuldSlno());
			pstmt.setString(23, data.getMtYn());
			pstmt.setInt(24, data.getLnbrMnnm());
			pstmt.setInt(25, data.getLnbrSlno());
			pstmt.setString(26, data.getEmdNo());
			
			pstmt.executeUpdate();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
	}
}
