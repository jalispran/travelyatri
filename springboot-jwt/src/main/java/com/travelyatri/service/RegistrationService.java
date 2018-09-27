package com.travelyatri.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.travelyatri.exception.ClassMismatchException;
import com.travelyatri.util.Input;
import com.travelyatri.util.Output;

public interface RegistrationService {

	Output registerUser(Input input) throws AddressException, MessagingException, ClassMismatchException;

}
