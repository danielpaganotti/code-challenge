package com.gilasw.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gilasw.enums.NotificationChannelType;
import com.gilasw.notification.NotificationReceiver;
import com.gilasw.notification.User;
import com.gilasw.notification.channel.NotificationChannelFactory;

@Service
public class NotificationReceiverService {
	
	@Autowired
	private NotificationChannelFactory channelFactory;

	public List<NotificationReceiver> getNotificationReceivers() {
		return generateMockedUsers();
	} 
	
	public List<NotificationReceiver> generateMockedUsers(){
		User user1 = createUser(1, "Daniel", "daniel@domain.com", "1949574389");
		User user2 = createUser(2, "Maria", "maria@domain.com", "38745603465345");
		User user3 = createUser(3, "Isabel", "isabel@domain.com", "7485645");
		User user4 = createUser(4, "John", "john@domain.com", "123445");
		
		user1.addSubscribed("Sports");
		user1.addSubscribed("Films");
		user1.addChannel(channelFactory.buildChannel(NotificationChannelType.SMS));
		user1.addChannel(channelFactory.buildChannel(NotificationChannelType.EMAIL));
		
		user2.addSubscribed("Sports");
		user2.addSubscribed("Films");
		user2.addSubscribed("Finance");
		user2.addChannel(channelFactory.buildChannel(NotificationChannelType.SMS));
		user2.addChannel(channelFactory.buildChannel(NotificationChannelType.EMAIL));
		user2.addChannel(channelFactory.buildChannel(NotificationChannelType.PUSH));
		
		
		user3.addSubscribed("Sports");
		user3.addChannel(channelFactory.buildChannel(NotificationChannelType.EMAIL));
		
		return List.of(user1, user2, user3, user4);
	}
	
	private User createUser(Integer id, String name, String email, String phone) {
		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPhone(phone);
		return user;
	}
}
