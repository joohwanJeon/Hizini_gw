package com.hwanjin.hizini.domain.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
	private int id;
	private String name;
	private String permission;
	private int quiz1;
	private int quiz2;
	private int quiz3;
	private int quiz4;
	private int quiz5;
	
	public UserDTO(int id) {
		super();
		this.id = id;
	}
}