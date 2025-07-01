/*

inner HTML, innerText => 기존에 있는 데이터에서 덮어쓰기 기본
append, appendChild, insertBefor => node는 데이터를 추가 

전역변수 형태로 HTML id를 가져올 경우 HTML 코드 아래에 Script를 작성해야함

*/


var user = document.getElementById("user");


function a(){				//노드 앞에 추가
/* creatElement : 태그를 생성하는 함수
	creatTextNode : 태그안에 문자 데이터를 적용할 경우
	*/


	var html = document.createElemnt("li");
	var data = document.createTextNode("홍길동");
	html.appendChild(data);
	
	//insertBefor : 노드 기준 상위에 데이터를 추가
	//user.insertBefore(html,user.childNodes[0]);
	
	user.insertBefore(html,user.firstChild);			

	
	
}

function b(){				//노드 뒤에 추가
	var html = document.createElemnt("li");
	var data = document.createTextNode("강감찬");
	html.append(data);
	user.appendChild(html);
	
	//lastChild 맨 마지막 데이터 노드
	
	
}

function c(){				//노드 중간에 추가
	var html = document.createElement(li);
	var data = document.createTextNode("김유신");
	html.append(data);
	user.insertBefor(html,user.children[2]);	
}

//append, insertBefor : HTML태그를 문자로 인식

function d(){				//노드 뒤에 HTML 형태 추가
	var html = document.createElement("li");
	var data = "<span>세종대왕</span>";
	html.innerHTMP = data;
	user.append(html);
}



function z(){
	var box = document.getElementById("box");
	var html = document.createElement("iput");
	html.type="text";
	html.id="email";
	html.name="email";
	html.className="mail";
	box.append(html);
	
}




/*	응용문제 
createElement : <태그></태그>
input 사용시 주의 해야하며, 텍스트가 노출되지 않는 버그가 있을 수 있음
*/


function make_node(){
	var idx= document.getElementById("nidx");		//사용자 입력값
	var node= document.getElemanetById("node");		//출력하는 곳
	
	
	var f;
	for(f=1; f<=idx; f++){
		var ck = document.createElement("input");
		ck.type = "checkbox";
		ck.id ="text"+f;
		
		var cktext = document.createTextNode("정답"+f);
		var brtag =document.createElement("br");
		node.append(ck);
		node.append(cktext);
		node.append(brtag);
		
		
	}
	
	
	
	
	/*var tag= document.createElement("span");
	var ck= document.createElement("input");
	ck.type = "checkbox";
	ck.id = "test1";
	
	var cktext = document.createTextNode("정답1");
	
	node.append(ck);
	node.append(cktext);
	
	tag.append(ck);			//<span><input>
	tag.append(cktext);
	node.append(tag);
	*/
	
}









