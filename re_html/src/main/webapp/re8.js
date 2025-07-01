
var data = [
	["hong","part","kim"],
	[25,30,11]	
];


var data2 = {
	"notice":[
		{
			"subject":"신한카드 시스템 점검",
			"writer":"관리자"
		},
		{
			"subject":"2025년 설 이벤트!!",
			"writer":"리자"
		}		
	]	
}


//console.log(data);


/*
console.log(data[0][1], data [1][1]);
//console.log(data2);



console.log(data2["notice"][1]["subject"], data2["notice"][1]["writer"]);

*/

console.log(data.length);						//2
console.log(data[0].length);					//3


//var ea = data[0].length;

var f;

for(f=0; f< data[0].length; f++){
	
	if(Number(data[1][f]) >= 20){
	
	
	console.log("id : " + data[0][f]);
	console.log("age : " + data[1][f]);	
	
	
	}
}



//undefind : 값을 가져오지 못할 경우

console.log(data2["notice"].length);

var ea = data2["notice"].length;
var w = 0;
while(w < ea){
	console.log(data2["notice"][w]["subject"]);
	console.log(data2["notice"][w]["writer"]);
	w++;
}






















console.log(news);


//console.log(news[0][1]);


/*innerHTML : HTML 태그를 사용가능함 (단, 신규 데이터를 입력시 초기화 되는 현상 => 누적시키는 변수 해결가능)

append , insertBefore : Node 형태이며, 순차적으로 데이터를 적용시킬 수 있음 (단, HTML태그가 문자 출력이됨)

*/



var search_word = "";											//검색 단어를 적용할 전역변수
var all_view = "Y";												//전체 리스트를 핸들링 하는 전역변수




var all_news = function(){											//전체 버튼
	this.all_view = "Y";									//전역변수 N => Y
	news_detalist();										// 함수를 재실행	
}



var search_news = function(){											//검색버튼
	
	this.all_view = "N";
	this.search_word = document.getElementById("corp").value;
	news_datalist();
}




function news_detalist(){
	

console.log(this.all.view);

var news_notice = document.getElementById("news_notice");
var html = "";
var z= news.length-1;


while(z >= 0 ){											//5
	
	if(this.search_word == news[z][1] && this.all_view == "N"){
	html += "<li>";
	var zz = 0;
	
	
		while(zz <news[0].length){								//3
		html += news[z][zz] + "&nbsp;";
		
		zz++;
		
		
		
		
				
				//console.log(news[z][zz]);
		//html += "<li></li>"
		
		}
		html += "</li>";
	//z++;
	
	
	}
	else if(this.all_view == "Y"){
		html += "<li>";
		var zz = 0;
		while(zz <news[0].length){
			html += news[z][zz] + "&nbsp;";
			zz++;
		}
		html +=
		
	}
	
	
	else{
		
		
	}
	
	z--;
}



news_notice.innerHTML = html;

}

news_detalist();										//함수를 강제 실행시킴