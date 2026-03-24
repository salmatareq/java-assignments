package models;

import interfaces.ISchedulable;

import java.time.LocalDateTime;

public class ScheduledNotification {

    public ISchedulable notifier;
    public String message;
    public LocalDateTime scheduledTime;

    public ScheduledNotification(ISchedulable notifier, String message, LocalDateTime scheduledTime) {
        this.notifier = notifier;
        this.message = message;
        this.scheduledTime = scheduledTime;
    }
    public String getMessage() { return message; }
    public LocalDateTime getScheduledTime() { return scheduledTime; }
    public ISchedulable getNotifier() { return notifier; }
}
