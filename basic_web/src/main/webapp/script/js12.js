
/*
var n=1;
var msg="";
switch(n=1){
	case 1:
	msg ="연습";
	console.log(msg);
	if(n%2==0){
	msg="짝수 입니다."
	}else{
		msg="홀수 입니다.";
	}
	break;

	default:
	nsg ="5이하의 숫자만 입력하세요";
	break;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          

}

break;
*/

/*
응용문제
switch+if문 결합하여 다음에 문제 사항을 코드로 제작하시오.

사용자가 변수에 card라고 입력시 다음과 같이 나누어 집니다.
롯데, 현대, 삼성으로 나누어지며, 사용자가 "삼성"을 선택시 "시스템 점검 입니다" 라는 결과값을 출력 시킵니다.
단, 롯데, 현대를 선택시 "결제 진행 하시겠습니까?" 라고 결과를 출력합니다.

사용자가 변수에 bank라고 입력시 다음과 같이 나누어 집니다.
하나, 국민, 신한으로 나누어 지며, 사용자가 "신한","국민"을 선택시 "계좌이체가 가능 합니다." 라는 결과값을 출력 시키며,
"하나"를 선택시 "해당 계좌이체는 불가능 합니다."라고 출력합니다.


그외에 card에 "신한"이라고 선택하게 되면, "서비스 불가"라고 출력 합니다.

var pay = "card";
var corp = "현대";



 

var pay = "";
var msg = "";

switch(pay){					
	case "card":
	{
		case "삼성":
		msg = "시스템 점검 입니다";
		break;
	
		case "롯데" : 
		case "현대":
		msg = "결제 진행 하시겠습니까?";
		break;	
		
		case "신한" : 
		msg = "서비스 불가";
		break;
}

	case "bank":
	{
		case "신한" : case"국민" :
		msg = "계좌이체가 가능 합니다.";
		break;
	
		case "하나" : 
		msg = "해당 계좌이체는 불가능 합니다.";
		break;	
}
console.log(msg);


 */



var pay = "card";
var corp = "현대";



 

var pay = "";
var corp ="";
var msg = "";

switch(pay){					
	case "card":
	if(corp==삼성){	
		msg = "시스템 점검 입니다";
	}	
	else if(corp=="롯데" || corp=="현대"){
		msg = "결제 진행 하시겠습니까?";	
	}
	else if(corp=="신한"){
		msg = "서비스 불가";	
	}
	break;


	case "bank":
	
	if(corp=="신한"|| corp=="국민"){
		msg = "계좌이체가 가능 합니다.";	
		
	}
	else if(corp=="하나"){
	msg = "해당 계좌이체는 불가능 합니다.";	
	}
		
	break;	

}
console.log(msg);