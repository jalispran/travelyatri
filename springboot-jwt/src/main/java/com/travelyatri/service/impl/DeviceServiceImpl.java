package com.travelyatri.service.impl;

import java.util.concurrent.ExecutionException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.common.cache.LoadingCache;
import com.travelyatri.app.codes.TravelyatriResponseCode;
import com.travelyatri.model.Device;
import com.travelyatri.repository.DeviceRepository;
import com.travelyatri.service.DeviceService;
import com.travelyatri.util.GuavaCache;
import com.travelyatri.util.Input;
import com.travelyatri.util.Output;

@Service
public class DeviceServiceImpl implements DeviceService{
	LoadingCache<String, String> cache = GuavaCache.getCache();
	
	@Autowired
	private DeviceRepository deviceRepository;
	
	@Override
	@Transactional
	public Output registerDevice(Input input) throws ExecutionException {
		Output out = new Output(input.getsData());
		Device device = input.getDevice();
		String imeiNumber = device.getImeiNumber();
		
		Device dvc = deviceRepository.findByImeiNumber(imeiNumber);
		if(dvc != null)  
			device = dvc;
		else deviceRepository.save(device);

		String deviceId = String.valueOf(device.getDeviceId());
		System.out.println("deviceID : " + deviceId);
		String state = cache.getIfPresent(deviceId);
		if(state == null)
			state = cache.get(deviceId);
		
		out.setData("deviceId", deviceId);
		out.setData("state", state);
		
		System.out.println(TravelyatriResponseCode.OK.getCode());
		
		out.setResponseCode(TravelyatriResponseCode.OK);
		
		return out;
	}
}
