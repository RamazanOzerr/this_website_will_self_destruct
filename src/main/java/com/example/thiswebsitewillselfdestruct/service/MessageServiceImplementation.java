package com.example.thiswebsitewillselfdestruct.service;

import com.example.thiswebsitewillselfdestruct.dto.SubmittedMessage;
import com.example.thiswebsitewillselfdestruct.model.Message;
import com.example.thiswebsitewillselfdestruct.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImplementation implements MessageService{

    @Autowired
    private MessageRepository messageRepository;

    @Override
    public Message submitMessage(Message message) {
        return messageRepository.save(message);
    }

    @Override
    public Message getRandomMessage() {
        return messageRepository.getRandomMessage();
    }
}
