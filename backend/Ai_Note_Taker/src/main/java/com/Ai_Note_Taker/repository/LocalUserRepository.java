package com.ai_note_taker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ai_note_taker.entity.LocalUser;

public interface LocalUserRepository extends JpaRepository <LocalUser, Long> {

}
