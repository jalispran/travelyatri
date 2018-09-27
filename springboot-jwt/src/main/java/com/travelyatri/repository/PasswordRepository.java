package com.travelyatri.repository;

import org.springframework.data.repository.CrudRepository;

import com.travelyatri.model.Password;

public interface PasswordRepository extends CrudRepository<Password, String>{
	Password findByUserIdEncryp(String userIdEncryp);
}
