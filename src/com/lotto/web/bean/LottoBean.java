package com.lotto.web.bean;

public class LottoBean {
	 private String lottoNumber;
	 private int money;
	public String getLottoNumber() {
		return lottoNumber;
	}
	public void setLottoNumber(String lottoNumber) {
		this.lottoNumber = lottoNumber;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "LottoBean =" + lottoNumber + "]";
	}
	
	 


	
}
