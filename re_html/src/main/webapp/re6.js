/*in java  자료형 변수가 parmeter 안에 있어야함 ex (z) > (string z)*/


var gugu= function(z){
	
	var no = document.getElementById("no");
	var no2 = document.getElementById("no2");
	
	if(no.value == ""){
		alert("숫자1번 값을 입력하세요");
		no.focus(); 							//focus() 함수란 해당 오브젝트에 커서를 적용시키는 함수
	}
	
	else if (no2.value == ""){
		alert("숫자2번 값을 입력하세요");
		no2.focus();
		
	}
	else{
		gugu_view(no.value, no2.value,z);					//.value 안넣을시 input type 날라감
		//console.log(z);					
	}	
}

/*function main(){
	
}


//var no,no2  */


var gugu_view = function(no,no2,z){
	var check;
	if(z == "odd"){
		check =1;
	}
	else if(z == "even"){
		check = 0;
	}
	
/*	if(20%2 == check){
		
	}		*/
	
	
	var w = no;
	while(w <= no2){										//숫자1~숫자2
		
		
		if(w%2 == check){								//해당 조건에 맞게 짝수단 또는 홀수단으로 구분하여 출력
		
		var ww =1;
		while(ww <= 9){											//1~9
			
			console.log(w + "*" + ww + "=" + w*ww);
			ww++;
		}
		
	}	
		w++;
	}
	
}	
	
	
	
	
	
	
	
/*	if(z == "odd"){
		
		
	}
	else if (z == "even"){
		
	}		*/
	