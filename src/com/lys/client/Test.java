package com.lys.client;

import com.lys.adapter.Adapt;
import com.lys.target.Target;

public class Test {
	public static void main(String[] args) {
		Target target = new Adapt() ;
		target.sendSmS() ;
	}
}
