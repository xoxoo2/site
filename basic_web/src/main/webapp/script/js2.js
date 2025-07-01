var a =100;
var b = 50;


var c = "홍길동";
var d = true;   

console.log(typeof(c));

console.log(typeof(a));  



if(a>b){
	console.log(a+"값이 큽니다.");
}
else if (a<b){
	console.log(b+"값이 큽니다.");

}
else{
	console.log("두 값이 같습니다.");
}

	
	
var num1 = 25* 6 + 11 +42;
var num2 = 33 + 7 * 14 * 8;
if (num1 > num2){
	console.log("num2이 작습니다.");
}
else if (num1 < num2){
	console.log("num1이 작습니다.");
}	
else {
	console.log("같습니다.");
}	
	


/* 응용문제 2
1~120까지의 숫자를 임의로 변수에 입력합니다.
다음과 같이 결과가 console.log 출력 되도록 합니다. 

10 미만의 숫자 입니다.

10 이상의 숫자 입니다.

20 이상의 숫자 입니다.

45 이상의 숫자 입니다.

100 이상의 숫자 입니다.


var user = 9;


if (10 > user){
	console.log("10 미만의 숫자 입니다.");
}
else if (10 =< user <20){
	console.log("10 이상의 숫자 입니다.");
}	
else if (20 =< user <45){
	console.log("20 이상의 숫자 입니다.");
}	

else if (45 =< user <100){
	console.log("45 이상의 숫자 입니다.");
}	

else if (100 =< user){
	console.log("100 이상의 숫자 입니다.");
}	




*/

 

/* 논리 연산자 : && : and ,  ㅣㅣ : or 

논리 연산자를 사용하는 이유는 여러가지의 조건을 복합적으로 체크하는 역할


var mid = "kim";

var mpass ="a1234"; 

if(mid == "kim" && mpass == "a1234"){
	console.log("로그인 하였습니다.")
	
}


/*  '

숫자가 임의 숫자를 하나 입력합니다.
숫자와 입력 볌윈ㄴ 1~150 사이의 숫자를 입력하게 됩니다.
다음과 같이 임의 숫자에 맞ㄴㄴ 결과 값ㅇㄹ 코드를 작성하시오
1~50까지의 범위 숫자
51~100까지의 범위 숫자
101~150까지의 범위 숫자

숫자는 1~150까지만 입력 가능합니다.	


		


var nu =5;

if ( 1=< nu =< 50){
	console.log("1~50까지의 범위 숫자 입니다.");

	else if (51 =< nu =<100){
	console.log("51~100까지의 범위 숫자 입니다.");
	
	else if (101 =< nu =<150){
	console.log("101~150까지의 범위 숫자 입니다.");
}	

else  {
	console.log("숫자는 1~150까지만 입력 가능합니다.");
}	


*/


//나머지값을 이용하여 짝수, 홀수를 구분하는 형태


var n =12;

if(n % 2 ==0){
	console.log("짝수 값 입니다.");
}
/* else if (n % 2 ! =0){
	console.log ("홀수 값 입니다.");
}

*/




