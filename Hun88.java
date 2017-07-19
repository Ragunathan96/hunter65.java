import java.util.Scanner;

public class Hun88 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Sample String: ");
		String str=s.next();	
		String rev=new StringBuffer(str).reverse().toString();
		char ch[]=rev.toCharArray();
		System.out.println("Output String: ");
		for(int i=0;i<ch.length;i++){
			for(int j=i+1;j<ch.length;j++){
				if(ch[i]==ch[j]){
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0'){
				System.out.print(String.valueOf(ch[i]));	
		}
			
		}
	}

}
