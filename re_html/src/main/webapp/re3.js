function aaa(){
	
	//  ""  = 사용자가 아무것도 입력을 안한것
	
	var no = document.getElementById("no");
	
				//if  첫번째 조건, else if 두번째  , else : 나머지 조건일 경우
				
				// consol.log : 개발 시 결과값을 확인하는 보저 역할 함수
	
	if(no.vlue==""){
		alert("해당 입력값에 데이터를 입력하세요!");
	}
	
	else {								//else if(no.value !=="")
										//html에서 입력된 모든 값을 string(문자)
					
		
		console.log(typeof(no));		// -> alert("값을 확인 하였습니다!");
		var no2 = Number(no.value);			//문자를 숫자형으로 변경
		console.log(typeof(no2));
	}
	
	
}


function bbb(){
	if(frm.no.vlaue==""){
		alert("해당 입력값에 데이터를 입력하세요!!!");
	}
}