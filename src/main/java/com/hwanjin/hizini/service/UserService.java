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
			userMapper.insertUser(userDTO);
		}
		return userMapper.selectUser(userDTO);
	}
	
	public UserDTO getUser(int id) {
		UserDTO user = new UserDTO(id);
		return userMapper.selectUser(user);
	}

	public UserDTO updateUser(UserDTO userDTO) {
		userMapper.updateUser(userDTO);
		return userMapper.selectUser(userDTO);
	}
}
