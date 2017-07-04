import java.util.Scanner;


public class hun65 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no of element:");
		int n=s.nextInt();
		System.out.println("The array elements are:");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		System.out.println("Enter the element to remove:");	
		int m=s.nextInt();
		System.out.println("The required elements are:");
	    for(int i=0;i<n;i++){
	    	if(a[i]==m){
	    		a[i]=0;
	    	}
	    	if(a[i]!=0){	
	    	   System.out.println(a[i]);
	       }
	    }
	}

}
