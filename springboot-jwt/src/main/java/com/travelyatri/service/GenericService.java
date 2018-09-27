package com.travelyatri.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import com.travelyatri.app.codes.Travelyatri.EmailContext;

/**
 * Created by nydiarra on 06/05/17.
 */
public interface GenericService {

	void sendEmail(String emailId, EmailContext emailContext) throws AddressException, MessagingException;

}
