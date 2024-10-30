package com.ai_note_taker.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Social_User")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SocialUser {
	
    @Id
    private Long userId;

    @Column(nullable = false, length = 25)
    private String role  = "ROLE_USER";

    @Column(nullable = false, length = 50)
    private String provider;

    @Column(nullable = false, unique = true)
    private String providerId;

    @Column(nullable = false, unique = true)
    private String userName;

    @Column(updatable = false)
    private LocalDateTime createdDate;

    @Column
    private LocalDateTime modifiedDate;

    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private User user;
    
}