package com.travelyatri.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.travelyatri.model.IndividualUser;

public interface IndividualUserRepository extends CrudRepository<IndividualUser, BigInteger> {

}
