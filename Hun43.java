import java.util.Scanner;

public class Hun43 {
	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.next();
        String a="";
        int j=0;
        for(int i=0;i<s1.length();i++){
        	if(Character.isAlphabetic(s1.charAt(i))){
        		if(Character.isAlphabetic(s1.charAt(i+2))){
        		j=Integer.parseInt(String.valueOf(s1.charAt(i+1)));
        		}else{
        	    j=Integer.parseInt(String.valueOf(s1.charAt(i+1))+String.valueOf(s1.charAt(i+2)));
        		}
        		for(int k=0;k<j;k++){
        			a=a+s1.charAt(i);
        		}
        	}
        }System.out.println(a);
       
		
	}

}
