package services;

import interfaces.ISchedulable;
import interfaces.ISendable;
import models.NotificationConfig;
import models.ScheduledNotification;

import java.time.LocalDateTime;
import java.util.*;

public class NotificationService {

    private List<ISendable> notifiers;
    private NotificationConfig config;
    private Queue<ScheduledNotification> queue = new LinkedList<>();

    public NotificationService(  NotificationConfig config) {
        this.notifiers = config.getEnabledNotifiers();
    }

    public void sendPasswordReset(String userName, String resetLink) {

        String  message = "Reset your password: " + resetLink;


            for (ISendable notifier : notifiers) {
                notifier.send(message);
            }

        }
    public void scheduleNotification(String message, LocalDateTime dateTime,  List<ISchedulable> notifiers) {
        for (ISchedulable notifier : notifiers) {
            queue.add(new ScheduledNotification(notifier,message, dateTime ));
        }
    }

    public void processPending() {

        LocalDateTime now = LocalDateTime.now();

        Queue<ScheduledNotification> it = new LinkedList<>();

        while (!queue.isEmpty()) {
            ScheduledNotification sm = queue.poll();
            if (!sm.getScheduledTime().isAfter(now)) {

                sm.getNotifier().schedule(sm.getMessage(), sm.getScheduledTime());
            } else {

               it.add(sm);
            }
        }
      queue.addAll(it);
    }
}
