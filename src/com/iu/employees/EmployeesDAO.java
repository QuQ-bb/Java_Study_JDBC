package com.iu.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.iu.util.DBConnector;

public class EmployeesDAO {
	EmployeesDTO employeesDTO = null;
	
	public void getJoinTest(EmployeesDTO employeesDTO)throws Exception{
		Connection con = DBConnector.getConnection();
		String sql  = "SELECT E.EMPLOYEE_ID, E.FIRST_NAME, D.DEPARTMENT_NAME "
					+ "FROM EMPLOYEES E "
					+	"INNER JOIN "
					+	"DEPARTMENTS D "
					+	"ON E.DEPARTMENT_ID = D.DEPARTMENT_ID "
					+	"WHERE E.EMPLOYEE_ID =? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1,employeesDTO.getEmployee_id());
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			employeesDTO = new EmployeesDTO();
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setSalary(rs.getInt("SALARY"));
			//여기없는 컬럼을 사용하고 싶으면 어떻게 해야하는가?
			//상속을 받던가 		= IS A 개념을 맞춰보기 
			// 멤버변수로 선언하던가 = HAS A 개념 맞춰보기
			//안꺼내오는건 안쓰면 됨
			//부서는 사원을 가지고 있다. 
		}
		DBConnector.disConnect(rs, ps, con);
	}
	
	public void getSalaryInfo()throws Exception {
		Connection con = DBConnector.getConnection();
		String sql = "SELECT SUM(SALARY), AVG(SALARY),MAX(SALARY)AS MAX FROM EMPLOYEES";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
		int sum	= rs.getInt("SUM(SALARY)");	//조회할 컬럼명
		double avg = rs.getDouble(2);	//인덱스번호를 사용해서 부르기
		int max  = rs.getInt("MAX");	//별칭을 정해줘서 문자열줄이기
		System.out.println("SUM = "+sum);
		System.out.println("AVG = "+avg);
		System.out.println("MAX = "+max);
		}
		
		DBConnector.disConnect(rs, ps, con);
	}
	
	public EmployeesDTO getDetail(int employee_id)throws Exception {
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM EMPLOYEES WHERE EMPLOYEE_ID=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, employee_id);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			employeesDTO = new EmployeesDTO();
			
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setEmail(rs.getString("EMAIL"));
			employeesDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
			employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setSalary(rs.getInt("SALARY"));
			employeesDTO.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
		}
		
		DBConnector.disConnect(rs, ps, con);
		return employeesDTO;
		
	}
	
	public ArrayList<EmployeesDTO> getList()throws Exception {
		
		Connection con = DBConnector.getConnection();
		String sql = "SELECT * FROM EMPLOYEES";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		ArrayList<EmployeesDTO> al = new ArrayList();
		while(rs.next()) {
			
			employeesDTO = new EmployeesDTO();
			
			employeesDTO.setEmployee_id(rs.getInt("EMPLOYEE_ID"));
			employeesDTO.setFirst_name(rs.getString("FIRST_NAME"));
			employeesDTO.setLast_name(rs.getString("LAST_NAME"));
			employeesDTO.setEmail(rs.getString("EMAIL"));
			employeesDTO.setPhone_number(rs.getString("PHONE_NUMBER"));
			employeesDTO.setHire_date(rs.getDate("HIRE_DATE"));
			employeesDTO.setJob_id(rs.getString("JOB_ID"));
			employeesDTO.setSalary(rs.getInt("SALARY"));
			employeesDTO.setCommission_pct(rs.getDouble("COMMISSION_PCT"));
			employeesDTO.setManager_id(rs.getInt("MANAGER_ID"));
			employeesDTO.setDepartment_id(rs.getInt("DEPARTMENT_ID"));
			
			al.add(employeesDTO);
		}
		DBConnector.disConnect(rs, ps, con);
		return al;
	}

}
