package com.example.demo.services.generate;

import java.util.Random;

public class EightGenerate implements GenerateAccNum {

	@Override
	public String generateNumber() {
		String accNumber = "";
		Random abc = new Random();
		
		switch(abc.nextInt(3)) {
		case 0:
			accNumber += "a";
			break;
		case 1:
			accNumber += "b";
			break;
		case 2:
			accNumber += "c";
			break;
		default:
			accNumber = "";
		}
		
		while(accNumber.length() < 8) {
			Random num = new Random();
			accNumber += num.nextInt(10);
		}
		return accNumber;
		
	}

}
