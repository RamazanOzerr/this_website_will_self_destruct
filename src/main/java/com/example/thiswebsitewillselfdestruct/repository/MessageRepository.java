package com.example.thiswebsitewillselfdestruct.repository;

import com.example.thiswebsitewillselfdestruct.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MessageRepository extends JpaRepository<Message, Integer> {

    @Query(value = "SELECT * FROM MESSAGES ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Message getRandomMessage();

}
