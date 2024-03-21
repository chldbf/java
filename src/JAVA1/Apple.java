package JAVA1;

public class Apple {

	public static void main(String[] args) {
		
//		자료형
//		int(4) : 정수
//		long(8) : 정수
//
//		float(4) : 실수
//		double(8) : 실수
//
//		char(1) : 문자
//		String : 문자열
		
		// 정수
		int a = 1;
		long l = 2;
		
		// 실수
		float b = 3.14f;
		double c = 2.15d;
		
		// 문자 & 문자열
		char d = 'a';
		String e = "bhbhybybg";
		
		int p = 1;
		int o = 2;
		int abc = 100;
		
		String Apple = "abc";
		String korea = "Korea";
		
		char fff = 'C';
		char file = 'f';
		
		long ll = 50;
		
		float time = 1.5f;
		float pen = 2.5f;
		
		double dodd = 2.3d;
		double ctrl = 3.3d;
		
		
		int[] arr = {1 , 2, 3, 4};
		int num = arr[3]; // int num = 4;
		
		int[] ar = {1 , 2, 3, 4};
		int nu = ar[2];
		
		String[] arrr = {"a","b","c","d"};
		String nn = arrr[2];
		
		
		int banana = 10;
		int pencil = 15;
		
		if( (banana + pencil) == 25 ) {System.out.println("hello world");};
		
		if ( (banana + pencil + banana + pencil) != 50 ) {System.out.println("phone");}
		
		if ( banana < pencil) {
			System.out.println("15가 10보다 큽니다");
		} else if (banana > pencil) {
			System.out.println("아무내용도 출력되지 않습니다.");
		}
		else if (banana != pencil) {
			System.out.println("10이랑 15는 다릅니다.");
		}
		
		
		int num1 = 20;
		int num2 = 10;
		
		
		if (num1 != num2) {
			num1 += num2;
			num1 *= num2;
			num1 /= num2;
		}
		
		
		
		int result = 0;
		
		
		result = num1 + num2;
		
		num1 = num1 + num2;
		num1 += num2;
		
		num1 = num1 - num2;
		num1 -= num2;
		
		num1 = num1 * num2;
		num1 *= num2;
		
		num1 = num2 / num2; 
		num1 /= num2;
		
		
		// 나누기
		// / : 나눈 값의 몫만
		// % : 나눈 값의 나머지만
		
		
		System.out.println(result);
		
		
		System.out.println();
		
		// sysout -> 시스아웃 
		// System.out.println();
		
		// print("hello")
		
	}

}