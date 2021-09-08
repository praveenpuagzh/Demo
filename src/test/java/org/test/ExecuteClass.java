package org.test;

import org.base.BaseClass;

public class ExecuteClass extends BaseClass {

	
	public static void main(String[] args) {
		
		browserlaunch("Chrome");
		launchurl("https://www.youtube.com/");
		launchurl("https://web.whatsapp.com/");
		
	}
}
