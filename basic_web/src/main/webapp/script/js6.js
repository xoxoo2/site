var f,ff;

for(f=1;f<4;f++){					//큰 반복문 
	//console.log(f);
	for(ff=1; ff<6; ff++){			//작은 반복문
		console.log(f+ff);			//계산 결과
	}
}



/*  응용문제 3  1/8

더블 반복문만 이용하여 다음 결과가 되도록 출력 하시오.

4 => 3+1
5 => 3+2
6

3
4
5

2
3
4 1+=>


var f,ff;

for(f=3;f>0;f--){					
	//console.log(f);
	for(ff=1; ff<4; ff++){			
		console.log(f+ff);			
	}
}



*/



var z,zz;

for(z=3;z>0;z--){					//3~1 역순으로 반복			
	for(zz=1; zz<4; zz++){			//1~3 까지 반복
		console.log(z+zz);			//계산 결과값 출력
		}
}		
		
																							
																							
																							
																							
//2~9단까지 출력																							
																							
																							
var k,kk;

for(k=1;k<10;k++){	
							
	for(kk=1; kk<10; kk++){			
		console.log(k+ "*" + kk + "=" + k*kk);			
		}
}																									
																							
																							
/* 응용문제 4

더블 반복문을 이용하여 다음 결과가 출력되는 코드를 작성하시오.

구구단	5~8단까지 값 중 결과값이 짝수인 모든 숫자 합계를 출력하는 결과를 작성하시오.																						
																							
																							
																							
var k,kk;

for(k=5;k<9;k++){	
							
	for(kk=1; kk<10; kk++){			
		console.log(k+ "*" + kk + "=" + k*kk);			
		}
}																							




var sum =0;              
var total = 0;             


do{                    
	if(sum % 2 ==0){               
		//total = total +sum;        
		total += sum;
	}
	k++;
}while(k<10);
	
console.log("최종 짝수 합계 : "+ total);






																							
*/																							
																							
																							
var i,t;					//반복문에 사용
var sum=0;					//총합계 값



for(i=5;i<9;i++){	
							
	for(t=1; t<10; t++){
		if((i*t)%2==0){
			sum += i *t;
		}
	}
}			
console.log("최종 결과값 :" + sum);			
		
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							
																							