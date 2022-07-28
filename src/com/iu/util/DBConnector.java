package com.iu.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {
	//1. 접속 정보 작성
	
	//DB연동
	//필요한 정보
	
	//메소드 형식은 동사형식으로 쓰자
	public static Connection getConnection()throws Exception { //static 객체를 만들지않고 바로 호출하겠다 이말이야
		//id정보
		String user = "hr";
		String password = "hr";
		//ip:port
		String url = "jdbc:oracle:thin:@192.168.7.58:1521:xe";	//본인 아이피쓰기 잘 기억 못하면 127.0.0.1 or localhost
		//driver명
		String driver ="oracle.jdbc.driver.OracleDriver";
		
		//2. driver 메모리에 로딩
		Class.forName(driver);
		
		//3. DB 연결 후 Connection 객체 반환
		Connection con = DriverManager.getConnection(url, user, password);	//con =socket
		//호출할때마다 con을 만들어준다
		
		System.out.println(con);
		
		return con;
		
		
	}
	public static void disConnect(PreparedStatement ps ,Connection con) {
		
		try {
			ps.close();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void disConnect(ResultSet rs,PreparedStatement ps , Connection con) {
		
		try {
			rs.close();
			ps.close();
			con.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}

}
