import java.util.Map;

public class PaymentDetails {

    double amount;
    String currency;
    Map<String,String> metadata;
    public PaymentDetails(double amount, String currency, Map<String, String> metadata) {
        this.amount = amount;
        this.currency = currency;
        this.metadata = metadata;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

}
