import java.util.Scanner;

public class Hun53 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int l=s.nextInt();
		for(int i=1;i<str.length();i++){
			System.out.print(String.valueOf(str.charAt(0)));
			System.out.println((String.valueOf(str.substring(i,i+l-1))));
		}
		
	}

}
