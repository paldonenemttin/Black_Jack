package com.biz.Game;

import java.util.Scanner;

import com.biz.Game.impl.RuleService;

public class GameEx_01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		RuleService sService = new RuleService();
		sService.cardDeck();
		sService.cardDeck();
		if(sService.sumDealerScore() < 17) {
			System.out.println("딜러가 17미만이라 한장 더 받습니다.");
			sService.dealerHit();
		}
		sService.userHit();
		sService.pointBust();
	}

}
