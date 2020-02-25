public class Main2 {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int creditAmount = 1_000_000; // Сумма кредита;
        double yearPercent = 9.99; // Годовой процент;
        int maturity = 24; // Срок выплаты кредита;
        double monthlyPayment = service.calculate(creditAmount, yearPercent, maturity);
        System.out.println(monthlyPayment);
    }
}