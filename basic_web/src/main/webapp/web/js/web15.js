
var data = [
	["홍길동","이순신","유관순"],
	["a형","0형","B형"]
];
  //2차 배열 => 배열[그룹번호][데이터보호]
  //console.log(data[1][1]);


console.log(data.length);
var w =0;

//var w= [data[0]]

while (w < data[0].lenght){
	
	
	
	
	var ww=0;
	while(ww < data[0].length){			//해당 배열 그룹 갯수
		console.log(data[ww][w]);
		w++;
	}
}



/*
응용문제 

다음 해당 내용의 배열을 확인하여 console로 출력되도록 코드를 작성 하시오.

출력 결과
5000쿠폰
5000
./01.jpg
1+1 이벤트
1EA 
./02.jpg






var event = [
	["5000쿠폰","1+1 이벤트","식자재 30% 전품목 할인","배송비 무료","10대 간식 20%할인"],
	["5000","1EA","30","0","20"],
	["./01.jpg","./02.jpg","./03.jpg","./04jpg","./05.jpg"]
	
];





console.log(data.length);
var i =0;

var i= [data[0]]



for (var i = 0; i < event[0].length; i++) {
    consol.log();
}





while (i < data[0].lenght){
	
	
	
	
	var ii=0;
	while(ii < data[0].length){			
		console.log(data [iii][ii][i]);
		i++;
	}
	
	var iii=0;
	while(iii < data[0].length){			
		console.log(data [iii][ii][i]);
		i++;
	}
	
	
	
}

*/


var event = [
	["5000쿠폰","1+1 이벤트","식자재 30% 전품목 할인","배송비 무료","10대 간식 20%할인"],
	["5000","1EA","30","0","20"],
	["./01.jpg","./02.jpg","./03.jpg","./04.jpg","./05.jpg"]
	
];

var box= document.getElementById("box");


var event_ea = event[0].length;
var event_group = event.length;


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







