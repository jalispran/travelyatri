package com.travelyatri.controller;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travelyatri.service.DeviceService;
import com.travelyatri.util.Input;
import com.travelyatri.util.Output;

@RestController
@RequestMapping(value = "/device")
public class DeviceController {
	
	@Autowired
	private DeviceService deviceService;
	
	@PostMapping
	@ResponseBody
	public ResponseEntity<?> registerDevice(@RequestBody Input input) throws ExecutionException{
	
		
		Output out = deviceService.registerDevice(input);
		
		System.out.println(out.isSuccess());
		
		if(out.isSuccess())
			return ResponseEntity.status(HttpStatus.OK).body(out);
		return ResponseEntity.status(HttpStatus.UNPROCESSABLE_ENTITY).body(out);
	}
}
