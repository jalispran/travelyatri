package com.travelyatri.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.travelyatri.model.UserRole;

public interface UserRoleRepository extends CrudRepository<UserRole, BigInteger>{
	List<UserRole> findByUserId(BigInteger userId);
}
