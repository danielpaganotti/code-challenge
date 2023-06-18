package com.gilasw.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilasw.dto.MessageDTO;
import com.gilasw.notification.NotificationReceiver;

@Service
public class NotificationService {
	
	@Autowired
	private NotificationReceiverService notificationReceiverService;
	
	public void processMessage(MessageDTO message) {
		List<NotificationReceiver> receivers = notificationReceiverService.getNotificationReceivers();
		receivers.forEach(receiver -> receiver.processNotificationMessage(message));
	}
}
