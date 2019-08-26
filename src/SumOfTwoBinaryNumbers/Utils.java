package SumOfTwoBinaryNumbers;

class Utils {
    //Metoda ce returneaza valoarea unei cifre aflata pe pozitia y a unui numar. Pozitia este de la dreapta spre stanga.
    int iDigitOfPositiveNumber(long number, int digitPosition){

        return (int) lastDigitOfPositiveNumber(number/xPowY(10,digitPosition-1));
    }
    // Metoda ce afla numarul de cifre ce formeaza un numar intreg pozitiv.
    int countLengthOfPositiveInteger(long number){
        int numberLength=0;
        while (number>0){
            number/=10;
            numberLength++;
        }
        return numberLength;
    }
    // Metoda ce returneaza ultima cifra a unui numar
    private long lastDigitOfPositiveNumber(long number){
        return number%10;
    }
    //Calculeaza rezultatul lui x la puterea y
    long xPowY(int x,int y){
        long result=1;
        for (int i = 0; i < y; i++) {
            result*=x;
        }
        return result;
    }
}
