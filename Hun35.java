import java.util.Scanner;

public class Hun35 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		char ch[]=s1.toCharArray();
		String s2="";
		for(int i=0;i<s1.length();i++){
			s2=s1.substring(0,i)+s1.substring(i+1,s1.length());
			if(s2.length()%2==0){
			if(s2.substring(0,s2.length()/2).equals(s2.substring((s2.length()/2),s2.length()))){
				System.out.println("The given string is double string possibly by deleting a character");
				break;
			}
			}else{
				System.out.println("Not a double string");
				break;
			}
		}
	}

}
