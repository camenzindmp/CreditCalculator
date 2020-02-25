public class CreditPaymentService {
    public double calculate(int creditAmount, double yearPercent, int maturity) {
        double monthPercent = yearPercent / 100 / 12; // Расчет ежемесячной процентной ставки;
        double monthPercent2 = monthPercent + 1; // Ежемесячный процент+1 (необходимо для формулы);
        double monthPercent3 = Math.pow(monthPercent2, maturity); // Возведение в степень ежемес. процента+1 (нужно для формулы);
        double monthlyPayment = creditAmount * (monthPercent + (monthPercent / (monthPercent3 - 1))); // Формула расчета ежемесячного платежа;
        return monthlyPayment;
    }
}
