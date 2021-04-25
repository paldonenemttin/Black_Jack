package com.paldonenemttin.service;

public interface TotalService {

	// 인터페이스 선언

	public void cardDeck(); // 카드 52장 생성하는 method

	public void UserDeck(); // 유저에게 카드 한장을 나눠주고 유저 덱에 저장 method

	public void DealerDeck(); // 딜러에게 카드 한장을 나눠주고 딜러 덱에 저장 method

	public void getCard(); // 첫 시작시 딜러, 유저에게 각각 카드 2장을 주는 method

	public Integer sumDealerScore(); // 딜러 덱에 들어있는 카드 총점 계산 method

	public Integer sumUserScore(); // 유저 덱에 들어있는 카드 총점 계산 method

	public void dealerHit(); // 딜러 Hit(카드를 한장 받는) method

	public void userHit(); // 유저 Hit method

	public void bust(); // 승패, 결과 도출하는 method

	public void selectMenu(); // 메뉴 method

	public void help(); // 도움말 method

	public void turnBack(); // 카드, 유저, 딜러 List 초기화 method

}
