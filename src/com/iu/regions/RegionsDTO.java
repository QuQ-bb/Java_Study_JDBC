package com.iu.regions;

public class RegionsDTO {
	//멤버변수 접근지정자 : private
	//Getter/Setter
	//기본 생성자 필수
	//멤버변수명은 Table의 컬럼명과 동일하게 선언
	
	private Integer region_id;
	private String regions_name;
	
	
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getRegions_name() {
		return regions_name;
	}
	public void setRegions_name(String regions_name) {
		this.regions_name = regions_name;
	}

}
