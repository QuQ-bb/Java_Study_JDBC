package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class CountriesDAO {

	public void getList()throws Exception {
		
		//1DB연결
		Connection con = DBConnector.getConnection();
		//2.쿼리문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//3.쿼리 미리전송
		PreparedStatement ps = con.prepareStatement(sql);
		
		//4.
		
		//5.결과처리
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			String country_id = rs.getString("COUNTRY_ID");
			String country_name = rs.getString("COUNTRY_NAME");
			int region_id = rs.getInt("REGION_ID");
			
			System.out.println(country_id +"  "+ country_name+"  "+region_id);
//			System.out.println(country_name);
//			System.out.println(region_id);
		}
	}
}
