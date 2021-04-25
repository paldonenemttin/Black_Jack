package com.paldonenemttin.impl;

public class RuleService extends DeckService {

	public void pointBust() {
		// TODO 버스트 확인

		// 상속을 이용해 deckService 클래스의 sumScore method()를 호출하여 그 안에
		// boolean을 이용해 if() 조건식으로 bust인지 false와 true로 판별
		// bust가 결정나면 winLose() method를 호출
		boolean dealerBust = false;
		if (this.sumDealerScore() > 21) {
			dealerBust = true;
		}

		boolean userBust = false;
		if (this.sumUserScore() > 21) {
			userBust = true;
		}
		if (dealerBust == true || userBust == true) {
			this.winLose(dealerBust, userBust);
		}
		if (dealerBust == true && userBust == true) {
			this.winLose(dealerBust, userBust);
		} else {
			this.winLose(dealerBust, userBust);
		}
	}// end Bust method()

	public void winLose(boolean dealerBust, boolean userBust) {
		// TODO 승패 확인 후 출력
		int dealer = this.sumDealerScore();
		int user = this.sumUserScore();

		System.out.println("   딜러와 플레이어의 승패를 결정합니다 ");
		System.out.println("-".repeat(50));
		// 먼저 딜러와 플레이어의 카드값을 공개
		System.out.println("Dealer Point : " + dealer);
		System.out.println("Player Point : " + user);
		
		System.out.println("-".repeat(50));

		// if() 사용해서 각 카드값과 매개변수로 받은 bust 상태를 확인하고
		// 승패 판별하는 메시지 출력
		if (dealer == user || dealerBust && userBust) {
			System.out.println("Draw");
		} else if (dealerBust) {
			System.out.println("Dealer Bust! Player Win");
		} else if (userBust) {
			System.out.println("Player Bust! Dealer Win");
		} else if (user > dealer) {
			System.out.println("Player Win");
		} else if (user == 21) {
			System.out.println("♡♠Black Jack♣◇");
			System.out.print(" Player Win");
		} else if (dealer == 21) {
			System.out.println("♡♠Black Jack♣◇");
			System.out.print(" Dealer Win");
		} else {
			System.out.println("Dealer Win");
		}
		this.printPoint();

	}// end winLose method()

	public void printPoint() {
		// TODO 승패 후 카드 출력
		
		System.out.println("=".repeat(50));
		System.out.println("    딜러와 플레이어의 카드를 공개합니다");

		// dealerList와 userList에 담긴 값들을 변수 Size에 담고
		// for() 반복문으로 VO에 배열로 담긴 카드값을 출력
		System.out.println("=".repeat(50));
		System.out.println("Dealer Deck");
		System.out.println("-".repeat(50));

		int dSize = dealerList.size();
		for (int i = 0; i < dSize; i++) {
			System.out.println(dealerList.get(i) + "\t");
		}

		System.out.println("=".repeat(50));
		
		System.out.println("Player Deck");
		
		System.out.println("-".repeat(50));

		int uSize = userList.size();
		for (int i = 0; i < uSize; i++) {
			System.out.println(userList.get(i) + "\t");
		}

	}// end print method()

}
