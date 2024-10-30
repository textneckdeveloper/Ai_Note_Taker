package com.ai_note_taker;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ai_note_taker.entity.LocalUser;
import com.ai_note_taker.entity.Note;
import com.ai_note_taker.entity.NoteImage;
import com.ai_note_taker.entity.SocialUser;
import com.ai_note_taker.entity.User;
import com.ai_note_taker.repository.NoteImageRepository;
import com.ai_note_taker.repository.NoteRepository;
import com.ai_note_taker.repository.UserRepository;

@SpringBootTest
public class UserTest {

    @Autowired
    private UserRepository ur;
    
    @Autowired
    private NoteRepository nr;
    
    @Autowired
    private NoteImageRepository nir;

    @Test // 유저 테이블 테스트
    public void addUser() {

        User user = new User();
        user.setEmail("textneckdeveloper@kakao.com");
        
        boolean isLocal = true;
        
        if (isLocal) {
        	
            LocalUser localUser = LocalUser.builder()
                    .role("ROLE_USER")
                    .password("1234")
                    .createdDate(LocalDateTime.now())
                    .modifiedDate(LocalDateTime.now())
                    .user(user)
                    .build();
            
            user.setLocalUser(localUser);
            
            ur.save(user);
            
        }
        else {
        	
            SocialUser socialUser = SocialUser.builder()
                    .role("ROLE_USER")
                    .provider("kakao")
                    .providerId("323213129")
                    .userName("kakao_623256789")
                    .createdDate(LocalDateTime.now())
                    .modifiedDate(LocalDateTime.now())
                    .user(user)
                    .build();
            
            user.setSocialUser(socialUser);
            
            ur.save(user);
        	
        }
        
    }
    
    @Test // 유저별 메모 추가
    public void addNote() {
    	
    	User user = ur.findById(1L).orElse(null);

    	for (int i=0; i<5; i++) {
    		
        	Note note = Note.builder()
    				.title(i + "번째 게시글")
    				.content(i + " TEST")
                    .createdDate(LocalDateTime.now())
                    .modifiedDate(LocalDateTime.now())
                    .user(user)
                    .build();
        	
        	nr.save(note);
        	
    	}

    }
    
    @Test // 메모 별 이미지 추가
    public void addImage() {
    	
    	Note note = nr.findById(12L).orElse(null);
    	
    	for (int i=0; i<5; i++) {
    		
        	NoteImage noteImage = NoteImage.builder()
        			.imageUrl("/c/test/test" + i + ".jpg")
        			.note(note)
                    .build();
        	
        	nir.save(noteImage);
        	
    	}
    	
    }

}