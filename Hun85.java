import java.util.Scanner;

public class Hun85 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("n : ");
		int n=s.nextInt();
		int count =0;
		for(int i=0;i<n+1;i++){
			String s1=String.valueOf(i);
			for(int j=0;j<s1.length();j++){
				if(s1.charAt(j)=='2'){
					count++;
				}
			}
		}System.out.println("Number of 2's between 0 and "+n +" : "+ count);
	}
}
