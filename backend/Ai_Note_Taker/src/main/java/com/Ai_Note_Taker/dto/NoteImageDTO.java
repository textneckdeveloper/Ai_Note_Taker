package com.Ai_Note_Taker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class NoteImageDTO {

	private int imageId;
	private int noteId;
	private String imageUrl;
	
}
