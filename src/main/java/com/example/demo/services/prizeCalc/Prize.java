package com.example.demo.services.prizeCalc;

public class Prize {
    public int parser(String accNum) {
        char[] accNumArray = accNum.toCharArray();
        char accLetter = accNumArray[0];
        int accNumLength = accNumArray.length;

        switch (accLetter){
            case 'a':
                return new PrizeA().calculatePrize(accNumLength);
            case 'b':
                return new PrizeB().calculatePrize(accNumLength);
            case 'c':
                return new PrizeC().calculatePrize(accNumLength);
        }
        return 0;
    }

}
