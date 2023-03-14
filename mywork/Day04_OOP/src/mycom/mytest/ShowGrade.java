package mycom.mytest;

import java.util.Random;

public class ShowGrade {
	private String name;
	private int nlang, eng, math;
	
	public ShowGrade(String name_1) {
		name = name_1;
		Random rdm = new Random();
		nlang = rdm.nextInt(101);
		eng = rdm.nextInt(101);
		math = rdm.nextInt(101);
	}
	public void display() {
		System.out.println("이름:"+name+", 국어:"+nlang+", 영어"+eng+", 수학"+math);
	}
};