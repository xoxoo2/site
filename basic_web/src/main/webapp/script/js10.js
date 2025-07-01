//for~while문 if문 사용 짝수 단 만 출력



var a;                                  //for문 변수
for(a=2; a<=9; a++){
	if(a % 2 ==0){
		var b =1;						//while 시작값 변수
		while(b <= 9){					//범위
			console.log(a+"*"+b+"="+a*b);		//출력
			b++;
		}	
	}
}


/*
응용문제

구구단 2~8단까지 중 4단, 7, 8단 만 출력하시오.
반복문은 do~while + for


a=   1<a<9  a++

c=4 d=7 e=8

b=1; b<10 b++

console.log(c+"*"+b+"="+c*b);
console.log(d+"*"+b+"="+d*b);
console.log(e+"*"+b+"="+e*b);


var a;                                 
for(a=2; a<=9; a++){
	if(a* b ==0){
		var b =1;						
		while(b <= 9){					
			console.log(a+"*"+b+"="+a*b);		
			b++;
		}	
	}
}


*/


/* 응용문제

사용자가 2개의 숫자를 입력합니다. 2개의 숫자 범위 해당되는 구구단을 출력시키시오.

단, 작은 반복문에 작동시 짝수에 해당되는 정수만 사용합니다. (while+do while)

예시

var no=3;
var no2 =5;

3*1=
3*4
3*6
3*8
...
5*8=


no     no=3 no=<no2 no++
o       o%2==0 0<10  o++
no2		no2=5 



var no=3;
var no2=5;                                 
for(no=3; a<=no2; no++){
	o=1
	if(no<=no2){
		var o =1;						
		while(o%2== 0){					
			console.log(no+"*"+o+"="+no*o);		
			o++;
		}	
	}
}

*/