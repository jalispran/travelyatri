package com.travelyatri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelyatri.repository.UserRepository;

/**
 * Created by nydiarra on 06/05/17.
 */
@RestController
@RequestMapping
public class ResourceController {
	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value ="/codelist", method = RequestMethod.GET)
//    @PreAuthorize("hasAuthority('ADMIN_USER')")
	@ResponseBody
	public ResponseEntity<?> getCodes(){
		return ResponseEntity.status(HttpStatus.OK).body(userRepository.findAll());
	}

	@RequestMapping(value ="/", method = RequestMethod.GET)
	@ResponseBody
	public ResponseEntity<?> getodes(){
		return ResponseEntity.status(HttpStatus.OK).body("Hello World");
	}
}
