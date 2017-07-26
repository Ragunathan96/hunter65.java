import java.util.Scanner;

public class Hun10 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a1[]=new int[n];
		int m=s.nextInt();
		int a2[]=new int[m];
		int count=0;
		for(int i=0;i<n;i++){
			a1[i]=s.nextInt();
		}
		for(int j=0;j<m;j++){
			a2[j]=s.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				if(a1[i]==a2[j]){
					count++;
				}
			}
		}if(count==a1.length){
			System.out.println("a1 is a subset of a2");
		}System.out.println("Not a subset");
	}
}
