
public class StringExample {

	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);

		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.println("나는\n");
		System.out.println("자바를\n");
		System.out.println("배웁니다.");
	
		// \r : 캐리지 리턴 CR : 커서의 위치를 현재 줄 맨 앞으로 이동
		
		str = "abcde\nfghi";
		System.out.println(str);
		
		
		String str1 = "			abcd";
		String str2 = "			\rabcd";
		System.out.println(str1);
		System.out.println(str2);
		
		byte byteValue = 10;
		int intValue = byteValue; 	// 자동 타입 변환
		
		long longValue = 10;
		float floatValue = longValue;	// 5.0E9F
		double doubleValue = longValue; // 5.0E9
		
		char charValue = 'A';
		int inValue = charValue;	// 65
		
		//byte byteValue = 65;		// 1byte byte형은 char형에 대입 불가 자동 형변환 X
		//char charValue = byteValue; // 에러
		
	}

}
