public class CreditCardStrategy implements IPaymentStrategy {

    @Override
    public boolean validate(PaymentDetails details) {

        String cardNumber = details.getMetadata().get("card");

        return cardNumber != null && cardNumber.length() == 16;
    }

    @Override
    public PaymentResult process(PaymentDetails details) {

        // call Stripe + 3DS simulation

        return new PaymentResult(
                true,
                "CC_TX_456",
                "Credit card payment successful"
        );
    }
}
