package com.spring.SpringAnnotationExample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class School {

	@Value("Sri Rahavendra vidyalaya matric hr sec school")
	private String SchoolName;
	
	@Autowired
	private Principal principal;
	
	@Autowired
	private Teacher teacher;
	
	public void test() {
		principal.method();
		teacher.teach();
		System.out.println("School Name: "+SchoolName);
	}
	
}
