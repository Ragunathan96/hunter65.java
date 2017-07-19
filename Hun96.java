import java.util.Scanner;

public class Hun96 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char ch[]={'z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','r','s','t','u','v','x','y'};
		String a=str.substring(str.length()-1,str.length());
		for(int i=0;i<str.length()-1;i++){
			for(int j=0;j<ch.length;j++){
			if(str.charAt(i)==ch[j]){
				System.out.print(ch[j-1]);
			}
		}
	}System.out.print(a);
	}
}
