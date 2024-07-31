package Exercise7;

public class FinancialForecasting {

    // Recursive method to predict future value
    public static double predictFutureValue(double currentValue, double growthRate, int years) {
        // Base case: if no years left to forecast, return current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive case: calculate future value
        return predictFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double currentValue = 1000.0;  // Starting value
        double growthRate = 0.05;  // 5% annual growth rate
        int years = 10;  // Forecast for 10 years

        double futureValue = predictFutureValue(currentValue, growthRate, years);
        System.out.println("Predicted future value: " + futureValue);
    }
}
