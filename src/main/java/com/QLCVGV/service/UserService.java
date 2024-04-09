package com.QLCVGV.service;

import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.QLCVGV.entity.GiangVien;
import com.QLCVGV.entity.User;
import com.QLCVGV.web.dto.UserRegistrationDto;


public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

	UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
	
	List<User> getAllUser();
	void deleteUserId(User id);
	
}
