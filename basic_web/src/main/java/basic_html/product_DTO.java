package basic_html;

import java.util.ArrayList;

//DTO (Data Transfer Object) => setter, getter => DAta => class배열로 변환 및 java에서 값을 
//VO(Value object) => getter  


public class product_DTO {
	String product_nm, sales_use, money, sales_money;
	String discount, like;
	ArrayList<String> datameke = null;
	ArrayList<ArrayList<String>> alldata = new ArrayList<ArrayList<String>>();
	
	
	//2차 배열을 생성하는 return 메소드
	
	public ArrayList<ArrayList<String>>  alldata(){
		
		return this.alldata;
	}
	
	
	
	//1차 배열을 생경하는 return 메소드
	public ArrayList<String> datamake(){
		this.datameke = new ArrayList<String>();
		//getter 메소드를 1차 클래스 배열에 데이터 추가
		
		this.datameke.add(getProduct_nm());
		this.datameke.add(getSales_use());
		this.datameke.add(getMoney());
		this.datameke.add(getSales_money());
		this.datameke.add(getDiscount());
		this.datameke.add(getLike());
		return this.datameke;
	}
	
	
	public product_DTO(String result[][]){
		int w=0;
		ArrayList<String> pd = null;
		
		while(w < result.length) {						//원시배열 그룹갯수 만큼 반복문을 적용
													//원시배열 배열을 각 파트에 맞는 setter 메소드에 값을 전달
			
			
			this.setProduct_nm(result[w][0]);
			this.setSales_use(result[w][1]);
			this.setMoney(result[w][2]);
			this.setSales_money(result[w][3]);
			this.setDiscout(result[w][4]);
			this.setLike(result[w][5]);
			
			pd= new ArrayList<String>();		//1차 클래스 배열을 로드하여 getter를 활성화 및 클래스배열로 변환
			System.out.println(result[w][0]);
			this.alldata.add(pd);					//1차 클래스 배열로 생성된 값을 2차 클래스 배열로 데이터 추가
			
			w++;
		}
		
		System.out.println(this.alldata);
		
		
		
	}
	
	
	
	
	
	public String getProduct_nm() {
		return product_nm;
	}
	public void setProduct_nm(String product_nm) {
		this.product_nm = product_nm;
	}
	public String getSales_use() {
		return sales_use;
	}
	public void setSales_use(String sales_use) {
		this.sales_use = sales_use;
	}
	public String getMoney() {
		return money;
	}
	public void setMoney(String money) {
		this.money = money;
	}
	public String getSales_money() {
		return sales_money;
	}
	public void setSales_money(String sales_money) {
		this.sales_money = sales_money;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscout(String discount) {
		this.discount = discount;
	}
	public String getLike() {
		return like;
	}
	public void setLike(String like) {
		this.like = like;
	}


}


