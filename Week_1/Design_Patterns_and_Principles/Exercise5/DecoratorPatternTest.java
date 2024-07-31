package Exercise5;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        // Create an EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Wrap the EmailNotifier with SMSNotifierDecorator
        Notifier smsAndEmailNotifier = new SMSNotifierDecorator(emailNotifier);

        // Wrap the SMS and Email Notifier with SlackNotifierDecorator
        Notifier allNotifier = new SlackNotifierDecorator(smsAndEmailNotifier);

        // Send notifications via all channels
        allNotifier.send("Hello, this is a test message!");
    }
}

