
public class StringExample {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String job = "���α׷���";
		System.out.println(name);
		System.out.println(job);

		String str = "���� \"�ڹ�\"�� ���ϴ�.";
		System.out.println(str);
		
		str = "��ȣ\t�̸�\t����";
		System.out.println(str);
		
		System.out.println("����\n");
		System.out.println("�ڹٸ�\n");
		System.out.println("���ϴ�.");
	
		// \r : ĳ���� ���� CR : Ŀ���� ��ġ�� ���� �� �� ������ �̵�
		
		str = "abcde\nfghi";
		System.out.println(str);
		
		
		String str1 = "			abcd";
		String str2 = "			\rabcd";
		System.out.println(str1);
		System.out.println(str2);
		
		byte byteValue = 10;
		int intValue = byteValue; 	// �ڵ� Ÿ�� ��ȯ
		
		long longValue = 10;
		float floatValue = longValue;	// 5.0E9F
		double doubleValue = longValue; // 5.0E9
		
		char charValue = 'A';
		int inValue = charValue;	// 65
		
		//byte byteValue = 65;		// 1byte byte���� char���� ���� �Ұ� �ڵ� ����ȯ X
		//char charValue = byteValue; // ����
		
	}

}
