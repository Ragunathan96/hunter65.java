import java.util.Scanner;

public class Hun132 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=n;i>0;i--){
			for(int j=0;j<n;j++){
				System.out.print("*");
			}System.out.print(" ");
			for(int k=0;k<n;k++){
				System.out.print("*");
			}
			System.out.println();
		    n--;	
		}
	}

}
