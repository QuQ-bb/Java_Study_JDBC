package com.iu.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class CountriesDAO {

	CountriesDTO countriesDTO =null;
	//getDetail :countries_id
	public CountriesDTO getDetail(String country_id)throws Exception {
		Connection con = DBConnector.getConnection();
		String sql ="SELECT * FROM COUNTRIES WHERE COUNTRY_ID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, country_id);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			countriesDTO = new CountriesDTO();
			
			String cId = rs.getString("COUNTRY_ID");
			String cName = rs.getString("COUNTRY_NAME");
			int rId = rs.getInt("REGION_ID");
			
			countriesDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countriesDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countriesDTO.setRegion_id(rs.getInt("REGION_ID"));
			
		}
		//6번 자원 해제
		DBConnector.disConnect(rs, ps, con);
		
		return countriesDTO;
	}
	//1.DB연결
	
	//2.쿼리문 작성
	
	//3.쿼리문 미리전송
	
	//4.? 값 세팅
	
	//5.결과값 처리후 전송
	

	public ArrayList<CountriesDTO> getList()throws Exception {
		
		//1DB연결
		Connection con = DBConnector.getConnection();
		//2.쿼리문 작성
		String sql = "SELECT * FROM COUNTRIES";
		
		//3.쿼리 미리전송
		PreparedStatement ps = con.prepareStatement(sql);
		
		//4.
		
		//5.결과처리
		ResultSet rs = ps.executeQuery();
		
		ArrayList<CountriesDTO> al = new ArrayList();
		
		while(rs.next()) {
			countriesDTO = new CountriesDTO();
			
			String country_id = rs.getString("COUNTRY_ID");
			String country_name = rs.getString("COUNTRY_NAME");
			int region_id = rs.getInt("REGION_ID");
			
			countriesDTO.setCountry_id(rs.getString("COUNTRY_ID"));
			countriesDTO.setCountry_name(rs.getString("COUNTRY_NAME"));
			countriesDTO.setRegion_id(rs.getInt("REGION_ID"));
			
			al.add(countriesDTO);
			
//			System.out.println(country_id +"  "+ country_name+"  "+region_id);
//			System.out.println(country_name);
//			System.out.println(region_id);
		}
		DBConnector.disConnect(rs, ps, con);
		return al;
	}
}
