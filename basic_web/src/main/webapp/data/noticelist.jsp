

<%page import = "java.util.list" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<%
	request.setChart


%>    
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>공지사항 리스트</title>
</head>
<body>

<p>전체 등록된 게시물 : <%=alldata.size() %> 개</p>

<table boder="1" cellpadding="0" cellspacing="0">

</table>



<thead>

<tr>

<th width="50">번호</th>
<th width="50">제목</th>
<th width="50">글쓴이</th>
<th width="50">등록일</th>

</tr>


</thead>


<tbody>
<%
 int w =0;
while(w<alldata.size()){
	
}
%>
<tr height="30">

		<td align="center"><%=alldata.size()-w%></td>
		<td><%=alldata.get(w).get(0) %></td>
		<td align="center"><%=alldata.get(w).get(1) %></td>
		<td align="center"><%=alldata.get(w).get(3) %></td>
		
</tr>


</tbody>


</table>




<!-- 	//foreach로 1차 원시배열을 구분하여 클래스로 전달 
	for(String[] arr : notic){
	
		al = new ArrayList(Arrays.asList(arr));					//원시배열 => 1차 배열로 이관
	alldata.add(al);
}
	//out.print(Aarrays.deepToString(alldata));
	out.print(alldata.size());
	
	for(String[] arr : notice) {
		ArrayList<E>
	}
	
	Date date = new Date();
	SimpleDateFormat sf = new SimpleDateFormat("yyyy-mm-dd");
	
	String today = sf.format(date);
	
	out.print(today);
	
	//Front에서 데이터를 이관 받는 코드(name 명으로 받음)
	//request : Front에서 무조건 데이터를 이관 받는 클래스
	
	String subject = request.getParmeter("subject");
	String writer =request.getParmeter("writer");
	String texts =request.getParmeter("texts");
	
	
	//예외처리를 사용한 이유는  Front-end에서 값이 전송이 안되었을 경우 조건문에서  error
	
	try {
		
		if(!subject.equals("")|| !writer.equals("")|| !texts.equals("")) {
			
			if(!subject.equals("")&& !writer.equals("") && !texts.equals("")) {
				//out.print("데이터 체크");
				
				al = new ArrayList<String>();
				al.add(subject);
				al.add(writer);
				al.add(texts);
				al.add(today);
				alldata.add(0,al);		//2차 배열에 등록을 함 단, 배열기준으로 맨 앞에 데이터가 저장 되도록함
				
				
			}
			
		}catch(Exception e) {
			System.out.println();		
	}
	
	 -->







<input type="button" value="글쓰기" onclick="location.href='./notice_writer.html';">


</body>
</html>