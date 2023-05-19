package com.adel.cqrskafka.entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum LogsStatus {

    PROCESS,
    COMPLETE,
    ERROR
    ;

}
