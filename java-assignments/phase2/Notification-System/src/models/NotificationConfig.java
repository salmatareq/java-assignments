package models;

import interfaces.ISendable;

import java.util.List;

public class NotificationConfig {
    private final List<ISendable> enabledNotifiers;

    public NotificationConfig(List<ISendable> enabledNotifiers) {
        this.enabledNotifiers = enabledNotifiers;
    }

    public List<ISendable> getEnabledNotifiers() {
        return enabledNotifiers;
    }
}
