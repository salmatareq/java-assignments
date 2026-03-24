import java.time.LocalDateTime;

public class PaymentResult {


    private boolean success;
    private String transactionId;
    private String message;
    private LocalDateTime timestamp;

    public PaymentResult(boolean success, String transactionId, String message) {
        this.success = success;
        this.transactionId = transactionId;
        this.message = message;
        this.timestamp = LocalDateTime.now();
    }

}
