package com.biz.Game.domain;

public class DealerVO {
	
	private String cardDShap; // 카드 모양

	private Integer dPoint; // 딜러 점수

	public String getCardDShap() {
		return cardDShap;
	}

	public void setCardDShap(String cardDShap) {
		this.cardDShap = cardDShap;
	}

	public Integer getDPoint() {
		return dPoint;
	}

	public void setDPoint(Integer dPoint) {
		this.dPoint = dPoint;
	}

	@Override
	public String toString() {
		return "DealrVO [cardDShap=" + cardDShap + ", DPoint=" + dPoint + "]";
	}

}
