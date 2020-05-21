package edu.ti.caih313.collections.lambda;
//Add some operations to the calculator
//Add integer divide and multiply
//Add double operations: add, subtract, multiply, divide
//Add unary operations for double: absolute value, inverse
public class Calculator {

    public static void main(String... args) {

        Calculator myApp = new Calculator();
        IntegerMath addition = (a, b) -> a + b;
        IntegerMath subtraction = (a, b) -> a - b;
        IntegerMath multiplication = (a, b) -> a * b;
        IntegerMath division = (a, b) -> a/b;

        DoubleMath doubleAddition = (a, b) -> a + b;
        DoubleMath doubleSubtraction = (a, b) -> a - b;
        DoubleMath doubleMultiplication = (a, b) -> a * b;
        DoubleMath doubleDivision = (a, b) -> a / b;

        System.out.println("40 + 2 = " +
            myApp.operateBinary(40, 2, (IntegerMath) addition));
        System.out.println("20 - 10 = " +
            myApp.operateBinary(20, 10, (IntegerMath) subtraction));
        System.out.println("40 * 2 = " +
                myApp.operateBinary(40, 2, (IntegerMath) multiplication));
        System.out.println("40 / 2 = " +
                myApp.operateBinary(40, 2, (IntegerMath) division));

        System.out.println("40 + 2 = " +
                myApp.operateBinary(40.00, 2.00, (DoubleMath) doubleAddition));
        System.out.println("20 - 10 = " +
                myApp.operateBinary(20.00, 10.00, (DoubleMath) doubleSubtraction));
        System.out.println("40 * 2 = " +
                myApp.operateBinary(40.45, 2.67, (DoubleMath) doubleMultiplication));
        System.out.println("40 / 2 = " +
                myApp.operateBinary(40.78, 2.54, (DoubleMath) doubleDivision));
    }

    private double operateBinary(double a, double b, DoubleMath doubleMath) {
        return doubleMath.DOperation(a, b);
    }
    private int operateBinary(int a, int b, IntegerMath integerMath) {
        return integerMath.operation(a, b);
    }

}
