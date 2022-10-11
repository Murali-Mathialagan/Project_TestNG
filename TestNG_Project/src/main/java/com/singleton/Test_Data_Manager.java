package com.singleton;

import java.io.IOException;

public class Test_Data_Manager {

	private Test_Data_Manager(){
	}

	public static Test_Data_Manager get_Instance_Manager() {
		Test_Data_Manager manager = new Test_Data_Manager();
		return manager;
	}

	public Test_Data_Reader get_Instance_Reader() throws IOException  {
		Test_Data_Reader reader = new Test_Data_Reader();
		return reader;
	}

}
