package com.lotto.web.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.Provider.Service;

import javax.swing.JOptionPane;

import com.lotto.web.ServiceImpl.LottoServiceImpl;
import com.lotto.web.bean.LottoBean;
import com.lotto.web.service.LottoService;

public class Portal {
	public static void main(String[] args) {
		LottoBean lotto = null;
		LottoService lottoService = new LottoServiceImpl();
		
		//구매금액1 로또생성2 로또출력3
		while(true) {
			switch(JOptionPane.showInputDialog("[MENU]1.로또구매금액 2.로또출력3.출력")) {
			case "1" : 
				lotto = new LottoBean();
				lottoService.lottoMoney(Integer.parseInt(JOptionPane.showInputDialog("구매금액입력")));
				break;
			case "2" :
				JOptionPane.showMessageDialog(null,lottoService.showLottos());
				break;
			case "3" :
				File f = new File("C:\\Users\\1027\\jse\\eclipse\\workspace\\lotto\\lotto.txt");
				BufferedWriter bw = null;
				try {
					 bw = new BufferedWriter(new FileWriter(f));
					 bw.write("로또번호 "+lottoService.showLottos());
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					try {
						bw.flush();
						bw.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				break;
			
			}
		}
	}
}
