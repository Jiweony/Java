package tut03;

public class LoopEx3 {

	public static void main(String[] args) {

		//1 ~ 100까지의 합을 구하시오
		//while
		//출력 예시 : 1~100까지의 합은 ***입니다.
		int result = 0; //합계가 저장될 변수
		
		int k = 1;
		while(k <= 100) {
			result += k;
			k++;
		}
		
		//출력예시 : 5050입니다.
		//		 : 값은 5050
		System.out.println("1 ~ 100까지의 합은 "+ result +"입니다.");
		System.out.println("값은 " + result);
		
		

		
	}

}
