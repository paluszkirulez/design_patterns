package Strategy.Calculator.Behavior;

public class CalculationMinus implements CalculationMode {
    @Override
    public int calculate(int a, int b) {
        return a-b;
    }
}
