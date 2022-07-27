package com.iu.regions;

import java.sql.ResultSet;
import java.util.ArrayList;

public class RegionsView {
	
	public void view(RegionsDTO regionsDTO) {
		
//		for(int i=0; i<regionsDTO.)
		System.out.println("------------------------------");
		System.out.println(regionsDTO.getRegion_id()+"\t");
		System.out.println(regionsDTO.getRegions_name());
	}
	
	public void viewAll(ArrayList<RegionsDTO> al) {
		for(int i=0; i<al.size(); i++) {
		System.out.println("------------------------------");
		System.out.println(al.get(i).getRegion_id()+"\t");
		System.out.println(al.get(i).getRegions_name());
		}
	}

}
