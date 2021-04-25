package com.paldonenemttin.model;

public class UserVO {
	
	private String cardUShap; // 카드 모양

	private Integer UPoint; // 값

	public String getCardUShap() {
		return cardUShap;
	}

	public void setCardUShap(String cardUShap) {
		this.cardUShap = cardUShap;
	}

	public Integer getUPoint() {
		return UPoint;
	}

	public void setUPoint(Integer uPoint) {
		UPoint = uPoint;
	}

	@Override
	public String toString() {
		return "[ 모양 =" + cardUShap + ", 값 =" + UPoint + "]";
	}

}
