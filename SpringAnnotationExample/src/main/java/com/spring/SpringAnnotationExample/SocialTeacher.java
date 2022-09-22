package com.spring.SpringAnnotationExample;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class SocialTeacher implements Teacher{

	public void teach() {
		System.out.println("Hi Students I'm your Social Mam");
		System.out.println("My Name is Chitra");
	}
}
