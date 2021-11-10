public class CreditCalcService {
    int calculate(int sum, int period, double loanRate) {
        double monthRate = loanRate / (100 * 12.0);
        double result = sum * (monthRate / (1 - Math.pow(1 + monthRate, -period)));
        return (int) result;
    }
}
