import java.util.Scanner;

public class Hun124 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		int count=0;
		if(s1.charAt(0)>='A' && s1.charAt(0)<='Z')
		{
		for(int i=1;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')
			{
				count++;
			}
		}
		}
		else{	
		   for(int j=0;j<s1.length();j++)
			{
				if(s1.charAt(j)>='A' && s1.charAt(j)<='Z')
				{
					count++;
				}
		
			}
		}
		if(count==1){
			System.out.println("Camel case ");
		}else{
			System.out.println("Not a camel case ");
		}
	}
}
