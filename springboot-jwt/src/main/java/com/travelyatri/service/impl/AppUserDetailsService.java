package com.travelyatri.service.impl;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.google.common.hash.Hashing;
import com.travelyatri.model.Password;
import com.travelyatri.model.User;
import com.travelyatri.model.UserRole;
import com.travelyatri.repository.PasswordRepository;
import com.travelyatri.repository.UserRepository;
import com.travelyatri.repository.UserRoleRepository;

/**
 * Created by nydiarra on 06/05/17.
 */
@Component
public class AppUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserRoleRepository roleRepository;
    
    @Autowired
    private PasswordRepository passwordRepository;
    
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(s);

        if(user == null) {
            throw new UsernameNotFoundException(String.format("The username %s doesn't exist", s));
        }
        
        System.out.println(user);
        
        BigInteger userId = user.getUserId();
        List<UserRole> roles = roleRepository.findByUserId(userId);
        
        List<GrantedAuthority> authorities = new ArrayList<>();
       roles.forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getRoleCode()));
        });
       
       String userIdEncryp = Hashing.sha256().hashString(String.valueOf(userId),StandardCharsets.UTF_8).toString();
       System.out.println(userIdEncryp);
       Password pass = passwordRepository.findByUserIdEncryp(userIdEncryp);
       
       System.out.println(pass);
       
       UserDetails userDetails = new org.springframework.security.core.userdetails.
                User(user.getUsername(), pass.getPassEncryp(), authorities);

        return userDetails;
    }
}
