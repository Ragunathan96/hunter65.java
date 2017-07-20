import java.util.Scanner;

public class pro63 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.nextLine();
	char ch[]=s1.toCharArray();
	String s2="";
	String s3="";
	for(int i=0;i<ch.length;i++){
		for(int j=i+1;j<ch.length;j++){
			if(ch[i]==ch[j]){
				ch[j]='\0';
			}
		}
		if(ch[i]!='\0'){
		     s2=s2+String.valueOf((ch[i]));		     
		}
	}
	if(s1.contains(s2)){
		System.out.println(s2+" with the length of "+s2.length());
	}else{
		for(int i=0;i<s2.length();i++){
		s3=s2.substring(0,i)+s2.substring(i+1,s2.length());
		if(s1.contains(s3)){
			System.out.println(s3+" with the length of "+s3.length());
		}
	}
	}
}
}
