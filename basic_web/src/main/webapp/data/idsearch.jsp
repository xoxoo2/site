<%@page import="java.lang.reflect.Array"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    

<%    

String product[][] = { 
		 {"윤하빈","함희원","김준수","김호진","박준범"},
		 {"yun@nate.com","apink@gmail.com","jun_su@naver.com","hijin@nate.com","junbum@nate.com"},
		 {"yunha","ham1004","kimjuns","hojin15","junbum04"}
	};

request.setCharacterEncoding("utf-8");

try{
	String search = request.getParameter("search").intern();
	

int count = 0;
int w=0;
while(w < product.length){
  
  
	if(product[w][0].indexOf(search)!= -1){
		out.print(Array.toString(product[w]));
		count++;
	
	  
  }
  w++;
}
  
  if(count==0){
	  out.print("해당 접근이 올바르지 않습니다.");
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
<title>아이디 찾기</title>
</head>
<body>

</body>
</html>