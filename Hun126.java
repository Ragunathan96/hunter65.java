import java.util.Scanner;

public class Hun126 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter the number:");
		int num=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			if(num==a[i]){
				count++;
			}
		}System.out.println("count:"+count);
		
	}

}
