function html_code(){
	
	
	var no =document.getElementById("no");		//사용자가 입력값
	var box = document.getElementById("box");	//출력 장소
	var select = document.createElement("select");  // select 태그
	select.id = "ea"; 		//태그에 id이름을 부여
	
	
	
	var w =1;
	var option ="";
	var text ="";
	
	while(w <= no.value){
		option = document.createElement("option");
		option.value = w;				// option 태그에  value 부여
		text = document.createTextNode(w+ "EA"); 		//textnode 문자만 생성
		option.append(text);
		select.append(option);			//select 태그에 option 태그 node 생성
		w++;
	}
	box.append(select);
}