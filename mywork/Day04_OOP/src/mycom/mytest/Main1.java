package mycom.mytest;

public class Main1 {
	public static void main(String[] args) {
		//전체 프로세스의 로직
		//실체 생성 과정(메모리에) --> 실행하려고
		int i = 0; //기본형 데이터타입 -> 
		Player pobj = new Player(); //커스텀 데이터타입
		pobj.display();
		Enemy eobj = new Enemy();
		eobj.display();
	}
};