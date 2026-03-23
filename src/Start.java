public class Start {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 5);
        Fraction f3 = new Fraction(7, 8);

        System.out.println(f1.toString()); // prints "5/8"
        System.out.println(f2.toString()); // prints "3/4"
        System.out.println(f3.toString()); // prints "1/3"

        Fraction f4 = f1.sum(f2).sum(f3).minus(5);
        System.out.println(f4.toString());
    }  // end of main method
}  // end of Start class
