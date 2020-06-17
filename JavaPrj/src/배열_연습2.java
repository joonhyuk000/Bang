
public class 배열_연습2 {

	public static void main(String[] args) {

		int j= 11;
		int hap=0;
		int [] num=new int[90];
		for(int i=0; i<=89; i++) {
			num[i] = j;
			hap += num[i];
			j++;
		}
		int i=0;
		
		while(i<90) {
			System.out.printf("num[%d] = %d\n", i, num[i]);
			i++;
		}
		System.out.println(hap);
	}

}
