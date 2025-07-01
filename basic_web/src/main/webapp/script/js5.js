var a =1;                    //시작값
do{                          //do시작
	console.log(a);          //출력
	a++;                     //증가, 감소
}while(a<10);                //범위값

var b =10;
do{
	//console.log(b);
	b--;
}while(b>0);


var c =60;
do{
	if(c%2==0){               // 나머지 값이 0으로 적용 되었을 경우(짝수)
		console.log(c);       //출력
	}
	c--;
}while(c>0);


/* 응용문제1
do~while문으로 다음과 같이 출력되는 코드를 작성하시오.

구구단 9단중 짝수 값만 모두 합친 결과값을 출력하시오.



var aa =90;
do{
	if(aa%9==0 %% aa%2==0){               
		console.log(aa);       
	}
	aa--;
}while(aa>0);
	sum = sum +aa;
	
	
	
	var sum = 0;      

for (aa=1;aa<91;a%9==0){
	sum = sum +aa;                   
}
console.log ("초종 합계 : " + sum);

*/


var g =1;
var sum =0;              //구구단 결과값
var total = 0;             //짝수 합계를 적용하는 변수


do{
	
	//console.log(9*g);
	sum= 9* g;                     //9단 계산 결과
	if(sum % 2 ==0){               //결과값에 대한 짝수 조건
		//total = total +sum;        //해당 조건에 맞을 경우 결과값을 누적시키는 코드
		total += sum;
	}
	g++;
}while(g<10);
	
console.log("최종 짝수 합계 : "+ total);


/* 응용문제 2

do~while문 이용하여 코드를 작성합니다.

1~100까지숫자 중 8의 배수 중에서 60 이상인 숫자만 출력하시오.


var go=1;


do{
	console.log(8*go);
	                     
	if(go>=60){               
		
	}
	go++;
}while(go<101);





var go =1;
do{
	if(go%8==0){               
		console.log(go);     
	}
	go++;
}while(go<101);



1.

var f =1;
var k =0;

do{
	k = 8*f;
	
	if(k >= 60){
		console.log(k);
	}
	
	f++;
}while(f <= 100);



*/


var f=1;
var k=0;



do{
	k = 8*f;
	
	if(k >= 60 && k <=100){
		console.log(k);
	}
	
	f++;
}while(f <= 100);













