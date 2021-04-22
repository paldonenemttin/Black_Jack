package com.biz.Game.service;

import java.util.ArrayList;
import java.util.List;

import com.biz.Game.domain.DeckVO;

public class RuleService {

	List<DeckVO> dealerList;
	List<DeckVO> userList;

	DeckVO deckVO;

	public RuleService() {
		// TODO 생성자
		dealerList = new ArrayList<DeckVO>();
		userList = new ArrayList<DeckVO>();
		deckVO = new DeckVO();
	}

	public void pointBust() {
		// TODO 버스트와 승패 확인

		// VO에 담긴 카드값을 dealer 와 user 변수에 담고
		// boolean을 이용해 if() 조건식으로 bust인지 false와 true로 판별
		int dealer = deckVO.getDealerPoint();
		boolean dealerBust = false;
		if (dealer > 21) {
			dealerBust = true;
		}

		int user = deckVO.getUserPoint();
		boolean userBust = false;
		if (user > 21) {
			userBust = true;
		}

		// 먼저 딜러와 플레이어의 카드값을 공개
		System.out.println("Dealer : " + dealer);
		System.out.println("Player : " + user);

		// if() 사용해서 각 카드값을 비교와 bust 상태를 확인하고
		// 승패 판별하는 메시지 출력
		if (dealer == user || dealerBust && userBust) {
			System.out.println("Draw");
		}
		if (dealer < user || dealerBust) {
			System.out.println("Player Win");
		}
		if (user == 21) {
			System.out.println("♡♠Black Jack♣◇");
			System.out.print(" Player Win");
		}
		if(dealer == 21) {
			System.out.println("♡♠Black Jack♣◇");
			System.out.print(" Dealer Win");
		}
		else {
			System.out.println("Dealer Win");
		}
		this.printPoint();

	}

	public void printPoint() {
		// TODO 승패 후 카드 출력

		/*
		 * dealerList와 userList에 담긴 값들을 변수 Size에 담고 
		 * for() 반복문으로 VO에 배열로 담긴 카드값을 출력
		 */
		System.out.println("Dealer Deck");
		System.out.println("*".repeat(50));
		int dSize = dealerList.size();
		for (int i = 0; i < dSize; i++) {
			System.out.print(dealerList.get(i) + "\t");
		}

		System.out.println();

		System.out.println("Player Deck");
		System.out.println("*".repeat(50));
		int uSize = userList.size();
		int userPoint;
		for (int i = 0; i < uSize; i++) {
			System.out.print(userList.get(i) + "\t");
		}

	}

}
