function calc(){
	var no = document.getElementById("no");	//사용자가 입력한 값
	var result = aaa(no.value);				//리턴함수에 인자값을 보내서 결과를 받음
	console.log(result);			//결과값을 출력
}


function aaa(n){			//리턴함수
	
		var z=5 * n;		//계산 수식구
		return z;			//계산값을 회신하는 역할
}


/*응용문제
사용작 아이디를 입력합다. 예를 들어 hong 아이디, admin 아이디를 입력시 결과"해당 아이디는 사용이 불가능 합니다." 라고 출력을 하며.
그 외에 아이디는 "사용이 가능합니다."라는 메세지를 출력하도록 return 함수로 구현하시오. 
*/


function idcheck(){
	
}


//return 함수 (if문) => 결과값만 회신하는 역할
function id_member(m){
	var msg="";
	if(m==""){
		msg = "아이들 입력하세요!";
	}
	else if(m=="hong" || m=="admin"){
		msg = "해당 아이디는 사용할 수 없습니다.";
	}
	else{
		msg="사용가능한 아이디 입니다.";
	}
	return msg;			//return으로 결과값을 회신
}


function pwcheck(){
	var mpass = document.getElementById("mpass");
	var result = word_check(mpass.value);
	alert(result);
	
}

function word_check(pw){			//각종 사용자 단어 입력사항 체크
	console.log(pw.lenght);
	var msg;
	if(pw.length < 6){
		msg="최소 6자리 패스워드를 입력하셔야 합니다.";
	}
	else{
		msg ="해당 패스워드가 올바르게 변경 되었습니다.";
	}
	return msg;
}




