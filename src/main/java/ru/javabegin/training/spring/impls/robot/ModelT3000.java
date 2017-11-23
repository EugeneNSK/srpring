package ru.javabegin.training.spring.impls.robot;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT3000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;
	private String color = "default";
	private int year = 1970;

	public ModelT3000() {
	}

	
	public ModelT3000(Hand hand, Leg leg, Head head, String color, int year) {
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.year = year;
	}


	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
		System.out.println("Robot parametrs: color= "+ color+ ", year= "+ year);
	}

	
	public void dance() {
		System.out.println("T3000 is dancing!");
	}

}
