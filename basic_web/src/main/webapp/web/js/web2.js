function aaa(){					//aaa함수
	console.log(this.code);		// 전역변수 호출 출력
}


aaa();				//즉시실행



/*
응용문제1
bbb 함수를 실행 시켰을 경우 1~10까지 출력되는 코드를 작성하시오.

function bbb(){
	console.log(1);
}
bbb();

 */

function bbb(){
	var f;
	for(f=1;f<11;f++){
		console.log(f);
	}
}
bbb;


/* 응문 2

사용자가 아직 함수에 ccc 라는 함수명을, 해당 함수에 2개의 인수값을 적용합니다.

첫번째 인수값과 두번째 인수값을 곱한 결과값을 출력하시오.



function  ccc(){		
	var a;
	var b;
}
ccc();
*/

function ccc(a,b){
	//인자값으로 매개변수를 받을 경우 문자를 숫자로 변경 number();
	var sum = String(a) + String(b);					//Number(a) + Number(b);   ==>   = a + b;
	console.log(sum);
}

ccc(10,20);




	
/* 인자값으로 매개변수를 받을  




document  현재 페이지

getElementById 현재 페이지이ㅔ서 아이디 이름
alert 경고 메세지
readonly  읽기 전용 true false
style css 핸들링



  */ 

function idckeck ()
	console.log(""test)
	var id = document.getelemById("mid");
	(if.value == ""aaa;{
		alert ("아이디를 입력하시오");
	}
	else{
		aler("해당 아이디는 사용가능 합니다.")
	}    
	
function idcheck(){
	var id =document.getElementById("mid");
	if(id.value==""){
		alert("아이디를 입력하세요");
	}
	else{
		aler("해당 아이디는 사용가능 합니다.");
		id.readonly = true;
		id.style.backgroundColor="skyblue";
	}
}	
	
	
	/*  응용문제
상품가격 10000이며, 사용자가 포인트 금액 입력 합니다. 포인트 적용 이라는 버튼을 클릭시 
해당 상품가격에서 포인트를 제외한 최종 결제 금액을 console로 출력하시오.

[결과] 예시 포인트를 1500 적용시
최종금액 : 8500
*/

function pay(){
	var pmoney = document.getElementById("product");
	var pt = document.getElementById("point");
	
	//HTML에서 사용자가 입력하는 모든 값은 문자 사칙연산 (-,*,/ 숫자 자료형 없이 계산 가능)
	
	var total = Number(pmoney.value) -Number(pt.value);
	console.log("최종금액:" + total);
	
}



function check_no(){
	var se = document.getElementById("security");
	if(se.value==code){
		alert("인증이 확인 되었습니다.");
	}
	else if(se.value == **){
		alert("인증번호를 입력하세요.")
		
	}
	else if(){
		alert("올바른 인증번호를 입력하세요.")
	}
}

	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
