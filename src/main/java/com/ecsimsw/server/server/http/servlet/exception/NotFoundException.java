package com.ecsimsw.server.server.http.servlet.exception;

public class NotFoundException extends HttpException {

    public NotFoundException(String message) {
        super(message);
    }
}
