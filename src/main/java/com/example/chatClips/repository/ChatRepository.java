package com.example.chatClips.repository;

import com.example.chatClips.domain.Chat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChatRepository extends JpaRepository<Chat, Long> {

}
