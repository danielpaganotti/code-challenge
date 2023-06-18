package com.gilasw.notification.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gilasw.notification.NotificationReceiver;
import com.gilasw.notification.User;
import com.gilasw.notification.channel.EmailNotificationChannel;
import com.gilasw.notification.channel.PushNotificationChannel;
import com.gilasw.notification.channel.SMSNotificationChannel;

@Service
public class NotificationReceiverService {

	public List<NotificationReceiver> getNotificationReceivers() {
		User user1 = generateMockedUsers(1, "Daniel", "daniel@domain.com", "1949574389");
		User user2 = generateMockedUsers(2, "Maria", "maria@domain.com", "38745603465345");
		User user3 = generateMockedUsers(3, "Isabel", "isabel@domain.com", "7485645");
		User user4 = generateMockedUsers(4, "John", "john@domain.com", "123445");
		
		user1.addSubscribed("Sports");
		user1.addSubscribed("Films");
		user1.addChannel(new SMSNotificationChannel());
		user1.addChannel(new EmailNotificationChannel());
		
		user2.addSubscribed("Sports");
		user2.addSubscribed("Films");
		user2.addSubscribed("Finance");
		user2.addChannel(new SMSNotificationChannel());
		user2.addChannel(new EmailNotificationChannel());
		user2.addChannel(new PushNotificationChannel());
		
		
		user3.addSubscribed("Sports");
		user3.addChannel(new EmailNotificationChannel());
		
		return List.of(user1, user2, user3, user4);
	} 
	
	private User generateMockedUsers(Integer id, String name, String email, String phone) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		return user;
	}
}
