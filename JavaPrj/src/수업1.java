
public class ����1 {

	public static void main(String[] args) {

		int i,j;
		
		for (i=3; i<=20; i++) {
			if(i==3 || i==5 ||i==15) {
				System.out.println("<"+i+"��>");
			}
			for(j=1; j<=9; j++) {
				int ans=i*j;
				System.out.println(i+"*"+j+"="+ans);
			}
			System.out.println("");
		}
	}

}
