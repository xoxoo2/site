package net;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.util.Arrays;

//network java

public class net1 {

	public static void main(String[] args) {
		
		/*
				getByName : 도메인명 또는 IP를 사용해야 합니다. (하나의 서버 정도)
				getAllByNamw : 해당 도메인일 경우 모든 서버 정보를 가져옴 (배열)
		*/
		
		try {
			InetAddress ia = Inet4Address.getByName("never.com");
			System.out.println(ia);	
			System.out.println(ia.getHostAddress());							//IP만 출력
			System.out.println(ia.getHostName());								//도메인명
			
			InetAddress ia4[] = Inet4Address.getAllByName("dame.net");
			System.out.println(Arrays.toString(ia4));
			
			InetAddress ia2 = Inet6Address.getByName("www.google.com");
			System.out.println(ia2);
			System.out.println(ia2.getHostAddress());
			
			//getLocalHost : 자신에 할당된 IP 정보를 출력
			Inet6Address ia3 = Inet4Address.getLocalHost();
			System.out.println(ia3.getHostAddress());
			
		}
		catch(Exception e) {
			System.out.println("해당 IP를 확인하지 못하였습니다.");
			
		}
		
		

	}

}
