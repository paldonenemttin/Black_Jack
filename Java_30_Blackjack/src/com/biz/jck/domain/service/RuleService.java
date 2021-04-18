package com.biz.jck.domain.service;

import com.sun.tools.javac.parser.Scanner;
import com.sun.tools.javac.util.List;

public class RuleService {

	List<card> dealerList;
	List<card> userList;
	java.util.Scanner scan;

	public RuleService() {
		// TODO Auto-generated constructor stub
		dealerList = new ArrayList<card>();
		userList = new ArrayList<card>();
		scan = new Scanner(System.in);
	}

	public void rule() {
		
		// hit 결정
		System.out.println("hit : 1 , stay : 2");
		Integer num = scan.nextInt();
		if(num == 1) {
			if(sum < 17) {
			this.hit();
			}else {
				break;
			}
		}
		if(num == 2) {
			break;
		}
		
		// 점수 및 버스트 확인
		
		int dSize = dealer.size();
		
		boolean dealerBust = false;
		for(int i = 0; i < dSize; i++) {
			int dealerPoint += dealer.get(i);
		}
		if(dealer > 21) {
			dealerBust = true;
		}
		
		boolean userBust = false;
		uSize = user.size();
		for(int j = 0; j < user.size() ; j++) {
			int userPoint += user.get(i);
		}
		if(player > 21) {
			userBust = true;
		}
		
		// 점수 공개 및 승패 결정
		System.out.println("딜러 : " + dealerPoint );
		System.out.println("플레이어 : " + userPoint);
		
		if(dealerPoint == userPoint || dealerBust && userBust) {
			System.out.println("무승부");
		}
		if(dealerPoint < userPoint || dealerBust ) {
			System.out.println("플레이어 승");
		} else {
			System.out.println("딜러 승");
		}
		
		// 카드 결과 출력
		for( int i = 0 ; i < dSize ; i++) {
			System.out.println(dealer.get(i));
		}
		System.out.println("딜러 카드 : " + dealer.get(i));
		
		for(int i = 0; i < uSize ; i++) {
			System.out.println(user.get(i));
		}
		System.out.println("플레이어 카드 : " + user.get(i));
	}

}
