import fraction.Fraction;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(3, 2);

        System.out.println("Substract " + fraction2.toString() + " from " + fraction1.toString() + " = "
                + fraction1.substractFraction(fraction2).toString());

        System.out.println("Multyply " + fraction1.toString() + " on " + fraction2.toString() + " = "
                + fraction1.multiplyOn(fraction2).toString());

        System.out.println("Divide " + fraction1.toString() + " on " + fraction2.toString() + " = "
                + fraction1.divideOn(fraction2).toString());
    }
}
