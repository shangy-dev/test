package com.shangy.sy.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ComponentScan
public class ResponseUtil {
    private int status;
    private String message;
    private Object response;
}
