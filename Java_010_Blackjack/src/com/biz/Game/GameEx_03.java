package com.biz.Game;

import java.util.Scanner;

import com.biz.Game.impl.DeckServiceV3;

public class GameEx_03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DeckServiceV3 sService = new DeckServiceV3();
		sService.selectMenu();
	}
	
	

}
