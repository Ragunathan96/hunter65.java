import java.util.Scanner;


public class hun64 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int temp=0;
		int max=0;
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		for(int j=0;j<n-1;j++){
			  if(a[j]-a[j+1]<0){
				  temp=(a[j]-a[j+1])*(-1);
				
			}else
			{
				temp=(a[j]-a[j+1]);
				
			}	
			  if((a[j]-a[j+1])>max)
			  {
				  max=(a[j]-a[j+1]);
				  if(a[j]>a[j+1])
				  {
					  System.out.println("The output is: "+j);
				  }
				  else
					  {
					  System.out.println("The output is: "+j+1);
					  }
			   }	  		  
		}
	}	
 }
			
		
	


