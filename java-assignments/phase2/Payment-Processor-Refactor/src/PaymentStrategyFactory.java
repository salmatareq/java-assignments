public class PaymentStrategyFactory {
    public static IPaymentStrategy getStrategy(String type) {

        switch (type) {

            case "PAYPAL":
                return new PaypalStrategy();

            case "CREDIT_CARD":
                return new CreditCardStrategy();

            case "CRYPTO":
                return new CryptoStrategy();

            case "APPLE_PAY":
                return new ApplePayStrategy();

            default:
                throw new IllegalArgumentException("Unsupported payment type");
        }
    }
}
