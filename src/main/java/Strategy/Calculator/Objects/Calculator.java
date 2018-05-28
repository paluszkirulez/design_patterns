package Strategy.Calculator.Objects;

import Strategy.Calculator.Behavior.CalculationMode;

public class Calculator implements CalculationMode {
    private int result = 0;
    @Override
    public int calculate(int a, int b) {
        return 0;
    }

    CalculationMode calculationMode;

    public Calculator(CalculationMode calculationMode){
        this.calculationMode = calculationMode;
    }

    public int doMath(int a, int b){
       return calculationMode.calculate(a,b);
    }
}
