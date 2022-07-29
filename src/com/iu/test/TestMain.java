package com.iu.test;

import java.util.ArrayList;

import com.iu.countries.CountriesDAO;
import com.iu.countries.CountriesDTO;
import com.iu.countries.CountriesView;
import com.iu.employees.EmployeesDAO;
import com.iu.employees.EmployeesDTO;
import com.iu.employees.EmployeesView;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;

public class TestMain {

	public static void main(String[] args) {
		RegionsDTO regionsDTO= null;
		CountriesDTO countriesDTO = null;
		EmployeesDTO employeesDTO = null;
//		DBConnector dbConnector = new DBConnector();
//		
//		try {
//			dbConnector.getConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		CountriesDAO countriesDAO = new CountriesDAO();
		CountriesView cv = new CountriesView();
		RegionsDAO regionsDAO = new RegionsDAO();
		RegionsView rv = new RegionsView();
		EmployeesDAO employeesDAO = new EmployeesDAO();
		EmployeesView ev = new EmployeesView();
//		
		try {
//			ArrayList<RegionsDTO> al =  regionsDAO.getList();
//			regionsDTO = regionsDAO.getDetail(2);
//			rv.view(regionsDTO);
//			rv.viewAll(al);
//			regionsDTO = new RegionsDTO();
//			regionsDTO.setRegion_id(6);
//			regionsDTO.setRegions_name("Mars");
//			int result = regionsDAO.setRegion(regionsDTO);
//			if(result >0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
//			countriesDAO.getList();
//			countriesDTO = countriesDAO.getDetail("US");
//			cv.view(countriesDTO);
//			cv.viewAll(countriesDAO.getList());
//			countriesDTO = new CountriesDTO();
//			countriesDTO.setCountry_id("TW");
//			countriesDTO.setCountry_name("Taiwan");
//			countriesDTO.setRegion_id(3);
//			int result = countriesDAO.setCountry(countriesDTO);
//			
//			if(result >0) {
//				System.out.println("성공");
//			}else {
//				System.out.println("실패");
//			}
			
//			ArrayList<EmployeesDTO> al = employeesDAO.getList();
//			ev.viewAll(al);
//			employeesDTO = employeesDAO.getDetail(206);
//			ev.view(employeesDTO);
//			employeesDAO.getSalaryInfo();
			employeesDAO.getJoinTest(employeesDTO);
			
		} catch (Exception e) {
//			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		
//		
//		try {
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
	}

}
