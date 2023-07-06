public class IntsCalculator implements Ints {
    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula calculator = target.newFormula();
        calculator.a = Double.valueOf(arg0);
        calculator.b = Double.valueOf(arg1);
        calculator.calculate(Calculator.Operation.SUM);
        return (int) calculator.result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula calculator = target.newFormula();
        calculator.a = Double.valueOf(arg0);
        calculator.b = Double.valueOf(arg1);
        calculator.calculate(Calculator.Operation.MULT);
        return (int) calculator.result();
    }

    @Override
    public int pow(int a, int b) {
        //считаем через target
        Calculator.Formula calculator = target.newFormula();
        calculator.a = Double.valueOf(a);
        calculator.b = Double.valueOf(b);
        calculator.calculate(Calculator.Operation.POW);
        return (int) calculator.result();
    }

    @Override
    public int sub(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula calculator = target.newFormula();
        calculator.a = Double.valueOf(arg0);
        calculator.b = Double.valueOf(arg1);
        calculator.calculate(Calculator.Operation.SUB);
        return (int) calculator.result();
    }

    @Override
    public double div(int arg0, int arg1) {
        //считаем через target
        Calculator.Formula calculator = target.newFormula();
        calculator.a = Double.valueOf(arg0);
        calculator.b = Double.valueOf(arg1);
        calculator.calculate(Calculator.Operation.DIV);
        return calculator.result();
    }
}