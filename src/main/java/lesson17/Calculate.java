package lesson17;

public class Calculate implements Increase, Decrease {

    public double toCalculate(double a, double b, String c){
        double result = 0;
        switch (c) {
            case "+":
                result = findAddition(a, b);
                break;
            case "-":
                result = findSubtraction(a, b);
                break;
            case "*":
                result = findMultiplication(a, b);
                break;
            case "/":
                result = findDivision(a, b);
                break;
            default:
                System.out.println("Неизвестный оператор");
        }
        return result;
    }
    public void printResult(double a){
        System.out.println(a);
    }


    @Override
    public double findSubtraction(double a, double b) {
        return a - b;
    }

    @Override
    public double findDivision(double a, double b) {
        return a / b;
    }

    @Override
    public double findAddition(double a, double b) {
        return a + b;
    }

    @Override
    public double findMultiplication(double a, double b) {
        return a * b;
    }
}
