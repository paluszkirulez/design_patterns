package Strategy.Calculator.Behavior;

public class CalculationAdd implements CalculationMode {
    @Override
    public int calculate(int a, int b) {
        return a+b;
    }
}
