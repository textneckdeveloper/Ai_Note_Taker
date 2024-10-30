package com.ai_note_taker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoteImageDTO {

	private Long imageId;
	private Long noteId;
	private String imageUrl;
	
}
