package com.paldonenemttin.impl;

public class HitService extends DeckService{
	
	 
	public void dealerHit() {
		
		System.out.println("-".repeat(50));

		while(true) {
			if (this.sumDealerScore() <= 16) {
				System.out.println();
				System.out.println("[딜러] 카드 덱의 '총합이 16'이하 ");
				System.out.println("[딜러]는 카드를 1장 더 받습니다");
				this.DealerDeck();
				System.out.println();
				System.out.println("=".repeat(50));
				
				/* :D 확인용 코드
				System.out.println("=".repeat(50));
				System.out.println("딜러 합 : " + this.sumDealerScore());
				System.out.println("=".repeat(50)); */ 
				
		}else if(this.sumDealerScore() >= 17) { 
				System.out.println();
				System.out.println("[딜러] 카드 덱의 '총합이 17'이상 ");
				System.out.println("[딜러] 덱에 카드를 더이상 추가할 수 없습니다");
				System.out.println();
				System.out.println("-".repeat(50)); 
				
				/* :D 확인용 코드
				System.out.println("=".repeat(50));
				System.out.println("딜러 합 : " + this.sumDealerScore());
				System.out.println("=".repeat(50));  */
				break; 
			 } 
			
		} // while end  
		
	 
} // dealerHit end */

@Override
public void userHit() {
	// TODO 유저 Hit method

	while (true) {
		System.out.printf("[유저]는 카드를 한장 더 받으시겠습니까?\n");
		System.out.println();
		System.out.println(" Yes : 1 , No : 2");
		System.out.print(">> ");
		String strInput = scan.nextLine();
		
		if(strInput.equals("")) {
			System.out.println("-".repeat(50));
			System.out.printf("%28s", "[ 입력 오류 ]\n");
			System.out.printf("%28s", "'빈칸'은 입력할수 없습니다\n");
			System.out.printf("%31s", " '1 or 2' 중에서 선택해주세요\n");
			System.out.println("-".repeat(50));
			continue;
		}
		
		Integer nInput = null; 
		try {
			nInput = Integer.valueOf(strInput);
			if(nInput > 2 ) {
				System.out.println("-".repeat(50));
				System.out.printf("%28s", "[ 입력 오류 ]\n");
				System.out.printf("%31s", " '1 or 2번' 중에서 선택해주세요\n");
				System.out.println("-".repeat(50));
				continue;
			}
		} catch (Exception e) {
			System.out.println("-".repeat(50));
			System.out.printf("%28s", "[ 입력 오류 ]\n");
			System.out.printf("%28s", "'문자'는 입력할수 없습니다\n");
			System.out.printf("%31s", " '1 or 2' 중에서 선택해주세요\n");
			System.out.println("-".repeat(50));
			continue;
		}
		if (nInput == 1) {
			System.out.println("=".repeat(50));
			System.out.println();
			System.out.printf("%30s", "[[ 1번을 입력하셨습니다 ]]\n");
			System.out.printf("%30s","[유저]가 '카드 1장을 추가'했습니다\n");
			System.out.println();
			System.out.println("=".repeat(50));
			this.UserDeck();
			
			/* :D 확인용 코드
			System.out.println("유저의 합 : " + this.sumUserScore());
			System.out.println("=".repeat(50)); */
			
		} else if (nInput == 2) {
			System.out.println("=".repeat(50));
			System.out.println();
			System.out.printf("%32s", "[[ 2번을 입력하셨습니다 ]]\n");
			System.out.printf("%30s","[유저]가 카드를 받는것을 거부했습니다.");
			System.out.println();
			System.out.println();
			System.out.println("=".repeat(50));

			/* :D 확인용 코드
			System.out.println("결과를 출력");
			System.out.println(userList.toString());
			System.out.println("유저의 합 : " + this.sumUserScore());
			System.out.println("-".repeat(50)); */
			break;
		}
		
	} // while end

} // userHit method end

public void turnBack() {
	// TODO 카드, 유저, 딜러 List 초기화 method
	userList.removeAll(userList);
	dealerList.removeAll(dealerList);
	cardList.removeAll(cardList);
	
}

}
