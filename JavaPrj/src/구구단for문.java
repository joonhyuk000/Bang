
public class 구구단for문 {

	public static void main(String[] args) {

		int i,j;
		
		for(i=3;i<=9;i++) {	
			if(i==3||i==5) {
				System.out.println("<"+i+"단"+">");
			}
				for(j=1;j<=9;j++) {
					int ans=i*j;
					System.out.println(i+"*"+j+"="+ans);
				}
					System.out.println("");
					
		}
		
	}

}
