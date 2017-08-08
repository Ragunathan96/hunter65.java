import java.util.Scanner;

public class Hun93 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String str3="";
		String c="";
		int a[]=new int[str.length()];
		String s1[]=str.split(" ");
		for(int i=0;i<s1.length;i++){
			str3=str3+new StringBuffer(s1[i]).reverse().toString()+" ";
		}
		String s3="";
		String s2="";	
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				 s2=String.valueOf(str3.charAt(i)).toUpperCase();
			}
			else
			{
				 s2=String.valueOf(str3.charAt(i)).toLowerCase();
			}
			 s3+=s2;
		}
		System.out.println(s3);
		
	}

}
