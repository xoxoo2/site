console.log("js 파일 정상로드");
 
 
 var a = "홍길동";
 a = "이순신";
 var login = a + "님 환영합니다.";
 console.log(login);
 
var b = 50;                                    
var c = 25;
var sum =b * c;
console.log(sum);

var point = 5000;
var sum2 = point * 2 + 10000 * 2;
console.log(sum2);

var product = 55000;
var total = product * 0.8;
console.log(total);

var userid ="hong";
var userpw ="a123456";

if(userid == "hong"){
	console.log("동일한 아이디 입니다.");
}
else {
	console.log("아이디가 다릅니다.");	
}

if(userpw == "a123456"){
	console.log("패스워드가 확인 되었습니다.");
}
else if (userpw !="a123456"){
	console.log("패스워드가 다릅니다.");
}	
	
//아이디와 패스워드를 모두 검토 조건문

if(userid == "hong") {   //아이디 체크
	if(userpw == "a123456"){
		console.log("로그인 하셨습니다.");
	}
	else{
		console.log("패스워드가 올바르지 않습니다.");
	}
}
else{
	console.log("아이디가 다릅니다.");
}
	
		
