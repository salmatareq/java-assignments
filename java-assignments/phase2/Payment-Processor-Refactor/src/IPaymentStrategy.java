public interface IPaymentStrategy {

    boolean validate(PaymentDetails details);
    PaymentResult process(PaymentDetails details);


}
