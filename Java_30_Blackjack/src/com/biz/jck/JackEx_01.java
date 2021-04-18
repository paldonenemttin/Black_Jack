package com.biz.jck;

import java.util.List;

import com.biz.jck.domain.DeckVO;
import com.biz.jck.domain.service.DeckService;

public class JackEx_01 {

	public static void main(String[] args) {
		
		DeckService deck = new DeckService();
		
		deck.makeDeck();
		List<DeckVO> deckList = deck.getDeck();
		for(DeckVO vo : deckList) {
			System.out.println(vo);
		}

	}

}
