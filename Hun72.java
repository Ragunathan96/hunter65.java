import java.util.Scanner;

public class Hun72 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input==> ");
		String s1=s.nextLine();
		String str[]=s1.split(" ");
		String rev="";
		for(int i=0;i<str.length;i++){
			if( i%2==0){
			 rev=rev+new StringBuffer(str[i]).reverse().toString()+" ";
			// System.out.print(rev+" ");
			}else{
				rev=rev+str[i]+" ";
			}
		}System.out.print("Output==> "+rev+" ");
	}

}
