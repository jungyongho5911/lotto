package com.lotto.web.ServiceImpl;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lotto.web.bean.LottoBean;
import com.lotto.web.service.LottoService;

public class LottoServiceImpl<LotteBean> implements LottoService {
	private List<LottoBean> lottos;
	
	public LottoServiceImpl() {
		lottos = new ArrayList<>();
	}
	
	@Override
	public void lottoMoney(int money) {
		LottoBean lotto = null;
		int a = money/1000;
		if(a>5) {
			a=5;
		}
		for(int i=0; i<a; i++) {
			lotto = new LottoBean();
			String res = "";
			for(int j=0;j<6;j++) {
				int[] t = createLotoo();
				res += t[i]+",";
				lotto.setLottoNumber(res);
			}
			lottos.add(lotto);
		}
	}
	public int [] createLotoo() {
		int lotto[] = new int[6];
		String res = "";
		for(int i=0; i<lotto.length; i++){
			lotto[i] = (int)(Math.random()*45)+1;
			for(int j=0; j<i; j++){
				if(lotto[i] ==lotto[j]){
					i--;
					break;
				}  
			}
		}
		Arrays.sort(lotto);
		for(int i=0; i<lotto.length; i++){
	}	
		return lotto;
	}
	
	@Override
	public Object showLottos() {
		
		return lottos;
		}

	
	}
