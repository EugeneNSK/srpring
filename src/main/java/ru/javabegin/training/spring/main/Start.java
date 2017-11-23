package ru.javabegin.training.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ru.javabegin.training.spring.impls.robot.ModelT1000;
import ru.javabegin.training.spring.impls.robot.ModelT2000;
import ru.javabegin.training.spring.impls.robot.ModelT3000;

public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000construct");
		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000property");
//		ModelT1000 t1000 = (ModelT1000) context.getBean("t1000value");
		t1000.dance();
		t1000.action();
	
		
		ModelT2000 t2000 = (ModelT2000) context.getBean("t2000");
		t2000.dance();
		t2000.action();
		
		ModelT3000 t3000 = (ModelT3000) context.getBean("t3000");
		t3000.dance();
		t3000.action();
	}
}
