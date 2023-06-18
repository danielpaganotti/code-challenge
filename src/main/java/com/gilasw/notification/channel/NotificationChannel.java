package com.gilasw.notification.channel;

import com.gilasw.notification.NotificationReceiver;

public interface NotificationChannel {

	public void sendNotification(String message, NotificationReceiver receiver);
	
	public String getNotificationType();
}
