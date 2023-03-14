package mycom.mytest;

import java.util.Random;

public class Enemy {
	private int x, y;
	private String myShape="Enemy";
	
	public Enemy() {
		Random rnd = new Random();
		x = rnd.nextInt(1000);
		y = rnd.nextInt(1000);
	}
	public void display() {
		System.out.println("x="+x+",y="+y+":"+myShape);
	}
	public void goUp() {
		y = y + 1;
		display();
	}
	public void goDown() {
		y = y - 1;
		display();
	}
	public void moveLeft() {
		x=x-1;
		display();
	}
	
	public void moveRight() {
		x=x+1;
		display();
	}
};