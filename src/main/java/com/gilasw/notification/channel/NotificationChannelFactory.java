package com.gilasw.notification.channel;

import org.springframework.stereotype.Component;

import com.gilasw.enums.NotificationChannelType;

@Component
public class NotificationChannelFactory {

	public NotificationChannel buildChannel(NotificationChannelType type) {
		switch (type) {
		case EMAIL:
			return new EmailNotificationChannel();
		case PUSH:
			return new PushNotificationChannel();
		case SMS:
			return new SMSNotificationChannel();
		default:
			throw new UnsupportedOperationException();
		
		}
	}
}
