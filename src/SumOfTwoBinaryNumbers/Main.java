package SumOfTwoBinaryNumbers;

public class Main {

    public static void main(String[] args) {
        long numar1 =11L;
        long numar2 =101101L;
        long tempNumber;
        long sumOfNumbers=0;
        Utils fun = new Utils();
        if (fun.countLengthOfPositiveInteger(numar2)>fun.countLengthOfPositiveInteger(numar1)){
            tempNumber=numar1;
            numar1 = numar2;
            numar2 = tempNumber;
        }
        int lenght = fun.countLengthOfPositiveInteger(numar1);
        int remain = 0;
        for (int i = 1; i <= lenght ; i++) {
            if (fun.iDigitOfPositiveNumber(numar1,i)+fun.iDigitOfPositiveNumber(numar2,i)+remain==2){
                sumOfNumbers+=0;
                remain=1;
            }else
                if (fun.iDigitOfPositiveNumber(numar1,i)+fun.iDigitOfPositiveNumber(numar2,i)+remain==3){
                    sumOfNumbers+=fun.xPowY(10,i-1);
                    remain=1;
                }
                else {
                    if (fun.iDigitOfPositiveNumber(numar1,i)+fun.iDigitOfPositiveNumber(numar2,i) + remain == 0){
                        sumOfNumbers+=0;
                    }
                    else {
                        sumOfNumbers+=fun.xPowY(10,i-1);
                    }
                    remain=0;
                }
        }
        if (remain==1){
            sumOfNumbers+=fun.xPowY(10,lenght);
        }
        System.out.println(sumOfNumbers);
    }
}
