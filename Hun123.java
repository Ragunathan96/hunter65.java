import java.util.Scanner;

public class Hun123 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Input : ");
		String s1=s.next();
		System.out.print("Output : ");
		char ch[]=s1.toCharArray();
		int count;
	    for(int i=0;i<ch.length;i++){
	    	 count =0;
	    	for(int j=i+1;j<ch.length;j++){
	    		if(ch[i]==ch[j]){
	    			count++;
	    			ch[j]='\0';
	    		}
	    	}if(ch[i]!='\0'){
	    			if(count==0){
	    				System.out.print(ch[i]);
	    			}
	        }		
          }
	  } 
  }
