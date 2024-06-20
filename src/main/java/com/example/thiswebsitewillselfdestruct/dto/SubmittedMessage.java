package com.example.thiswebsitewillselfdestruct.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@EqualsAndHashCode
public class SubmittedMessage {

    private Integer id;

    private String content;

    private LocalDateTime createdAt;

}
