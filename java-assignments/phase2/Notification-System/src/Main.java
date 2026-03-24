import interfaces.ISchedulable;
import interfaces.ISendable;
import models.*;
import services.NotificationService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {



        EmailNotifier email = new EmailNotifier();
        SmsNotifier sms = new SmsNotifier();
        PushNotifier push = new PushNotifier();
        SlackNotifier slack = new SlackNotifier();


        List<ISendable> notifiers = Arrays.asList(
                email,
sms

        );


        NotificationConfig config = new NotificationConfig(notifiers);


        NotificationService service = new NotificationService(  config);

        String userName = "Salma";
        String resetLink = "https:...";
        service . sendPasswordReset(userName,resetLink);
        service.scheduleNotification(
                "Your password reset link expires in 10 minutes",
                LocalDateTime.now().plusHours(1),
                List.of(email, push)
        );




}
