package com.biz.jck.domain.service;

import java.util.List;
import java.util.Scanner;

public class RuleService {

	List<card> dealerList;
	List<card> userList;
	Scanner scan;

	public RuleService() {
		// TODO 생성자
		dealerList = new ArrayList<card>();
		userList = new ArrayList<card>();
		scan = new Scanner(System.in);
	}

	public void hit() {
		// TODO hit 결정
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
		
	}
	
	public void pointBust() {
		// TODO 점수 및 버스트 확인
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
	}
	
	public void wunRoo() {
		// TODO 점수 공개 및 승패 결정
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
