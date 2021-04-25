package com.biz.Game.impl;

import java.util.Scanner;

public class DeckServiceV3 extends RuleService {

	String strIn;
	Scanner scan;

	public DeckServiceV3() {
		strIn = "";

	}

	public void selectMenu() {
		scan = new Scanner(System.in);
		while (true) {
			System.out.println("=".repeat(50));
			System.out.printf("%32s\n", "This is Black Jack");
			System.out.println("-".repeat(50));
			System.out.println("1. Game Start");
			System.out.println("2. Help");
			System.out.println("3. Exit");
			System.out.println("-".repeat(50));
			System.out.print(">> ");
			strIn = scan.nextLine();
			if (strIn.trim().equals("1")) {
				this.cardDeck();
				this.cardDeck();

				this.userHit();
				this.pointBust();
				continue;
			} else if (strIn.trim().equals("2")) {
				this.help();
			} else if (strIn.trim().equals("3")) {
				System.out.println("게임을 종료합니다.");

			}
			return;
		}

	}

	// 1
	public void help() {
		System.out.println("=".repeat(50));
		System.out.printf("%31s\n", "BlackJack rule");
		System.out.println("-".repeat(50));
		System.out.println("딜러와 플레이어의 1:1 승부");
		System.out.println("카드는 조커를 제외한 총 52장의 카드가 있다.");
		System.out.println("딜러와 플레이어가 각 카드를 2장씩받는다.");
		System.out.println("중복된 카드는 없습니다.");
		System.out.println("더보기 : Enter, 메뉴화면 : < ( 1 / 2 )");
		System.out.print(">> ");
		String strInput = scan.nextLine();
		if (strInput.equals("<")) {
			System.out.println("=".repeat(50));
			System.out.println("메뉴화면입니다.");
			System.out.println("1 ~ 5를 선택해주세요.");

		}
		System.out.println("받은 카드의 점수 합이 21 초과시 죽는다.");
		System.out.println("21에 가까운 사람이 이기거나 ");
		System.out.println("둘중 21을 초과하지 않고 높은 사람이 이깁니다.");
		System.out.println("딜러는 2장을 받고 17점 미만일 경우");
		System.out.println("자동으로 카드를 한장 더 건네 받습니다.");
		System.out.println("플레이어는 제약없이 원하면 카드를 계속 건네받을 수 있습니다.");
		System.out.println("메뉴화면 : Enter ( 2 / 2 )");
		System.out.print(">> \n");
		if (strInput.equals("")) {
			System.out.println("=".repeat(50));
			System.out.println("도움말이 끝났습니다.");
			System.out.println("메뉴 1 ~ 3를 선택해주세요.");

		}

		this.selectMenu();
	}

}
