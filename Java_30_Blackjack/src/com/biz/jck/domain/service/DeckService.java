package com.biz.jck.domain.service;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.biz.jck.domain.DeckVO;

public class DeckService {

	// 생서된 1벌의 카드를 List에 저장
	List<DeckVO> deckList;
	String suit = "다이아(◆):하트(♥):스페이드(♠):클로버(♣)";
	String[] arrSuit = new String[] { "다이아(◆):하트(♥):스페이드(♠):클로버(♣)" };
	String denomination = "A1234567890KQJ";

	public DeckService() {
		this.deckList = new LinkedList<DeckVO>();
	}

	public List<DeckVO> getDeck() {

		int nSize = deckList.size();

		for (int i = 0; i < nSize; i++) {
			Collections.shuffle(this.deckList);
		}

		for (DeckVO vo : deckList) {
			Collections.shuffle(this.deckList);
		}
		return this.deckList;
	}

	public void makeDeck() {
		String[] denoms = denomination.split("");
		for (String suit : arrSuit) {
			for (String denom : denoms) {

				// 각 카드가 갖게 될 value를 생성
				// value값은 denoms를 기준으로 생성
				// 2~9까지는 보이는 값 그대로
				// A는 1로 JQKA는 10으로

				int intValue = 0;

				try {
					// 숫자 2 ~90까지는 각각 값들이 정수로 정상변환 될 것
					// 다만 A, JKQ는 Exception이 발생 할것
					intValue = Integer.valueOf(denom);
					if (intValue == 0)
						intValue = 10;
				} catch (Exception e) {
					if (denom.equals("A"))
						intValue = 1;
					else
						intValue = 10; // JKQ
				}

				DeckVO dVO = new DeckVO();
				dVO.setSuit(suit);
				dVO.setDenomination(denom);
				dVO.setValue(intValue);

			}
		}
	}

}
