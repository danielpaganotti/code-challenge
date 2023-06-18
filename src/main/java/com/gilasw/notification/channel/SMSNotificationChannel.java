package com.gilasw.notification.channel;

import com.gilasw.notification.NotificationReceiver;

public class SMSNotificationChannel implements NotificationChannel {

	@Override
	public void sendNotification(String message, NotificationReceiver receiver) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getNotificationType() {
		return "SMS";
	}

}
