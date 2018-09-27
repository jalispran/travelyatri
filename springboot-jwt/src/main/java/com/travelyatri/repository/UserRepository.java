package com.travelyatri.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.travelyatri.model.User;

/**
 * Created by nydiarra on 06/05/17.
 */
@Component
public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
