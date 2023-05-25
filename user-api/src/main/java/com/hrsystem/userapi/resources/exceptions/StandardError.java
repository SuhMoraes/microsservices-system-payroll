package com.hrsystem.userapi.resources.exceptions;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Getter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timeStamp;
    private String error;
    private Integer status;
    private String pathError;
}
