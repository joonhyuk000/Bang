public class 배열_연습3{
	public static void main (String []args) {
		
		int j=11;
		int hap=0;
		int [] num=new int [90];
		for(int i=0; i<90; i++) {
			num [i]=j;
			hap+=num[i];
			j++;
		}
		int l=11;
		int k=0;
		while(l<=100) {
			System.out.printf("num[%d}=%d\n",k,l);
		l++;
		k++;
		}
		System.out.println(hap);
	}
}