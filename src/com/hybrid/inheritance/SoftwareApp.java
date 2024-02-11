package com.hybrid.inheritance;

public class SoftwareApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackendDeveloper bd=new BackendDeveloper();
		bd.doProject();
		bd.doBackEndDeveloper();
		FrontendDeveloper fd=new FrontendDeveloper();
		fd.doProject();
		fd.doWebproject();
		JavaDeveloper jd=new JavaDeveloper();
		jd.doProject();
		jd.doBackEndDeveloper();
		jd.doJavaProject();

	}

}
