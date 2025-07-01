function mails(m){
	console.log(m);
	var email2 = document.getElementById("email2");
	email2.value = m;
	
	
}

function lotto(){	//1~46
	/* 1~10 => 1  05=>1  6.7 => 7*/
	
	/*1~10*/
	//var no = Math.ceil(Math.random())*10);
	
	/*0~9  => 0.5 => 0 , 9.8 => 9           */
	//var no =Math.floor(Math.random()*10);
	
	/*0~10     =>  0.6 => 1 , 1.2 => 1  */
	var no = Math.round(Math.random()*10);
	console.log(no);
	
	/* 1~46 의 숫자 중 하나를 선택하여 출력*/
	var no2 = Math.ceil(Math.random()*46);
	console.log(no2);
}

/* 071564
인증번호 4,5,6, => Math.random => 0~9
*/
/* 응용문제
인증번호 5 자리를 생성하는 코드를 작성하시오.
인증번호는 consol로 출력

function cn(){
		var no0 = Math.ceil(Math.random()*999999);
	console.log(no0);
}

function cn(){
}
	
*/

	
function cn(){
	var w = 1;
	var cno1;
	var telcn = "";                  //난수가 발생값을 누적시키는 변수 문자와 숫자 결합 >문자화
	while(w<=5){					//5회 반복
		cno1 = Math.floor(Math.random()*10);		//0~9까지
		telcn += cno1;
		w++;	
	}
	
	console.log(telcn) 	 //최종 난수 5자리 출력
}
