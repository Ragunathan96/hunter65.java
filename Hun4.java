import java.util.Scanner;

public class Hun4 {
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Number of elements: ");
	int n=s.nextInt();
	int a[]=new int[n];
	int count=0;
	System.out.println("Array elements are: ");
	for(int i=0;i<n;i++){
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=i+1;j<n;j++){
			if(a[i]==a[j]){
				a[i]=0;
				a[j]=0;
			}
			
		}if(a[i]!=0){
			System.out.println("Unique: "+a[i]);
		}
		
	}
}
}
