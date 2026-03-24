public class CryptoStrategy implements IPaymentStrategy {

    @Override
    public boolean validate(PaymentDetails details) {

        String wallet = details.getMetadata().get("wallet");

        return wallet != null && wallet.length() > 10;
    }

    @Override
    public PaymentResult process(PaymentDetails details) {

        // broadcast transaction

        return new PaymentResult(
                true,
                "CRYPTO_TX_789",
                "Crypto payment confirmed"
        );
    }
}
