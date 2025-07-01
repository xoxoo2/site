
//   + :  문자와 문자를 결합  / 숫자를 계산  ,  -   ,  /  ,   *  ,    %: 나머지  != : 서로값이 다를경우





/*
응용숙제 : 반복문(for)를 이용하여 다음과 같은 결과가 나오도록 코드를 작성하시오
1~10 모든 숫자를 합한 결과값을 출력
55


var p;           
var sum = 0;      

for (p=1;p<11;p++){
	sum = sum +p;                   
}
console.log ("초종 합계 : " + sum);



*/


var p;           
var sum = 0;      

for (p=1;p<11;p++){
	sum = sum +p;                   
}
console.log ("초종 합계 : " + sum);






/*

응용문제 숙제


1~20까지의 숫자 반복문 중 짝수, 홀수 각각의 최종 합계를 출력하는 코드를 작성하시오

2 4 6  8 10 12 14 16 18 20

짝수 :

1 3 5 7 9 11 13 15 17 19


1)
var a = 1;
while (1<21){
	if (a%2==0)
	sum = sum +a;
}
console.log ("초종 합계 : " + sum);


var a;           
var sum = 0;      

for (a=1;a<21;a%2==0){
	sum = sum +a;                   
}                         ==>X

for (a=1;a<21;a++){
	if(a%2==0){
		sum = sum +a;   
	}




console.log ("초종 합계 : " + sum);



2)

var b;           
var sum = 0;      

for (b=1;b<21;b%2==1){
	sum = sum +b;                   
}
console.log ("초종 합계 : " + sum);



*/


var a;           
var sum = 0;      

for (a=1;a<21;a%2==0){
	sum = sum +a;                   
}
console.log ("초종 합계 : " + sum);










/* 

응용문제 숙제

while문과 조건문을 이용하여 다음과 같은 결과가 되도록 코드를 작성하시오.
1~100 까지 숫자 중 5의 배수만 출력 되도록 합니다.

5 10 15 20 30 35


var s =1;                    
while(s<101){               
	if(s%5==0){              
		console.log(s);     
	}
	s++;
}

*/




/* js9.js 01.08


숙제 1 
반복문은 do~while문 for문을 이용하여 코드를작성합니다.
다음 결과처럼 출력이 되어야 합니다.
구구단 6단 ~2단까지 역순으로 출력되는 결과
6*9=
6*8=
...
2*1=

do 

*/


/*
응용문제

구구단 2~8단까지 중 4단, 7, 8단 만 출력하시오.
반복문은 do~while + for





*/



