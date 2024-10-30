package com.ai_note_taker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ai_note_taker.entity.SocialUser;

public interface SocialUserRepository extends JpaRepository <SocialUser, Long> {

}
