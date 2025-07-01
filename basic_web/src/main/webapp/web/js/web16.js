var data = {
	"member" : [
		{
			"id" : "hong",
			"name": "홍길동",
			"age" : "32",
			"area": "서울"
			
		},
		{
			"id" : "ygsoon",
			"name": "유관순",
			"age" : "16",
			"area": "경기도"			
		},
		{
			"id" : "jangbo",
			"name": "장보고",
			"age" : "39",
			"area": "강원도"		
			
		}
		
	]
	
	
}


//Object.keys : 대표키, 보조키의 리스트를 확인하는 함수

console.log(Object.keys(data["members"][0]));
console.log(data["members"].length);				//대표키 기준 그룹 갯수
console.log(data["members"][1]["area"]);			//해당 키에 대한 데이터 출력



/* 

응용문제


[출력 예시]

hong
32
ygsoon
16
jangbo
39
*/















var box= document.getElementById("box");


var member_ea = member[0].length;
var member_group = member.length;


var k=0;
while(k < event_ea){
	//console.log(k);
	
	for(var f=0; f<event_group; f++){
		//consol.log(f);
		//console.log(event[f][k]);
		
		
		
	}
	
	k++;
	
}

var html = "";
//innerHTML 반복문 출력
for(var x=0; x<event_ea; x++){
	
	html += `<span>
	<img src="` + event[2][x]+ `" title=  "` +event[0][x]+ `" 
	style="width:180px; height:108px;"  >
	`+event[1][x]+`
	</span>`;
}
box.innerHTML = html;



var event_group = event.length;


var html_span,html_img;
var k=0;


while(k < event_ea){
	html_span = document.createElement("span");
	html_img = document.createElement("img");
	for(var f=0; f<event_group; f++){				//3
		//console.log(event[f][k]);
		
		if(f==0){
			html_img.title = event[f][k];
			
		}
		else if(f==1){
			
			html_text = document.createTextNode(event[f][k]);
			//html_span.append(html_text);
			
		}
		else{
			//html_img = document.createElement("img");
			html_img.src = event[f][k];
			html_img.style = "width:180px; height:108px;";
		}
	}
	
		
	
	html_span.append(html_img);
	html_span.append(html_text);
	box.append(html_span);
	k++;

	
	
}








