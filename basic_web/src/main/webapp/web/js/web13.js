

var arr= {
	"member"	: ["홍길동","김감찬","이순신"]
};

console.log(arr["members"][12]);
console.log(arr.members[2]);
console.log(arr["members"].length);

/*
응용문제
해당 배열값 중 홀수 데이터만 모두 출력되는 코들르 작성하시오.




*/


var data = {
	"no":[20,11,21,13,7,6,33,31,30,42,48,41]	
}


//console.log(data["no"][6]);

var dataea = data["no"].length;
var ff;
for(ff=0; ff<dataea; ff++){
	if(data["no"][ff]%2 ==1){
		console.log(data["no"][ff]);	
	}
	
}


/* 응용문제

다음 포인트 전체의 총 합계를 구하는 코들르 작성하시오.
총 포인합 : 8910

*/


var db = {
	"point":[2500,1500,560,420,170,2810,950]
}