package mycom.mytest;

public class Main4 {
	public static void main(String[] args) {
		int i = 0;
		while (i<5) {
			for (int j=0; j<5; j+=1) {
				System.out.print("*");
			}
			System.out.println("");
			i += 1;
		}
	}
}
