package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Project;
import com.xworkz.abstact.app.SoftwareProject;

public class ProjectRunner {

	public static void main(String[] args) {
		
		Project project=new SoftwareProject();
		project.celebrate();
		project.complete();
		project.displayInfo();
		project.implement();
		project.prioritize();
		project.review();
		project.scheduleMeeting();
		project.start();
		project.updateStatus();
		project.test();
		
	}

}
