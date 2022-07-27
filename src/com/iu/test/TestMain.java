package com.iu.test;

import com.iu.util.DBCconnector;

public class TestMain {

	public static void main(String[] args) {
	
		DBCconnector dbcConnector = new DBCconnector();
		
		try {
			dbcConnector.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
