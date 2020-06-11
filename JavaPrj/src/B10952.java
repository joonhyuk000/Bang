import java.util.Scanner;
public class B10952{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a;
		int b;
		int hap =-1;
		while(hap!=0) {
			
			a=s.nextInt();
			b=s.nextInt();
			hap=a+b;
			
			if(hap==0) {
				break;
			}
			System.out.printf("%d\n",hap);
		}
	}
}