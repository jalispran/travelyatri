package com.travelyatri.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.travelyatri.model.Device;

@Component
public interface DeviceRepository extends CrudRepository<Device, BigInteger>{
	Device findByImeiNumber(String imei);
}
