package com.shopit.now.customexception.custom;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class AddressNotFound extends Exception {
    private static final long serialVersionUID = 1L;

    public AddressNotFound(String message) {
        super(message);
    }
}