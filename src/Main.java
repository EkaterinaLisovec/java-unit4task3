public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int summ = 1_000_000;
        int time1 = 12;
        int time2 = 24;
        int time3 = 36;
        float percent = 0.0999F;
        int payment = 0;

        System.out.println("Срок кредита 1 год. Ежемесячный платеж = "
                + (payment = service.calculate(summ, time1, percent)));
        System.out.println("Срок кредита 2 года. Ежемесячный платеж = "
                + (payment = service.calculate(summ, time2, percent)));
        System.out.println("Срок кредита 3 года. Ежемесячный платеж = "
                + (payment = service.calculate(summ, time3, percent)));
    }
}
