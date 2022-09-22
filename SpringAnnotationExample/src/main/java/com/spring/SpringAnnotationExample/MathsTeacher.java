package com.spring.SpringAnnotationExample;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MathsTeacher implements Teacher {

	@Override
	public void teach() {
		System.out.println("Hello Student I'm your Maths Sir");
		System.out.println("My Name is Santhosh");
	}

}
