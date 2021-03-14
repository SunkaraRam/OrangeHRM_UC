package DriverFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.beust.testng.TestNG;

public class ModuleOne {

	public static void main(String[] args) {

		
		  TestNG runner=new TestNG();
		  
		  List<String> suitefiles = new ArrayList<String>();
		  
		  suitefiles.add("D:\\DataDrivernFrameWork22\\testng.xml");
		  
		  runner.setTestSuites(suitefiles);
		  
		  runner.run();
		 

	}

}
