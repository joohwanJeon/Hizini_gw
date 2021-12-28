package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.UserDTO;

public interface UserMapper {
	
	public UserDTO selectUser(UserDTO userDTO);
	
	public int insertUser(String name);
	
	public int updateUser(UserDTO userDTO);
}
