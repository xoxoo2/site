/*var a=2,aa=1;
while(a <= 4){
	
	while(aa<= 9){
		console.log(a*aa);
		aa++;
	}
	a++;
}

*/

//while, do~while 더블 사용시 작은 반복문에 대한 변수 



var a=2;					//큰 반복문 시작값
while(a <= 4){
	var aa=1;				//작은 반복문 시작값
	while(aa<= 9){
		console.log(a*aa);
		aa++;
	}
	a++;
}



/*  응용문제 5

다음 결과처럼 출력되는 더블 반복문 코드를 작성하시오(while 전용)

[결과]

7*9 =63
7*8 =56
...
7*1=7
6*9=54
...
3*1 =


var a=7;					
while(a >= 3){
	var aa=9;				
	while(aa>= 1){
		console.log(a*aa);
		aa--;
	}
	a--;
}



*/


var w=7;					
while(w >= 3){
	var ww=9;				
	while(ww>0){
		console.log(w+"*"+ww+"="+w*ww);
		ww--;
	}
	w--;
}

//더블 while문 + if문

//2단 ~ 9단 결과값이 40 이상인 구구단만 출력



var sum=0;
var h=2;
while(h <=9){
	
	var hh=1;
	while(hh<=9){
		sum = h *hh;		//연산 수식구
		if(sum >= 40){		//40이상의 결과 조건
			console.log(h+"*"+hh+"="+sum);		//출력
		}
		hh++;
	}
	h++;
}


/*
응용문제 6

double while문 + if문을 이용하여 다음결과가 나올 수 있도록 출력하시오.

[결과]
구구단 6~8단 까지 중 결과값이 홀수 및 짝수 각각의 총 합계를 출력하시오.


var sum=0;
var som=0;
var x=6;
while(x <=8){
	
	var xx=1;
	while(xx<=9){
		sum = x *xx;		
		if(sum %2==0){		
			console.log(x+"*"+xx+"="+sum);		
		}
		xx++;
	}
	{
		var xx=1;
	while(xx<=9){
		som = x *xx;		
		if(som %2==1){		
			console.log(x+"*"+xx+"="+som);		
		}
		xx++;
			
	}
	}
	x++;
}



*/

/*
var totalno = 1;
var sum2;          ---> wrong

//nan 오류  : not a number

while(totalno <= 10){
	//sum2 = totalno;
	sum2 = sum2 + totalno;
	totalno++;	
}


console.log(sum2);

*/


var totalno = 1;
var sum2 = 0;

while(totalno <= 10){
	//sum2 = totalno;
	sum2 = sum2 + totalno;
	totalno++;	
}


console.log(sum2);



