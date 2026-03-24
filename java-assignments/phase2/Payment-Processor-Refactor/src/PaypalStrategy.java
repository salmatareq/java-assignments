public class PaypalStrategy implements IPaymentStrategy {

    @Override
    public boolean validate(PaymentDetails details) {
        String email = details.getMetadata().get("email");
        return email != null && email.contains("@");
    }

    @Override
    public PaymentResult process(PaymentDetails details) {



        return new PaymentResult(
                true,
                "PAYPAL_TX_123",
                "Payment processed via PayPal"
        );
    }
}
