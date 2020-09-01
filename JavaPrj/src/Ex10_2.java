
public class Ex10_2 {
	public static void main(String[] args) {
		int []aa=new int[3];
		try {
			aa[2]=100/0;
			aa[3]=100;
			//try문 안에서 위의 값이 거짓이면 아래의 값이 참이더라도
			//위의 값과같이 메모리에 저장 되지않음
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 글자가 배열 크기보다 커요 ~~");
		}catch (ArithmeticException e) {
			System.out.println("0으로 나누는 등의 오류에요 ~~");
		}finally{
			System.out.println("이 부분은 무조건 나와요 ~~");
		}
	}
}
