package com.gilasw.notification.channel;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.gilasw.notification.NotificationReceiver;

public interface NotificationChannel {

	public void sendNotification(String message, NotificationReceiver receiver);
	
	public String getNotificationType();
	
	public default String getNotificationDateTime() {
		return LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME);
	}
}
