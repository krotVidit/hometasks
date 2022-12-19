package ru.topacademy.java212.algebra;

public class IntegerFraction {
    private final int wholeFraction;
    private final int numerator;
    private final int denominator;

    public IntegerFraction(int wholeFraction, int numerator, int denominator) {
        if (wholeFraction <= 0 || denominator == 0 || numerator / denominator > 1 ) {
            this.wholeFraction = 1;
            this.numerator = 1;
            this.denominator = 2;
        } else {
            this.wholeFraction = wholeFraction;
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    public IntegerFraction multiply(IntegerFraction other){
        int numeratorThis = this.wholeFraction * this.denominator + this.numerator;
        int numeratorOther = other.wholeFraction * other.denominator + other.numerator;
        int resultNumerator = numeratorOther*numeratorThis;
        int resultDenominator = this.denominator * other.denominator;

        //сокращаем дробь
        for(int i = 2; i <= Math.min(resultDenominator,resultNumerator); i++){
            if(resultNumerator % i == 0 && resultDenominator % i ==0){
                resultNumerator /= i;
                resultDenominator /= i;
            }
        }
        //выделяем целую часть
        int resultWhole = 0;
        if(resultNumerator > resultDenominator){
            resultWhole = resultNumerator / resultDenominator;
            resultNumerator = resultNumerator % resultDenominator;

        }
        return new IntegerFraction(resultWhole,resultNumerator,resultDenominator);
    }

    @Override
    public String toString() {
        return wholeFraction + " " + numerator + "/" + denominator;
    }
}
