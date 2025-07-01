
/*

http://mekeyace.dothome.co.kr/datalist.js
[외부 배열 데이터를 로드하여 다음과 같이 결과가 나오도록 코드를 작성하시오]

데이터 변수명 : productlist

**a_view 라는 키 중에서 Y에 해당되는 값만 출력을 시켜야 합니다.
만약 판매가격만 있고, 할인율 및 할인금액 없는 상품은 console에서 판매가격만 출력 되도록 해야합니다.

console.log 로 출력결과 예시


상품명 :  볼티아 트림 부츠컷 팬츠	(a_wktitle)

판매 가격 :  242000			(a_wkpd)
할인율 : 40%				(a_wkdp)
할인금액 : 14500				(a_wkad)



상품명	
판매가격 
할인율    
할인금액 

볼티아 트림 부츠컷 팬츠
24200
40%
14500


더보이핏 데님팬츠
34800


*/




console.log(productlist);
console.log(productlist["best_product"][0]["a_wktitle"]);




