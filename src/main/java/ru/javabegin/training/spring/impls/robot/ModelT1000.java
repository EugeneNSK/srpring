package ru.javabegin.training.spring.impls.robot;

import ru.javabegin.training.spring.interfaces.Hand;
import ru.javabegin.training.spring.interfaces.Head;
import ru.javabegin.training.spring.interfaces.Leg;
import ru.javabegin.training.spring.interfaces.Robot;

public class ModelT1000 implements Robot {

	private Hand hand;
	private Leg leg;
	private Head head;
	private String color = "default";
	private int year = 1970;

	public ModelT1000() {
	}

	public ModelT1000(Hand hand, Leg leg, Head head) {
		this.hand = hand;
		this.leg = leg;
		this.head = head;
	}
	
	public ModelT1000(Hand hand, Leg leg, Head head, String color, int year) {
		this.hand = hand;
		this.leg = leg;
		this.head = head;
		this.color = color;
		this.year = year;
	}


	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public void setLeg(Leg leg) {
		this.leg = leg;
	}

	public void setHead(Head head) {
		this.head = head;
	}

	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
		System.out.println("Robot parametrs: color= "+ color+ ", year= "+ year);
	}

	
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
