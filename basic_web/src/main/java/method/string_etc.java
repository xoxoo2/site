package method;

public class string_etc {

	public static void main(String[] args) {
		
		/*
		
		같은 자료형 또는 자료형 클래스라고 할지라도 new가 붙은 상황이면 
		인스턴스 영역(메모리)로 변경 되므로 비교하는 상황이 달라 질 수 있습니다.
		Scanner = new 
		
		*/
		
		String user = "홍길동";
		String welcome = "님 환영합니다.";
		String msg = user + welcome;
		
		//2025년 신입개발자 JAVA 채용안내 (2)
		
		
		StringBuffer sb = new StringBuffer();		//멀티 쓰레드가 빠릅니다.
		sb.append("강감찬");
		sb.append("님 포인트는 1500 입니다.");
		System.out.println(sb);
		
		StringBuilder sb2 = new StringBuilder();		//단일 쓰레드가 빠릅니다.
		sb2.append("LG 냉장고");
		sb2.append("- 350000");
		System.out.println(sb2);
		
		
		Integer.parseInt(msg);
		
		//unboxing
		
		
		long t = System.currentTimeMillis();
		long sum =0L;
		int f;
		for(f=1; f < 1000000; f++) {
			sum += f;
		}
		
		System.out.println("실행시간: " + (System.currentTimeMillis() - t));		//종료시간
		
		
		//기본타입 => 클래스 형태 타입(boxing) => long => Long, int => Integer
		
		long t2 = System.currentTimeMillis();
		long sum2 = 0L;
		
		
		int f2;
		for(f2=1; f2 < 1000000; f2++) {
			sum2 += f2;
		}
		System.out.println("실행시간: " + (System.currentTimeMillis()- t2));
		
		
		/* 박싱
		Integer num = new Integer(100);
		Interger => Integer
		
		 unbox
		 
		 integer aa = null;
		 int zz = 10;
		 system.out.println(aa+zz);
		 
		String w = "100";
		int no = Integer.parseInt(num) ;
		*/
	}
	

		
		
		
		
		
		
		
		
		String a = "a1234";
		String b = "a1234";
		
		String c = new String("a1234");
		String d = new String("a1234");
		
		System.out.println(a == b);
		System.out.println(a.equals(b));
		System.out.println(a == c);				//false
		System.out.println(a.equals(c));
		System.out.println(c == d);				//false
		System.out.println(a.equals(d));
		
		
		
		//StringBuffer, StringBuilder : 멀티 쓰레드를 이용해서 문자열 핸들링
	}

}
