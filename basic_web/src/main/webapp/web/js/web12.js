var user = "1, 2,3,4순';			//문자열

console.log(user);





var data = user.aplit_"|"		//split 특정 문자를 기준으로 배열 새엉함

console.log(data);  			//split 으ㅗㄹ 단어 굽ㄴ은 배열으 ㄹ모두 룰록

console.log(data[2]);			//해당 배여값만 출려
	
console.log(data.lenght); 		//배열 갯수	


var w 0;  //백열은 혼호가 9부터시작


do {
	console.log(data[x]);
	w++;
	

}while(w<data.length);			//배열 갯수는 5개 ㅏㄷㄴ, 배열번호 4 7울

/*/배열을 사용하는 이유?? 하나의 벼수 여러개의 데이터 갑슬 가지기위해서
배열 = 반복문 */

//1차 배열(숫자)

var n = [10,15,22,33,8,9,3];

 var ea =n.lenght;			//배열 총 갯수
var ww= 0;				//배열0부터 시작
while(ww<ea){			//배열 데이터 갯수만큼 반복
	console.log(n[ww]);		//출력
	ww++;
}







var n ={};








//1차 배열(문자)

var  k = ["LG냉장고","삼성 휴대폰","감치냉장고","식기세척기","전자렌지","에어프라이"];
//FOR문으로 해당 데이터를 모두 출력하시오.


var kea = k.lenght  	//배열 갯수
var f;
for(f=0; f<kea; f++){
	console.log(k[f]);
}


// 1차 배열 (복합)

 var arr = ["hong","홍길동"," hong@nate.com","2025-01-14"];


