package com.biz.Game;

import java.util.Scanner;

import com.biz.Game.impl.DeckService;

public class GameEx_02 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DeckService dService = new DeckService();
		dService.cardDeck();
		dService.cardDeck();
		if(dService.sumDealerScore() < 17) {
			System.out.println("딜러가 17미만이라 한장 더 받습니다.");
			dService.dealerHit();
		}
		dService.userHit();
		dService.vs();
	}

}
