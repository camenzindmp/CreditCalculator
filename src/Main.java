public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double monthlyPayment12 = service.calculate(1_000_000, 9.99, 12);
        int resultFor12 = (int)monthlyPayment12;
        System.out.println("Ежемесячный платеж " + resultFor12);

        double monthlyPayment24 = service.calculate(1_000_000, 9.99, 24);
        int resultFor24 = (int)monthlyPayment24;
        System.out.println("Ежемесячный платеж " + resultFor24);

        double monthlyPayment36 = service.calculate(1_000_000, 9.99, 36);
        int resultFor36 = (int)monthlyPayment36;
        System.out.println("Ежемесячный платеж " + resultFor36);
    }
}