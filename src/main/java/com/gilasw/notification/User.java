package com.gilasw.notification;

import java.util.ArrayList;
import java.util.List;

import com.gilasw.dto.MessageDTO;
import com.gilasw.notification.channel.NotificationChannel;

public class User implements NotificationReceiver {

	private Integer Id;
	private String name;
	private String email;
	private String phone;
	private List<String> subscribed = new ArrayList<>();
	private List<NotificationChannel> channels = new ArrayList<>();
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public List<String> getSubscribed() {
		return subscribed;
	}

	public void setSubscribed(List<String> subscribed) {
		this.subscribed = subscribed;
	}

	public List<NotificationChannel> getChannels() {
		return channels;
	}

	public void setChannels(List<NotificationChannel> channels) {
		this.channels = channels;
	}
	
	public void addSubscribed(String category) {
		this.subscribed.add(category);
	}
	
	public void addChannel(NotificationChannel channel) {
		this.channels.add(channel);
	}
	
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
	}

	@Override
	public void processNotificationMessage(MessageDTO message) {
		if (subscribed.contains(message.getCategory())) {
			channels.forEach(channel ->  {
				channel.sendNotification(message.getMessage(), this);
				System.out.println("Notification of category "+message.getCategory()+" was sent to "+this.toString()+", type="+channel.getNotificationType());
			});
		}
	}
}
