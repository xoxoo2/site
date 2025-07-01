var a = 1;             //-> 시작값         while 문은 처음부터 값을 입력후 시작
while(a<11){           // 범위값
	console.log(a);
	a++;                //증가, 감소 ※ 증가 또는 감소를 적용하지 않을경우 loop
}


// while 문으로 역순

var b = 10;
while(b>0){
	console.log(b);
	b--;
}

//구구단 7 7*1 = ~7*9=

var c = 1;
while(c<=9){
	console.log(7 + "*" + c + "=" + 7*c);           //(7*c);
	c++;
}




// while + if 문 

var d =1;                    //시작값
while(d<11){                 //범위값
	if(d%2==1){              //조건값 : 2로 나누었을때 나머지값이 1로 떨어지는 조건
		console.log(d);      // 해당 조건이 맞는 값만 출력
	}
	d++;
}


//   var d =1;  >> while(d<11)>> if(d%2==1) >> console.log(d); >>  d++;= d +1 >> while(d<11        



/* 응용문제 숙제

while문괒 조건문을 이용하여 다음과 같은 결과가 되도록 코드를 작성하시오.
1~100 까지 숫자 중 5의 배수만 출력 되도록 합니다.

*/



/* 사용자가 직접 2개의 숫자를 입력시 반복문으로 작동되는 코드
단, 첫번째 입력값과 두번째 입력값이 더 큰 숫자를 무조건 입력 */


var no1 = 5;     //시작값	
var no2 = 17;    //범위값

while(no1 <= no2){
	console.log(no1);
	no1++;
}


/*var no1=30;
var no2=13;

if(no1>no2){
	console.log(no1);
	no1++;
}
*/

var no1=1;
var no2 =11;
if(no1>no2){
	console.log("숫자값을 잘못 입력 하셨습니다.");
}


else if (no1 ==no2){
	console.log("두 숫자값이 같으므로 입력을 다시 적용하세요.")
}
else{
	while(no1 <= no2){
		console.log(no1);
		no1++;
	}
}



