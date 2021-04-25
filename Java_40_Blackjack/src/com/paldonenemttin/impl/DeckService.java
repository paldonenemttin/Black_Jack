package com.paldonenemttin.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.paldonenemttin.model.DealerVO;
import com.paldonenemttin.model.UserVO;
import com.paldonenemttin.service.TotalService;

public class DeckService implements TotalService {

	// 인터페이스 구현
	// 각 변수를 선언

	protected ArrayList<String> cardList; // 카드 52장을 저장할 List

	protected List<UserVO> userList; // 유저가 뽑은 카드가 저장될 List
	protected List<DealerVO> dealerList; // 딜러가 뽑은 카드가 저장될 List

	protected Random rnd;
	protected Scanner scan;
	
	private static final String name = "딜러"; // 이름 설정 딜러


	public DeckService() {
		// TODO 각 변수를 초기화

		cardList = new ArrayList<String>();

		userList = new ArrayList<UserVO>();
		dealerList = new ArrayList<DealerVO>();

		rnd = new Random();
		scan = new Scanner(System.in);

	}

	@Override
	public void cardDeck() {
		// TODO 카드 52장 생성 method

		String pattern[] = { "heart", "spade", "clover", "dia" };
		String cardnum[] = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardList.add(pattern[i] + ":" + cardnum[j]);
			}
		}
	}

	@Override
	public void UserDeck() {
		// TODO 유저에게 카드 한장을 나눠주고 유저 덱에 저장 method

		String cardU; // 카드 담김

		Integer cardUscore; // 실제 값

		int num = rnd.nextInt(cardList.size());

		cardU = cardList.get(num);
		cardList.remove(num);

		String cardUp[] = cardU.split(":");
		if (cardUp[1].equals("A")) {
			cardUscore = 1;

		} else if (cardUp[1].equals("J")) {
			cardUscore = 10;

		} else if (cardUp[1].equals("Q")) {
			cardUscore = 10;

		} else if (cardUp[1].equals("K")) {
			cardUscore = 10;

		} else {
			cardUscore = Integer.valueOf(cardUp[1]);

		}

		UserVO uVO = new UserVO();
		uVO.setCardUShap(cardU);
		uVO.setUPoint(cardUscore);
		userList.add(uVO);
		
		// :D 유저덱 확인용 코드
		/* System.out.println();
		System.out.println("[유저 카드]" + cardU);
		System.out.println("[값]" + cardUscore);
		System.out.println(); */

	}

	@Override
	public void DealerDeck() {
		// TODO 딜러에게 카드 한장을 나눠주고 딜러 덱에 저장 method

		String cardD; // 카드 담김

		Integer cardDscore; // 실제 값

		int num = rnd.nextInt(cardList.size()); // 한장 뽑고

		cardD = cardList.get(num);
		cardList.remove(num); 

		String cardDp[] = cardD.split(":");
		if (cardDp[1].equals("A")) {
			cardDscore = 1;

		} else if (cardDp[1].equals("J")) {
			cardDscore = 10;

		} else if (cardDp[1].equals("Q")) {
			cardDscore = 10;

		} else if (cardDp[1].equals("K")) {
			cardDscore = 10;

		} else {
			cardDscore = Integer.valueOf(cardDp[1]);

		}

		DealerVO dVO = new DealerVO();
		dVO.setCardDShap(cardD);
		dVO.setDPoint(cardDscore);
		dealerList.add(dVO);

		/* :D 딜러덱 확인용 코드
		System.out.println();
		System.out.println("[딜러 카드]" + cardD);
		System.out.println("[값]" + cardDscore);
		System.out.println(); */

	}

	@Override
	public void getCard() {
		// TODO 첫 시작시 딜러, 유저에게 각각 카드 2장을 주는 method
		this.cardDeck();
		System.out.printf("%28s", "먼저 카드 2장을\n");
		System.out.printf("%29s", "유저, 딜러 순으로 나눠주겠습니다\n");
		System.out.println("=".repeat(50));
		System.out.println();

		for (int i = 1; i < 3; i++) {

			System.out.printf("[유저]에게 '%d번째' 카드를 주었습니다\n", i);
			UserDeck();

			System.out.printf("[딜러]에게 '%d번째' 카드를 주었습니다\n", i);
			DealerDeck();

		}
		System.out.println();
		
		/* :D 확인용 코드
		System.out.println("=".repeat(50));
		System.out.println("유저 덱 총합 : " + this.sumUserScore());
		System.out.println("-".repeat(50));
		System.out.println("딜러 덱 총합 : " + this.sumDealerScore());
		System.out.println("-".repeat(50)); */
	}

	@Override
	public Integer sumDealerScore() {
		// TODO 딜러 덱에 들어있는 카드 총점 계산 method
		Integer sumDealer = 0;
		for (DealerVO vo : dealerList) {
			sumDealer += vo.getDPoint();
		}
		return sumDealer;
	}

	@Override
	public Integer sumUserScore() {
		// TODO 유저 덱에 들어있는 카드 총점 계산 method

		Integer sumUser = 0;
		for (UserVO vo : userList) {
			sumUser += vo.getUPoint();
		}
		return sumUser;
	}

	@Override
	public void dealerHit() {
		// TODO 딜러 Hit 조건 method
	}
	
	@Override
	public void userHit() {
		// TODO 유저 Hit method
	} 
	
	public void turnBack() {
		// TODO 
	}

	@Override
	public void selectMenu() {
		// TODO Auto-generated method stub

	}

	@Override
	public void help() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void bust() {
		// TODO Auto-generated method stub
		
	}
	

	
}

