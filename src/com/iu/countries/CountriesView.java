package com.iu.countries;

import java.util.ArrayList;

public class CountriesView {
	
	public void view(CountriesDTO countriesDTO) {
		System.out.println(countriesDTO.getCountry_id()+ "    " + countriesDTO.getCountry_name() + "    " +countriesDTO.getRegion_id());
	}
	
	public void viewAll(ArrayList<CountriesDTO> al) {
		
		for(int i=0; i<al.size(); i++) {
			System.out.println("================================");
			System.out.println(al.get(i).getCountry_id());
			System.out.println(al.get(i).getCountry_name());
			System.out.println(al.get(i).getRegion_id());
		}
	}

}
