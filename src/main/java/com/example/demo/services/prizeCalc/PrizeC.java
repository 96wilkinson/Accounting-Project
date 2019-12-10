package com.example.demo.services.prizeCalc;

public class PrizeC implements CalculatePrize {

	@Override
	public int calculatePrize(int accLength) {
		switch(accLength) {
			case 6:
				return 100;
			case 7:
				return 750;
			case 8:
				return 10000;
		}
		return 0;
	}

}
