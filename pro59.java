import java.util.Scanner;

public class pro59 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number of coins: ");
		int n=s.nextInt();
		System.out.println("The coin values are: ");
		int arr[]=new int[n];
		int a=0;
		int b=0;
		for(int i=0;i<n;i++){
			arr[i]=s.nextInt();
		}
		if(n%2==0){
			for(int i=0;i<n;i+=2){
				a=a+arr[i];			
			}System.out.println(a);
		}else{
			for(int i=0;i<n;i+=2){
				a=a+arr[i];
			}System.out.println("The maximum amount I can Win: "+a);
		}
		
		
		
	}

}
