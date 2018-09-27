package com.travelyatri.repository;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;

import com.travelyatri.model.CodeList;

public interface CodeListRepository extends CrudRepository<CodeList, BigInteger>{

}
