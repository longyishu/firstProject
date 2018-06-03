package com.lys.adapter;

import com.lys.WebChinese.WebChinese;
import com.lys.target.Target;

public class Adapt implements Target {

	@Override
	public void sendSmS() {
		WebChinese send = new WebChinese() ;
		try {
			send.Test() ;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
