import java.util.Scanner;

public class Hun8 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int k=0;k<n;k++){
			a[k]=s.nextInt();	
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				for(int k=j+1;k<n;k++){
				if(a[i]+a[j]==a[k]){
					System.out.println("i,j,k are "+a[i]+","+a[j]+","+a[k]);
				}
			}
		}
	}
	}
}
