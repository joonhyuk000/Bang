import java.util.Scanner;

public class baek8393 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int i;
		int hap=0;
		int num=s.nextInt();
		for(i=1; i<=num; i++) {
			hap=hap+i;
		}
		System.out.printf("%d",hap);
	}

}
