package models;

import interfaces.ISendable;
import interfaces.ITemplatable;

import java.util.Map;

public class SlackNotifier implements ISendable, ITemplatable {
    @Override
    public void send(String message) {
        System.out.println( message);
    }

    @Override
    public void renderTemplate(String templateName, Map<String, String> vars) {

    }
}
