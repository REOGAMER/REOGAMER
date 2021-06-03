package com.kh.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentDao {
	private static StudentDao instance;
	private StudentDao() {}
	
//	private static class StudentDaoIns{
//		private static final StudentDao instance = new StudentDao();
//	}
//	
//	public static StudentDao getInstance() {
//		return StudentDaoIns.instance;
//	}
	public static StudentDao getInstance() {
		if(instance == null) {
			instance = new StudentDao();
		}
		return instance;
	}
	
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	private final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private final String ID = "JSP01";
	private final String PW = "1234";
	private void closeAll(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs!=null)try {rs.close();}catch(SQLException e) {}
		if(pstmt!=null)try {pstmt.close();}catch(SQLException e) {}
		if(conn!=null)try {conn.close();}catch(SQLException e) {}
	}
	
	private Connection getConnection() {
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, ID, PW);
			System.out.println(conn);
			return conn;
		}catch(ClassNotFoundException e) {
			System.out.println("not found driver.");
		}catch(SQLException e) {
			System.out.println("DB login denied.");
		}
		return null;
	}
	
	public boolean insertStdnt(StudentVo vo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
		conn = getConnection();
		String sql = "insert into tbl_student(st_num, st_name,"
				+ "		st_major, st_year, st_score, st_etc)"
				+ "		values(?,?,?,?,?,?)";
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, vo.getSt_num());
		pstmt.setNString(2, vo.getSt_name());
		pstmt.setString(3, vo.getSt_major());
		pstmt.setInt(4, vo.getSt_year());
		pstmt.setInt(5, vo.getSt_score());
		pstmt.setString(6, vo.getSt_etc());
		int count = pstmt.executeUpdate();
		if(count > 0) {
			return true;
		}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeAll(null,pstmt,conn);
		}
		return false;
	}
}
