import java.util.Scanner;

public class Hun75 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("Input");
		for(int k=0;k<n;k++){
			a[k]=s.nextInt();
		}
		System.out.println("Output");
		for(int i=0;i<n-1;i++){
			if(a[i]>a[i+1]){
				a[i]=a[i+1];
			}else{
				a[i]=-1;
			}System.out.print(a[i]+" ");
		}System.out.print(-1);
	}

}
