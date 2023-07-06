public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println(calc.mult(2, 5));
        System.out.println(calc.sum(2, 5));
        System.out.println(calc.pow(2, 5));
        System.out.println(calc.sub(2, 5));
        System.out.println(calc.div(2, 5));
    }
}