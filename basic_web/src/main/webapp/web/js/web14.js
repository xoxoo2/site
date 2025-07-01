var data = new Array();    //빈배열 생성

var data = [];  	//빈배열 생성

/*
var data = [50,100,150,10,15,80];
사용자가 만약에 55를 입력시 해당 배열에 값을 추가하고 해당 배열을 내림차순으로 변경되도록 코드를 작성하시오.
*/



function add_arr(){
	var no = document.getElementById("no");
	var ea = this.data.lenght;
	data[0] = no.value;				//빈배열로 값을 적용
	console.log(data);				
	
	//console.log(ea);	
}

/*add_arr = function




function add_arr(){
	var no = document.getElementById("no");
	data.push(no.value);
	console.log(data);
	
}
*/


function add_arr2(){
	var no = document.getElementById("no");
	data.push(Number(no.value));		//배열 번호 기준 맨 마지막 번호 기준으로 데이터 추가/ Number 추가
	console.log(data);
	
}

function add_arr3(){
	var no = document.getElementById("no");
	data.push(no.value);		//배열 번호 기준으로 맨 앞에 데이터 추가
	console.log(data);
	
}

function add_arr4(){
	data.shift();			//배열의 데이터값을 맨 앞에서 부터 삭제
	console.log(data);
	
}


function add_arr5(){
	data.pop();			//배열의 데이터값 기준으로 맨 뒤에서 부터 삭제
	console.log(data);
	
}
