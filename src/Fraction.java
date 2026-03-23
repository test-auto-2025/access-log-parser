public class Fraction {

    private final int numerator, denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаминатель не может быть меньше либо равен 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;

    }

    public int getNumerator() {
        return numerator;
    }

    public Fraction sum (Fraction f){
        int resultNumerator = this.numerator*f.denominator + f.numerator*this.denominator;
        int resultDenominator = this.denominator*f.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction sum (int x){
        int resultNumerator = this.numerator + x*this.denominator;
        int resultDenominator = this.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }

    public Fraction minus (Fraction f){
        int resultNumerator = this.numerator*f.denominator - f.numerator*this.denominator;
        int resultDenominator = this.denominator*f.denominator;
        return new Fraction(resultNumerator, resultDenominator);
   }

    public Fraction minus (int x){
        int resultNumerator = this.numerator - x*this.denominator;
        int resultDenominator = this.denominator;
        return new Fraction(resultNumerator, resultDenominator);
    }



//    public Fraction multiply (Fraction f){
//        int resultNumerator = this.numerator*f.numerator;
//        int resultDenominator = this.denominator*f.denominator;
//        return new Fraction(resultNumerator, resultDenominator);
//    }

//    public Fraction divide (Fraction f){
//       int resultNumerator = this.numerator*f.denominator;
//       int resultDenominator = this.denominator*f.numerator;
//       return new Fraction(resultNumerator, resultDenominator);
//    }

    public String toString() {
        return numerator + "/" + denominator;
    }



}
