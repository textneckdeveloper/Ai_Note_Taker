package com.ai_note_taker.dto;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialUserDTO {
	
	private Long userId;
	private String role;
	private String provider;
	private String provider_id;
	private String userName;
	private LocalDateTime createdDate;
	private LocalDateTime modifiedDate;
	
}
