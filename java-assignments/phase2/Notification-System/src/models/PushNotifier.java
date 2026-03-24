package models;

import interfaces.ISchedulable;
import interfaces.ISendable;

import java.time.LocalDateTime;

public class PushNotifier implements ISendable, ISchedulable {
    @Override
    public void schedule(String message, LocalDateTime datetime) {
        System.out.println("[SCHEDULED for " + datetime + "] " + message);
    }

    @Override
    public void send(String message) {
        System.out.println( message);
    }
}
