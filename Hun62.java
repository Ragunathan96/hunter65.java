import java.util.Arrays;
import java.util.Scanner;

public class Hun62 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		 int Max=0;
		 Max=a[n-1]-a[0];
		System.out.println("Max benefit "+a[n-1]+" - "+a[0]+" = "+Max+" thousand");
		
	}

}
