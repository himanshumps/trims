package citi.com.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import citi.com.utils.MessageRepository;


	@RestController
	public class MessageController {
	    @Autowired
	    MessageRepository itemRepo;
	    }
