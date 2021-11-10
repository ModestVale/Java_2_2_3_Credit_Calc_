public class Main {
    public static void main(String[] args) {
        CreditCalcService service = new CreditCalcService();
        int monthRate = service.calculate(1_000_000, 12, 9.99);
        System.out.println(monthRate);
        monthRate = service.calculate(1_000_000, 24, 9.99);
        System.out.println(monthRate);
        monthRate = service.calculate(1_000_000, 36, 9.99);
        System.out.println(monthRate);
    }
}
