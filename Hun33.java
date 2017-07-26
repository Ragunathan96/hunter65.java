import java.util.Scanner;

public class Hun33 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		switch(n){
		case 2:
			System.out.println("ABC");
			break;
		case 3:
			System.out.println("DEF");
			break;
		case 4:
			System.out.println("GHI");
			break;
		case 5:
			System.out.println("JKL");
			break;
		case 6:
			System.out.println("MNO");
			break;
		case 7:
			System.out.println("PQRS");
			break;
		case 8:
			System.out.println("TUV");
			break;
		case 9:
			System.out.println("WXYZ");
			break;
		 default:
			System.out.println("invalid");
			break;
		}
	}

}
