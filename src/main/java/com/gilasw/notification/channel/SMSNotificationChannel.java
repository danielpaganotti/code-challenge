package com.gilasw.notification.channel;

import com.gilasw.notification.NotificationReceiver;

public class SMSNotificationChannel implements NotificationChannel {

	@Override
	public void sendNotification(String message, NotificationReceiver receiver) {
		System.out.println(String.format(
				"Sending %s notification for %s, at %s", getNotificationType(), receiver.getPhone(), getNotificationDateTime()));

	}

	@Override
	public String getNotificationType() {
		return "SMS";
	}

}
