package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	
	//1.Regions의 모든 데이터 가져오기
	public void getList()throws Exception {
		//1.DB연결
		Connection con= DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";	//자바에서 쿼리문 끝 ;은 붙이지 않아도 자동으로 붙여준다
		
		//3.Query문을 미리 전송하는 기능
		PreparedStatement st = con.prepareStatement(sql); //준비중 ㅇㅅㅇ
		
		//4.
		
		
		//5.최종 전송 후 결과 처리
		//select 겱과물은 resultset에 보관 resultset은 db에 있는것
		ResultSet rs = st.executeQuery();	//rs에 담는것
		
		while(rs.next()) {	//해석 : rs에서 한줄 읽으세요
				//이제 rs를 꺼낸다
		int id = rs.getInt("Region_id");	//db에서 자바로 변ㄹ환되는 타입을 get타입으로  꺼내주면됨
		String name =rs.getString("Region_name");
		System.out.println(id);
		System.out.println(name);
		}//while
		
	}
}
