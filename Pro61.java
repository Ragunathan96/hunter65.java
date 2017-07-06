import java.util.Scanner;



public class Pro61 {
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
    char ch[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    char ch3[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','a','b','c','d','e','f','g','h','i','j'};
    for(int i=0;i<s1.length();i++){
    	for(int j=0;j<ch.length;j++){
    	      if(s1.charAt(i)==ch[j]){
    	    	  System.out.print(ch[j+10]);
    	      }
    }
	}System.out.print(" "+s2.substring(0,1));
    String s3=(s2.substring(1,s2.length()-1));
    for(int i=0;i<s3.length();i++){
    	for(int j=0;j<ch3.length;j++){
    		 if(s3.charAt(i)==ch3[j]){
   	    	  System.out.print((ch3[j+10]));
   	    	  break;
   	      }
    	}
    }
   
    System.out.println(s2.substring(s2.length()-1,s2.length()));
    }
	 
}
