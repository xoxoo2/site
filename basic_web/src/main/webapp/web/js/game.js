var userno = "";					//사용자가 뽑은 값을 저장하는 전역변수


function usergame(n){				//사용자가 클릭한 값을 받는 함수
	this.userno = n;
	pcgame();
}



function pcgame(){			//pc 1~3까지의 숫자를 무작위로 하나 선택
	var pc = Math.ceil(Math.random()*3);
	
	//pc 선택한 값을 이미지로 변환하여 HTML에 출력하는 코드
	var pcview = document.getElementById("pcview");
	pcview.innerHTML = "<img src ='./game/pc"+pc+".png'>";
	
	//console.log(pc);
	gameresult(pc);
	
}
function gameresult(pcno){ 		//결과발표
	//힌트 : switch ~ case,조건문
	
	console.log(pcno);			//pc가 뽑은 숫자
	console.log(this.userno);	// 사용자가 선택한 숫자				console.log(this.userno);
	
	switch(this.userno){
		case "1":				//사용자가 주먹을 누른 경우
		if(pcno == 1){
			msg ="비겼습니다.";
		}
		else if(pcno ==2){
			msg = "컴퓿터가 이겼습니다.;"
		}
		else {
			msg = "사용자가 이겼습니다."
		}
		break;
	}
	
	
	
}