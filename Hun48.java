import java.util.Scanner;

public class Hun48 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("String 1: ");
	String s1=s.nextLine();
	System.out.println("String 2: ");
	String s2=s.next();
	int l=s2.length();
	int m=s1.length();
	int x=0;
	if(s1.contains(s2)){
	for(int i=0;i<s1.length()-l;i++){
		if(s1.substring(i,i+l).equals(s2)){
			x=i;
			System.out.println("Output: "+x);
		  }
		}		
	}else{
		System.out.println("Output"+"-1");
	}
		
  }
}
