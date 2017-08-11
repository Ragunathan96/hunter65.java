import java.util.Scanner;

public class Hun100 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String sc=String.valueOf(n);
		double sum=0;
		//String str=new StringBuffer(sc).reverse().toString();
		for(int i=0;i<sc.length()-1;i++){
			double k=Double.parseDouble(sc.substring(i,i+1));
			double l=Double.parseDouble(sc.substring(i+1,i+2));
			sum=sum+Math.pow(k,l);
		}System.out.println((int)(sum+1));
	}

}
