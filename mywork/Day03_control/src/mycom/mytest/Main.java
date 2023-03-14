package mycom.mytest;

public class Main {
	public static void main(String[] args) {
		//제어문이면서 조건문인 switch/case 문
		int month = -8; //1~12  4byte
		String monthStr = ""; //메모리 초기화
		
		switch(month) {
			case 1: 
				monthStr = "January";
				break;
			case 2:
				monthStr = "February";
				break;
			case 3:
				monthStr = "March";
				break;
			case 4:
				monthStr = "April";
				break;
			case 5:
				monthStr = "May";
				break;
			case 6:
				monthStr = "June";
				break;
			case 7:
				monthStr = "July";
				break;
			case 8:
				monthStr = "August";
				break;
			case 9:
				monthStr = "September";
				break;
			case 10:
				monthStr = "October";
				break;
			case 11:
				monthStr = "November";
				break;
			case 12:
				monthStr = "December";
				break;
			default:
				monthStr = "Invalid month";
		}//switch
		System.out.println(monthStr);
	} //main
};
