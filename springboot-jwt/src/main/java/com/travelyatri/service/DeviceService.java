package com.travelyatri.service;

import java.util.concurrent.ExecutionException;

import com.travelyatri.util.Input;
import com.travelyatri.util.Output;

public interface DeviceService {

	Output registerDevice(Input input) throws ExecutionException;

}
