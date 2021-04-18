package com.biz.jck;

import java.util.List;

import com.biz.jck.domain.DeckVO;
import com.biz.jck.domain.service.DeckService;
import com.biz.jck.domain.service.PlayerServiceV1;

public class JackEx_02 {
	
	public static void main(String[] args) {
		
		DeckService ds = new DeckService();
		
		ds.makeDeck();
		List<DeckVO> deckList = ds.getDeck();
		
		PlayerServiceV1 딜러 = new PlayerServiceV1(deckList);
		
		PlayerServiceV1 비구니 = new PlayerServiceV1(deckList, "비구니");
		
		딜러.hit();
		비구니.hit();
		
		
	}

}
