package com.example.thiswebsitewillselfdestruct.service;

import com.example.thiswebsitewillselfdestruct.dto.SubmittedMessage;
import com.example.thiswebsitewillselfdestruct.model.Message;

public interface MessageService {

    Message submitMessage(SubmittedMessage submittedMessage);
}
