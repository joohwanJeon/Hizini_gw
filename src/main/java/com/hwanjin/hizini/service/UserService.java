package com.hwanjin.hizini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwanjin.hizini.domain.dao.UserMapper;
import com.hwanjin.hizini.domain.dto.UserDTO;

@Service
public class UserService {

	@Autowired 
	private UserMapper userMapper;
		
	public UserDTO setUser(UserDTO userDTO) {
		UserDTO user = userMapper.selectUser(userDTO);
		if(user == null) {
			userMapper.insertUser(userDTO.getName());
			System.out.println(userDTO.getId());
		}
		
		return userMapper.selectUser(userDTO);
		
	}

	public int updateUser(UserDTO userDTO) {
		return userMapper.updateUser(userDTO);
	}
}
