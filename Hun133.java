import java.util.Scanner;

public class Hun133 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str3="";
		String s1[]=str.split(" ");
		for(int i=s1.length-1;i>=0;i--){
			str3=str3+s1[i]+" ";
		}System.out.println(str3);
	}

}
