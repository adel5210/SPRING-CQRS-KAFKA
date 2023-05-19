package com.adel.cqrskafka.entities.model;

import com.adel.cqrskafka.entities.enums.LogsStatus;
import lombok.*;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@RedisHash("Logs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class Logs implements Serializable {

    @Builder.Default
    private String id = UUID.randomUUID().toString();

    @Builder.Default
    private Date createAt = new Date();

    private String topic;

    private String data;
    
    private Date publishedAt;

    private Date listenedAt;

    private LogsStatus status;

}
