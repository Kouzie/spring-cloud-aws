package com.spring.aws.demo.sqs.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class MqttMessageDto {
    private String message;
}
