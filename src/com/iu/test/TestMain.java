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
//			countriesDAO.getList();
//			countriesDTO = countriesDAO.getDetail("US");
//			rv.view(regionsDTO);
//			rv.viewAll(al);
//			cv.view(countriesDTO);
//			cv.viewAll(countriesDAO.getList());
			ArrayList<EmployeesDTO> al = employeesDAO.getList();
			ev.viewAll(al);
//			employeesDTO = employeesDAO.getDetail(206);
//			ev.view(employeesDTO);
			
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
