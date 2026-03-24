package models;

import interfaces.ISendable;
import interfaces.ITrackable;

public class SmsNotifier implements ISendable, ITrackable {

    @Override
    public void send(String message) {
        System.out.println( message);
    }

    @Override
    public String getDeliveryStatus(String messageId) {
        return "Delivery status for " + messageId + ": DELIVERED";
    }
}
