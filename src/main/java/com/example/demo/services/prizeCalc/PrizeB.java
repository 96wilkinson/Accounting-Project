package com.example.demo.services.prizeCalc;

public class PrizeB implements CalculatePrize {

	@Override
	public int calculatePrize(int accLength) {
		switch(accLength) {
			case 6:
				return 50;
			case 7:
				return 500;
			case 8:
				return 5000;
		}
		return 0;
	}

}
