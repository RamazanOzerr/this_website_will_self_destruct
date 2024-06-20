package com.example.thiswebsitewillselfdestruct.repository;

import com.example.thiswebsitewillselfdestruct.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {

}
