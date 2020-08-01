public class CreditPaymentService {
    public int calculate(int summ, int time, float percent) {
        double monthPercent = percent / 12;
        double annuitet =
                (monthPercent * Math.pow((1 + monthPercent), time))
                        / ((Math.pow((1 + monthPercent), time)) - 1);
        double payment = (int) summ * annuitet;
        return (int) payment;
    }
}
