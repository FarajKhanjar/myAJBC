package creationalPatterns.factory.simple;

import creationalPatterns.factory.simple.NotificationFactory.Channel;

public class Runner {
	public static void main(String[] args)
    {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification(Channel.SMS);
        notification.notifyUser();
    }
}
