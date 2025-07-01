package method;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


class ab4_box extends ab_box3 {
	String banknm = "국민";
	int usermenu;
	
			
			
			public ab4_box() {
		this.total = 100000;
		this.acc = new ArrayList<String>(Array.aslist(menus));
		this.user_menu();
	}
			
			
				
			
			private void user_menu() {
				String menulist = "";
				int w = 0;
				while(w<this.acc.size()) {
					menulist += this.acc.get(w)+ " ";
				}
				System.out.printf("은행 메뉴를 선택해 주세요. : %s", menulist);
				try {
					this.usermenu = this.sc.nextInt();
				}
				
				catch(Exception e) {
					System.out.println("메뉴 번호는 1~4까지만 입력이 가능합니다.");
					user_menu();
				}
				
			}
			
			
	
	@Override
	public String deposit(int moeny) {
		return null;
	}
	
	@Override
	public String drawal(int money) {
		return null;
	}
	
	
}