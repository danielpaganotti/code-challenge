package com.gilasw.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gilasw.dto.MessageDTO;
import com.gilasw.notification.service.NotificationService;

@RestController
public class MessageController {
	
	@Autowired
	private NotificationService notificationService; 

	@PostMapping("/message")
	public void processMessage(@Valid @RequestBody MessageDTO message) {
		notificationService.processMessage(message);
	}
}
