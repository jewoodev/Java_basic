package mycom.test;

public class Main3 {
	public static void main(String[] args) {
        double money = 2000; // 돈이 있다고 가정, int 타입으로 선언해도 가능
        boolean have_card = false;
        /*if (money > 3000) {
            System.out.println("택시를 타라!"); // 돈이 있으면 "택시를 타라!" 출력
        } else {
        	if (have_card == true) {
            System.out.println("택시를 타라!"); // 돈이 없으면 "걸어가라." 출력
        	} else {
        		System.out.println("걸어가라!");
        	}*/
        	if ((money>=3000) || have_card) {
        		System.out.println("택시를 타고 가라!");
        	} else {
        		System.out.println("걸어가라.");
        }
    }
};