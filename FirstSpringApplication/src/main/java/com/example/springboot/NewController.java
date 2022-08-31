package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.service.MessageProvider;

@RestController
public class NewController {
	@Autowired
	private MessageProvider messageProvider;

	public void setMessageProvider(com.example.springboot.service.MessageProvider messageProvider) {
		this.messageProvider=messageProvider;
	}

	@GetMapping("/")
	public String welcome() {
		return messageProvider.getMessage();
	}
}
