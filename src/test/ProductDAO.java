package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductDAO {
	Connection conn = null;
	ResultSet rs = null;
	PreparedStatement pstmt = null;
	

	String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	String DriverName = "oracle.jdbc.driver.OracleDriver";
	String id = "shoppingmall";
	String pw = "SHOPPINGMALL";
	String query = null;

	// Constructor
	public ProductDAO() {
		try {
			Class.forName(DriverName);
			conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// Method
	// DB Connection close()
	public void DBclose() {
		try {
			if (rs != null)
				rs.close();
			if (pstmt != null)
				pstmt.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	// 1. Insert Data
	public void InsertProductData(ProductDO data) {
		query = "INSERT INTO Product VALUES (Product_seq.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
		try {
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, data.getPro_subject());
			pstmt.setInt(2, data.getPro_price());
			pstmt.setString(3, data.getPro_release());
			pstmt.setString(4, data.getPro_assessment());
			pstmt.setString(5, data.getPro_distributor());
			pstmt.setString(6, data.getPro_production());
			pstmt.setString(7, data.getPro_explanation());

			pstmt.executeUpdate();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
	}

	// 2. Select All Data
	public ArrayList<ProductDO> SelectAllData() {
		ArrayList<ProductDO> Product = new ArrayList<ProductDO>();
		query = "SELECT * FROM PRODUCT";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ProductDO data = new ProductDO();

				data.setPro_index(rs.getInt("product_index"));
				data.setPro_subject(rs.getString("product_subject"));
				data.setPro_price(rs.getInt("product_price"));
				data.setPro_release(rs.getString("product_release"));
				data.setPro_assessment(rs.getString("product_assessment"));
				data.setPro_distributor(rs.getString("product_distributor"));
				data.setPro_production(rs.getString("product_production"));
				data.setPro_explanation(rs.getString("product_explanation"));
				
				Product.add(data);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
		return Product;
	}

	// 3. Select
	public ArrayList<ProductDO> SelectData(String product_index) {
		ArrayList<ProductDO> Product = new ArrayList<ProductDO>();
		query = "SELECT * FROM PRODUCT WHERE PRODUCT_INDEX = '" + product_index + "'";
		try {
			pstmt = conn.prepareStatement(query);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				ProductDO data = new ProductDO();

				data.setPro_subject(rs.getString("product_subject"));
				data.setPro_price(rs.getInt("product_price"));
				data.setPro_release(rs.getString("product_release"));
				data.setPro_assessment(rs.getString("product_assessment"));
				data.setPro_distributor(rs.getString("product_distributor"));
				data.setPro_production(rs.getString("product_production"));
				data.setPro_explanation(rs.getString("product_explanation"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			DBclose();
		}
		return Product;
	}
}
