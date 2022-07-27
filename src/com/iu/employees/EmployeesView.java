package com.iu.employees;

import java.util.ArrayList;

public class EmployeesView {
	
	public void view(EmployeesDTO employeesDTO) {
		System.out.println(employeesDTO.getEmployee_id());
		System.out.println(employeesDTO.getFirst_name());
		System.out.println(employeesDTO.getLast_name());
		System.out.println(employeesDTO.getEmail());
		System.out.println(employeesDTO.getPhone_number());
		System.out.println(employeesDTO.getHire_date());
		System.out.println(employeesDTO.getJob_id());
		System.out.println(employeesDTO.getSalary());
		System.out.println(employeesDTO.getCommission_pct());
		System.out.println(employeesDTO.getManager_id());
		System.out.println(employeesDTO.getDepartment_id());
	}
	
	public void viewAll(ArrayList<EmployeesDTO> al) {
		
		for(int i =0; i<al.size(); i++) {
			System.out.println("===============================================================");
			System.out.println(al.get(i).getEmployee_id());
			System.out.println(al.get(i).getFirst_name());
			System.out.println(al.get(i).getLast_name());
			System.out.println(al.get(i).getEmail());
			System.out.println(al.get(i).getPhone_number());
			System.out.println(al.get(i).getHire_date());
			System.out.println(al.get(i).getJob_id());
			System.out.println(al.get(i).getSalary());
			System.out.println(al.get(i).getCommission_pct());
			System.out.println(al.get(i).getManager_id());
			System.out.println(al.get(i).getDepartment_id());
			
		}
	}

	
}
