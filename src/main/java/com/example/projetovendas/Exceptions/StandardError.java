package com.example.projetovendas.Exceptions;

import lombok.Data;

import java.io.Serializable;

@Data
public class StandardError implements Serializable{


    private static final long serialVersionUID = -237943657333976801L;

    private Integer status;
    private String message;
    private Long timeStamp;

    public StandardError(Integer status, String message, Long timeStamp) {
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }
}
