import java.util.Scanner;

public class Hunt {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		String str="";
		String st="";
		int l1=s1.length();
		int l2=s2.length();
		int l=0;
		if(l1>l2){	
			l=l1-l2;
			for(int i=1;i<l+1;i++){
				str=str+String.valueOf(i);
			}
			st=s2+str;
			for(int j=0;j<l1;j++){
				System.out.print(s1.charAt(j)+""+st.charAt(j));
			}
		}else if(l1==l2){
			for(int i=0;i<l1;i++){
				System.out.print(s1.charAt(i)+""+s2.charAt(i));
			}
		}else{
			l=l2-l1;
			for(int i=1;i<l+1;i++){
				str=str+String.valueOf(i);
			}
			st=s1+str;
			for(int j=0;j<l2;j++){
				System.out.print(st.charAt(j)+""+s2.charAt(j));
			}
		}
	}
}
