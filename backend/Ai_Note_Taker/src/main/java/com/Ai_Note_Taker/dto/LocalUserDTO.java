package com.Ai_Note_Taker.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocalUserDTO {

	private int userId;
	private String role;
	private String password;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
}
