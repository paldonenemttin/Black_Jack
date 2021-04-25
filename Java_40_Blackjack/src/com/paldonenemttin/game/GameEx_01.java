package com.paldonenemttin.game;

import java.util.Scanner;

import com.paldonenemttin.impl.MenuService;

public class GameEx_01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MenuService sService = new MenuService();
		sService.selectMenu();
	}

}
