package io;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;



//고객명, 통신사, 생일달

public class io_DTO {
	String nm, corp,birth;
	
	
	
	//public Map<String,>
	
	
	public String getNm() {
		return nm;
	}



	public void setNm(String nm) {
		this.nm = nm;
	}



	public String getCorp() {
		return corp;
	}



	public void setCorp(String corp) {
		this.corp = corp;
	}



	public String getBirth() {
		return birth;
	}



	public void setBirth(String birth) {
		this.birth = birth;
	}



	public List<String> datalist(){
		List<String> all= new  ArrayList<String>();
		
		all.add(birth);
		
		
		return null;
		
	}