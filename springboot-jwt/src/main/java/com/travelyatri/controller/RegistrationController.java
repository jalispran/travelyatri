package com.travelyatri.controller;

import java.util.concurrent.ExecutionException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelyatri.exception.ClassMismatchException;
import com.travelyatri.service.RegistrationService;
import com.travelyatri.util.Input;
import com.travelyatri.util.Output;

@RestController
@RequestMapping(value="/register")
public class RegistrationController {
	
	@Autowired
	private RegistrationService registrationService;

	@PostMapping(value="/")
	@ResponseBody
	public ResponseEntity<?> registerUser(@RequestBody Input input) throws ExecutionException, AddressException, MessagingException, ClassMismatchException{
		Output out = registrationService.registerUser(input);
		return ResponseEntity.status(HttpStatus.OK).body(out);
	}
}
