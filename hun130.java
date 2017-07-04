import java.util.Scanner;


public class hun130 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	    String str=s.next();
	    if(str.equals("Mon")|| str.equals("Tue") || str.equals("wed") || str.equals("Thu")|| str.equals("Fri")){
	    	System.out.println("True");
	    }else if(str.equals("sun")){
	    	System.out.println("False");
	    }else{
	    	System.out.println("Invalid String");
	    }
	}

}
