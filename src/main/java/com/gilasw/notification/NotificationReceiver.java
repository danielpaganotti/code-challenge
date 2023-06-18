package com.gilasw.notification;

import com.gilasw.dto.MessageDTO;

public interface NotificationReceiver {

	Integer getId();
	
	String getEmail();
	
	String getPhone();
	
	void processNotificationMessage(MessageDTO message);
}
