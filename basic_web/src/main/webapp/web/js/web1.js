var a = "전역변수";
var z,k; 				//전역변수를 선언만 한 상황

//this : 전역변수를 호출 할 때 사용하는 명령어

function  aaa(){		//즉시 실행 함수
	var a = "a 지역변수 생성"
	console.log(this.a);		//전역변수의 값을 가져와서 출력
	console.log(a);				//지역변수의 a 변수값을 가져옴
	var b = "지역변수";
}
aaa();  				//함수 실행


function bbb(){ 		//일반함수
	this.a = "aaa 변수 생성";			//전역변수 값을 변경함
	var b = "bbb에서 사용하는 지역변수";
	console.log(b);
}

function aaa(){						//함수명이 중복 될 경우 기존에 사용된 함수는 실행되지 않습니다.
	console.log("회원가입");
}

bbb();
aaa();


function ccc(id,pw){			//매개변수,매개변수
	console.log(id);
	console.log(pw);
}

ccc("hong","a1234");			//인자값 2개를 ccc함수 전달
ccc(10,20);						//인수값 2개를 ccc함수 전달
ccc("kim",20000);				//인자값 + 인수값 ccc함수 전달
ccc("park");					//인자(인수)값을 하나만 적용 했을 경우 undefind 발생이됨 (매개변수는 2개)


function ddd(point){   				// =>  function ddd(point,pt)
	console.log(point);
}

ddd(10000,5000); 				//인수는 2개  => 매개변수 1개 => data loss 발생


function box(){
	//2. 지역변수 생성 값을 적용
	var usernm = "홍길동";
	var userlevel = "일반회원";
	box2(usernm,userlevel);		//3. box2 함수에 인자값을 적용하여 실행

}

function box2(nm,level){			//4. 매개변수 전달값을 받음
	console.log(nm);				//5. 매개변수값을 출력
	console.log(level);
}

box();				//1.함수 실행


/*전역변수 지역변수 차이

 		var a = "전역변수";	=> 	a = "aaa 변수 생성";
	
	
	함수명이 중복 될 경우 기존에 사용된 함수는 실행되지 않습니다.
	
*/