function web(){
	//id로 값을 가져오는 방식
	var a = document.getElementById("se");     //id
	
	
	//form이 없는 상황에서 name 속성명으로 값을 js로 가져오는 방식
	var b = document.getElementByIdName("se")[0];		//name
	
	
	
	//form에 methode="get" 방식과 동일한 형태
	location.href="http://search.naver.com/search.naver?query="+b.value;
	
	
	/*console.log(b.value);
	console.log(a.value);*/
}

	//var count = 0;			//누적됨, 초기화가 잘 안됨 (전역변수)			
function fruit(){
	var count = 0;			//카운팅하는 변수 (지역변수)
	var x;
	//javascript에서 html에 없는 id명을 입력시 오류가 발생합니다.
	for(x=1; x<=3; x++){
		var ck = document.getElementById("f"+x).checked;
		if(ck == true){
			count++;
			//count +=1;
			//count = count +1;
			
		}
		else if(sk == false){
			//count--;
			//count -=1;
			count=count -1;
			
		}
		console.log(count);
	}
	
	//반복문은
	
	if(count==0){
		alert("한가지 이상 선택해 주셔야 합니다.");
	}
	else{
		location.href="http://nate.com";
	}
}

function agree(){
	var ag1 = document.getElementById("ag1");
	console.log(ag1.checked);
	if(ag1.checked == false){
		alert("동의 ㅎ")
		
	}
}





