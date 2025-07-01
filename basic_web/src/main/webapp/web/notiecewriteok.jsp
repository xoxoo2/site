<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%


String id[][] = { 
		 {"윤하빈","함희원","김준수","김호진","박준범"},
		 {"yun@nate.com","apink@gmail.com","jun_su@naver.com","hijin@nate.com","junbum@nate.com"},
		 {"yunha","ham1004","kimjuns","hojin15","junbum04"}
	};





request.setCharacterEncoding("utf-8");

try{
	String search = request.getParameter("search").intern();
	


int count = 0;
int w=0;
while(w < id.length){
  
  
	if(id[w][0].indexOf(search)!= -1){
		out.print(Arrays.toString(id[w]));
		count++;
	
	  
  }
  w++;
}
  
  if(count==0){
	  out.print("해당 접근이 올바르지 않습니다");
  }
  }
  
  catch(Exception e){
	  
	    
	  %>    
	      
	      <script>
	      alert("해당 사용자의 이름과 이메일이 일치하는 사용자가 없습니다");
	      history.go(-1);
	      </script>	
	      
	      <%   
  }
  %>   
    
    
   <%
   


String newid[][] = {
		{"신한카드 설연휴 서비스 점검안내","admin","설연휴 3일간 신한카드 시스템 점검안내","2025-01-20"},
		{"신규 가입자 쿠폰 지급 연장안내","admin","10%신규 쿠폰 기간을 연장하게 되었습니다.","2025-01-17"},
		{"설 연휴기간 배송지연 안내","admin","설연휴 기간 월요일까지만 배송을 하게 됩니다.","2025-01-14"}
	};


   try{
		String search = request.getParameter("search").intern();
		


	int count = 0;
	int w=0;
	while(w < id.length){
	  
	  
		if(id[w][0].indexOf(search)!= -1){
			out.print(Arrays.toString(id[w]));
			count++;
		
		  
	  }
	  w++;
	}
   
   
   %> 
    
    
    <%
    
    
    Scanner scanner = new Scanner(System.in);
        System.out.println("이름을 입력하세요:");
        String name = scanner.nextLine();
        
        System.out.println("이메일을 입력하세요:");
        String email = scanner.nextLine();
    
      
        
        
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(name) && emails[i].equals(email)) {
                System.out.println("회원 아이디 : " + userIds[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("해당 사용자의 이름과 이메일이 일치하는 사용자가 없습니다.");
        }
    }
}
    
    %>



<%

String[][] notices = {
        {"신한카드 설연휴 서비스 점검안내", "admin", "설연휴 3일간 신한카드 시스템 점검안내", "2025-01-20"},
        {"신규 가입자 쿠폰 지급 연장안내", "admin", "10%신규 쿠폰 기간을 연장하게 되었습니다.", "2025-01-17"},
        {"설 연휴기간 배송지연 안내", "admin", "설연휴 기간 월요일까지만 배송을 하게 됩니다.", "2025-01-14"}
    };

    
    Scanner scanner = new Scanner(System.in);

    System.out.println("사용자 아이디를 입력하세요 (admin만 가능):");
    String userId = scanner.nextLine();

    if (!userId.equals("admin")) {
        System.out.println("글쓴이는 admin만 사용할 수 있습니다.");
        return; // admin이 아닌 경우 종료
    }

   
    System.out.println("공지 제목을 입력하세요:");
    String title = scanner.nextLine();
    System.out.println("공지 내용을 입력하세요:");
    String content = scanner.nextLine();
    System.out.println("공지 날짜를 입력하세요 (yyyy-mm-dd):");
    String date = scanner.nextLine();

    
    String[] newNotice = {title, userId, content, date};
    String[][] updatedNotices = new String[notices.length + 1][4];

    
    for (int i = 0; i < notices.length; i++) {
        updatedNotices[i] = notices[i];
    }
    
   
    updatedNotices[notices.length] = newNotice;

    // 전체 공지사항 출력
    System.out.println("공지사항 전체 리스트:");
    for (String[] notice : updatedNotices) {
        System.out.println("제목: " + notice[0] + ", 글쓴이: " + notice[1] + ", 내용: " + notice[2] + ", 날짜: " + notice[3]);
    }
}
}




%>













<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> 공지사항 리스트 </title>
</head>
<body>

</body>
</html>