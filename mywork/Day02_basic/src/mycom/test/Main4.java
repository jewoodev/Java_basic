package mycom.test;
import java.util.ArrayList;


/*
 * public class Main4 { public static void main(String[] args) { ArrayList
 * pocket = new ArrayList(); pocket.add(0, "paper"); pocket.add(1, "money");
 * pocket.add(2, "phone");
 * 
 * if (pocket.contains("money")) { System.out.println("가만히 있어라."); } else {
 * System.out.println("카드를 꺼내라."); } } };
 */
 


  public class Main4 { 
	  public static void main(String[] args) { 
		  ArrayList pocket = new ArrayList(); 
		  pocket.add(0, "paper"); 
		  pocket.add(1, "money");
		  pocket.add(2, "phone");
		  
		  if (pocket.contains("money")) { 
			  System.out.println("택시를 타라."); 
		  } else if (pocket.contains("card")) {
			  System.out.println("택시를 타라.");
		  } else {
			  System.out.println("걸어 가라.");
		  }
	  }
  };
 