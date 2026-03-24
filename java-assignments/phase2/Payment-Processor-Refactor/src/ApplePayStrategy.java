public class ApplePayStrategy implements  IPaymentStrategy{
    @Override
    public boolean validate(PaymentDetails details) {
        String deviceAccount = details.getMetadata().get("deviceAccount");
        return deviceAccount != null;
    }

    @Override
    public PaymentResult process(PaymentDetails details) {

        return new PaymentResult(
                true,
                "APPLE_TX_001",
                "Apple Pay payment successful"
        );
    }
}
