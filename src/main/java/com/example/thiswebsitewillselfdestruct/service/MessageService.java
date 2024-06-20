package com.example.thiswebsitewillselfdestruct.service;

import com.example.thiswebsitewillselfdestruct.dto.SubmittedMessage;
import com.example.thiswebsitewillselfdestruct.model.Message;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public interface MessageService {

    Message submitMessage(Message message);

    Message getRandomMessage();
}
