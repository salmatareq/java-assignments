package models;

import interfaces.ISchedulable;
import interfaces.ISendable;
import interfaces.ITemplatable;
import interfaces.ITrackable;

import java.time.LocalDateTime;
import java.util.Map;

public class EmailNotifier implements ISchedulable, ISendable, ITemplatable, ITrackable {
    @Override
    public void schedule(String message, LocalDateTime datetime) {
        System.out.println("[EMAIL SCHEDULED for " + datetime + "] " + message);
    }

    @Override
    public void send(String message) {
        System.out.println( message);
    }

    @Override
    public void renderTemplate(String templateName, Map<String, String> vars) {

    }

    @Override
    public String getDeliveryStatus(String messageId) {


        return "Delivery status for " + messageId + ": DELIVERED";
    }
}
