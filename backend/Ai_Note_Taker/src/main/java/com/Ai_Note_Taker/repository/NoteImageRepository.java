package com.ai_note_taker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ai_note_taker.entity.NoteImage;

public interface NoteImageRepository extends JpaRepository <NoteImage, Long> {

}
