package com.ai_note_taker.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Local_User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LocalUser {
	
	@Id
	private Long userId;
	
	@Column(nullable = false, length = 25)
	private String role = "ROLE_USER";
	
	@Column(nullable = false)
	private String password;
	
	@Column(updatable = false)
	private LocalDateTime createdDate;
	
	@Column
	private LocalDateTime modifiedDate;
	
	@OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;

}