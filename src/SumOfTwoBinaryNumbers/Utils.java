package SumOfTwoBinaryNumbers;

class Utils {
    int iDigitOfPositiveNumber(long number, int digitPosition){

        return (int) lastDigitOfPositiveNumber(number/xPowY(10,digitPosition-1));
    }
    int countLengthOfPositiveInteger(long number){
        int numberLength=0;
        while (number>0){
            number/=10;
            numberLength++;
        }
        return numberLength;
    }
    private long lastDigitOfPositiveNumber(long number){
        return number%10;
    }
    long xPowY(int x,int y){
        long result=1;
        for (int i = 0; i < y; i++) {
            result*=x;
        }
        return result;
    }
}
