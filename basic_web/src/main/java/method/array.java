package method;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


		













publicclass array {
	List<String> all= null;
	
	public static void main(String)
	
	List<String> a13= new ArrayList<String>();
	List<String> a14= new LinkedList()<String>();
	new array_box().datackeck();
	
}

class array_box{
	List<Integer> all = null;
	
	long start = System.currentTimeMillis();
	ling end = 0;
	
	public void datacheck() {
		this.all = new ArrayList<Integer>();
		
		int f = 1;
		do {
			this.all.add(f);
			f++;
			
		}while(f<10000);
		
		this.end = System.currentTimeMillis();
		long total = this.end - this.start;
		System.out.println();
		
		
	}
	
	
	
	
	
	public void datacheck() {
		
		
	}
	
	
	
	public void datacheck3() {
		
		this.all = new ArrayList<Integer>();
		
		int f = 1;
		
		do {
			this.all.add(f);
			
			this.all.add(800,100);
			
			f++;
			
			
			
		}while(f<10000);
		this.end = System.currentTimeMillis();
		long total = this.end - this.start;
		System.out.println(total);
		
		
	}
	
	
	
}








