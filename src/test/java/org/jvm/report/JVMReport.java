package org.jvm.report;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	
	public static void generateJvmReport(String jsonReportFolderPath) {

		// 1. Mention the target folder location
		File f = new File("D:\\NewMaven\\Cucumber11.30am\\JVMReport");
		
		// 2.Add details to the report using Configuration class
		Configuration c = new Configuration(f, "Facebook & Amazon");
		c.addClassifications("Platform Name", "Windows");
		c.addClassifications("Platform Version", "10");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Browser Version", "90.0");
		c.addClassifications("Sprint No", "2");
		 
		// 3.Add json file paths into List<String>
		List<String> l = new ArrayList<String>();
		l.add(jsonReportFolderPath); 
		
		// 4. Create object for ReportBuilder class
		ReportBuilder rb = new ReportBuilder(l, c);
		
		// using the created object call generateReports() method
		rb.generateReports();
		
	}

}
