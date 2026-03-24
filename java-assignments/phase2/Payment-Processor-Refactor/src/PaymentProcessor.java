public class PaymentProcessor {
    private IPaymentStrategy strategy;

    public PaymentProcessor(IPaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public PaymentResult process(PaymentDetails details) {

        if (!strategy.validate(details)) {
            throw new IllegalArgumentException("Invalid payment details");
        }

        return strategy.process(details);
    }
}
