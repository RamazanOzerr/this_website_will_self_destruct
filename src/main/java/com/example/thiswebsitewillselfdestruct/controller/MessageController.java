package com.example.thiswebsitewillselfdestruct.controller;

import com.example.thiswebsitewillselfdestruct.model.Message;
import com.example.thiswebsitewillselfdestruct.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/messages")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/random")
    public ResponseEntity<Message> getRandomMessage() {
        return ResponseEntity.ok(messageService.getRandomMessage());
    }

    @PostMapping()
    public ResponseEntity<Message> saveMessage(@RequestBody Message message) {
        return ResponseEntity.ok(messageService.submitMessage(message));
    }
}
