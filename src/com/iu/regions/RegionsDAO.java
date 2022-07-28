package com.iu.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class RegionsDAO {
	
	RegionsDTO regionsDTO = null;
	//3. REGIONS에 데이터 추가
	public int setRegion(RegionsDTO regionsDTO)throws Exception {
		Connection con = DBConnector.getConnection();
		String sql ="INSERT INTO REGIONS VALUES(?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, regionsDTO.getRegion_id());
		ps.setString(2, regionsDTO.getRegions_name());
		
		//삽입할 때는 ResultSet을 사용하지않음 
		int result = ps.executeUpdate();	//1이면 성공 0이면 실패
		
		DBConnector.disConnect(ps, con);
		return result;
	}
	
	
	
	//2.REGIONS에서 하나의 결과(ROW)
	public RegionsDTO getDetail(int region_id)throws Exception {
		//1. DB연결
		Connection con = DBConnector.getConnection();
		//2.쿼리문 작성
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = ?";	//변수의 값을 알지못할때 ?로 보내주기
		//3.만든 sql문 미리전송
		PreparedStatement ps = con.prepareStatement(sql);
		
		//4.?의 값을 세팅해주자
		//where num betweeen ?(1) and ?(2);
		//이럴경우 앞에 있는 물음표에 인덱스 1번 뒤에 있는것에 2번을 세팅해준다
		ps.setInt(1, region_id);
		//oracle은 인덱스 시작을 1로 시작한다.
		
		//5.최종 전송후 결과 처리
		ResultSet rs = ps.executeQuery();
		
		
//		int rId =0;
//		String rName= null;
		if(rs.next()) {
			regionsDTO = new RegionsDTO();
//			 rId = rs.getInt(1);
//			 rName = rs.getString(2);
//			System.out.println(rId);
//			System.out.println(rName);
			 regionsDTO.setRegion_id(rs.getInt("REGION_ID"));
			 regionsDTO.setRegions_name(rs.getString("REGION_NAME"));
		}//if
		
		//6.자원해제
		DBConnector.disConnect(rs, ps, con);
		return regionsDTO;
		
	}
	
	
	
	//1.Regions의 모든 데이터 가져오기
	public ArrayList<RegionsDTO> getList()throws Exception {
		//1.DB연결
		Connection con= DBConnector.getConnection();
		
		//2. Query문 작성
		String sql = "SELECT * FROM REGIONS";	//자바에서 쿼리문 끝 ;은 붙이지 않아도 자동으로 붙여준다
		
		//3.Query문을 미리 전송하는 기능
		PreparedStatement ps = con.prepareStatement(sql); //준비중 ㅇㅅㅇ
		
		//4.
		
		
		//5.최종 전송 후 결과 처리
		//select 겱과물은 resultset에 보관 resultset은 db에 있는것
		ResultSet rs = ps.executeQuery();	//rs에 담는것
		
		ArrayList<RegionsDTO> al = new ArrayList();
		while(rs.next()) {	//해석 : rs에서 한줄 읽으세요
				//이제 rs를 꺼낸다
			regionsDTO = new RegionsDTO();
			
//		int id = rs.getInt("Region_id");	//db에서 자바로 변ㄹ환되는 타입을 get타입으로  꺼내주면됨
//		String name =rs.getString("Region_name");
		regionsDTO.setRegion_id(rs.getInt("Region_id"));
		regionsDTO.setRegions_name(rs.getString("Region_name"));
		
		al.add(regionsDTO);
		}//while
		
		//6.자원해제
		DBConnector.disConnect(rs, ps, con);
		return al;
	}
}
