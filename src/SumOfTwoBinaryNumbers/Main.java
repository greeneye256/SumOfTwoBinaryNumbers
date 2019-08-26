package SumOfTwoBinaryNumbers;

public class Main {

    public static void main(String[] args) {
        long numar1 =10L;
        long numar2 =101L;
        long tempNumber;
        long sumOfNumbers=0;
        Utils fun = new Utils();
        //aflu care numar e mai mare dintre cele doua si le inversez daca al doilea e mai mare ca sa pot trece for-ul prin lungimea cea mai mare
        if (fun.countLengthOfPositiveInteger(numar2)>fun.countLengthOfPositiveInteger(numar1)){
            tempNumber=numar1;
            numar1 = numar2;
            numar2 = tempNumber;
        }
        // creez variabila length ca sa ma folosesc de ea in for
        int length = fun.countLengthOfPositiveInteger(numar1);
        // creez variabila remain pentru a ma ajuta in cazul in care cifrele adunate depasesc unu
        int remain = 0;
        // prin for se trece pe toata lungimea numarului mai mare ca lungime si adun rezultatul la sumOfNumbers in functie de conditiile puse in if-uri. Se poate cred face mai simplu de inteles intr-un switch
        for (int i = 1; i <= length+1 ; i++) {
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
        System.out.println(sumOfNumbers);
    }
}
