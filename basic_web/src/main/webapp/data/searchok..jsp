<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%    
  
	String product[][] = {
			{"삼겹살 600g","30000","27000"},
			{"목살 600g","20000","18000"},
			{"갈메기살 300g","15000",""},
	};

	request.setCharacterEncoding("utf-8");
	
	try{
		String search = request.getParameter("search").intern();
		
/*		int count=0;
		int w = 0;
		
		
	}

  out.print(search);  
 */ 
  
  
  int count = 0;
  int w=0;
  while(w < product.length){
	  
	  //if(search.equals(product[][] != -1)){
		  //if(search.indexOf(product[][] != -1)){
		if(product[w][0].indexOf(search)!= -1){
			out.print(Arrays.toString(product[w]));
			count++;
		
		  
	  }
	  w++;
  }
	  
	  if(count==0){
		  out.print("해당 검색어에 포함된 상품은 확인되지 않습니다.");
	  }
	  }
	  
	  catch(Exception e){
		  
		    
		  %>    
		      
		      <script>
		      alert("해당 데이터가 올바르게 전될 되지 않았습니다.");
		      history.go(-1);
		      </script>	
		      
		      <%   
	  }
	  %>	

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 검색된 상품이 출력 되는 부분 </title>
</head>
<body>



</body>
</html>