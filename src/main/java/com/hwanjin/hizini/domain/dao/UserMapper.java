package com.hwanjin.hizini.domain.dao;

import java.util.List;

import com.hwanjin.hizini.domain.dto.UserDTO;

public interface UserMapper {
	
	public UserDTO selectUser(UserDTO userDTO);
	
	public int insertUser(UserDTO userDTO);
	
	public int updateUser(UserDTO userDTO);
}
