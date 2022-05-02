package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void reportGen(String jsonPath) {
		
		File c=new File(System.getProperty("user.dir")+"\\All Report\\jvm");
		
		Configuration a=new Configuration(c, "facebook");
		
		a.addClassifications("broswer", "chrome");
		a.addClassifications("version", "jdk1.8");
		
		List<String> li=new ArrayList<String>();
		
		li.add(jsonPath);
		
		ReportBuilder r=new ReportBuilder(li, a);
		r.generateReports();
		
		
		
		
		

	}
   
	
	
	
	
		
		
		
		
	}


