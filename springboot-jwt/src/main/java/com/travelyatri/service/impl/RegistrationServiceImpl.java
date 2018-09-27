package com.travelyatri.service.impl;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.google.common.cache.LoadingCache;
import com.google.common.hash.Hashing;
import com.travelyatri.app.codes.Travelyatri;
import com.travelyatri.app.codes.TravelyatriResponseCode;
import com.travelyatri.exception.ClassMismatchException;
import com.travelyatri.model.IndividualUser;
import com.travelyatri.model.Password;
import com.travelyatri.model.User;
import com.travelyatri.model.UserRole;
import com.travelyatri.repository.IndividualUserRepository;
import com.travelyatri.repository.PasswordRepository;
import com.travelyatri.repository.UserRepository;
import com.travelyatri.repository.UserRoleRepository;
import com.travelyatri.service.GenericService;
import com.travelyatri.service.RegistrationService;
import com.travelyatri.util.GuavaCache;
import com.travelyatri.util.Input;
import com.travelyatri.util.Merge;
import com.travelyatri.util.Output;
import com.travelyatri.util.SessionData;

@Service
public class RegistrationServiceImpl implements RegistrationService {
	private static LoadingCache<String, String> cache = GuavaCache.getCache();

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private IndividualUserRepository individualRepository;
	
	@Autowired
	private PasswordRepository passwordRepository;
	
	@Autowired
	private UserRoleRepository roleRepository;
	
	@Autowired
	private GenericService genericService;
	
	@Override
	public Output registerUser(Input input) throws AddressException, MessagingException, ClassMismatchException{
		SessionData sData = input.getsData();
		Output out = new Output(sData);
		BigInteger deviceId = input.getDeviceId();
		String receivedToken = input.getState();
		Assert.notNull(receivedToken, "empty token");

//		check state token
		System.out.println("deviceID : " + deviceId);
		String sentToken = cache.getIfPresent(deviceId);
		System.out.println(sentToken);
//		Assert.notNull(sentToken, "device registration pending");

//		if(!receivedToken.equals(sentToken)) {
//			out.setMessage("token mismatch | timeout");
//			return out;
//		}
		
//		save user
		User oldUser = userRepository.findByUsername(input.getMobileNumber());
		System.out.println("oldUser : " + oldUser);
		User newUser = extractUserInfo(input);
		System.out.println("newUser : " + newUser);
		newUser = (User) Merge.objects(oldUser, newUser);
		System.out.println("mergedUser : " + newUser);
		userRepository.save(newUser);
		
		BigInteger userId = newUser.getUserId();

//		save individual
		IndividualUser individual = extractIndividual(input);
		individual.setUserId(userId);
		individualRepository.save(individual);
		
//		save password
		Password passObj = new Password();
		String userIdEncryp = Hashing.sha256().hashString(String.valueOf(userId),StandardCharsets.UTF_8).toString();
		String passEncryp = Hashing.sha256().hashString(String.valueOf(input.getPassword()),StandardCharsets.UTF_8).toString();
		passObj.setUserIdEncryp(userIdEncryp);
		passObj.setPassEncryp(passEncryp);
		passwordRepository.save(passObj);
		
//		save role of user 
		UserRole role = new UserRole();
		role.setUserId(userId);
		role.setRoleCode(Travelyatri.RoleCode.INDIVIDUAL_USER);
		roleRepository.save(role);
		
//		send email
		genericService.sendEmail(input.getEmailId(), Travelyatri.EmailContext.WELCOME_EMAIL);
		
		out.setResponseCode(TravelyatriResponseCode.OK);
		return out;
	}
	
	private User extractUserInfo(Input input) {
		User user = new User();
		
		user.setUsername(input.getMobileNumber());
		user.setCountryCode(input.getCountryCode());
		user.setLanguageCode(input.getLanguageCode());
		user.setEmailId(input.getEmailId());
		user.setUserType(Travelyatri.UserType.INDIVIDUAL);
		user.setName(getName(input));
		
		return user;
	}
	
	private String getName(Input input) {
		return input.getTitle() + " " +
				input.getFirstName() + " " +
				input.getMiddleName() + " " +
				input.getLastName();
	}
	
	private IndividualUser extractIndividual(Input input) {
		IndividualUser individual = new IndividualUser();
		
		individual.setCurrentLat(input.getsData().getCurrentLat());
		individual.setCurrentLong(input.getsData().getCurrentLong());
		individual.setDateOfBirth(input.getDob());
		individual.setDeviceID(input.getDeviceId());
		individual.setTitle(input.getTitle());
		individual.setFirstName(input.getFirstName());
		individual.setMiddleName(input.getMiddleName());
		individual.setLastName(input.getLastName());
		individual.setGender(input.getGender());
		individual.setOccupation(input.getOccupation());
		individual.setSalarySlab(input.getSalarySlab());
		
		return individual;
		
	}
}
