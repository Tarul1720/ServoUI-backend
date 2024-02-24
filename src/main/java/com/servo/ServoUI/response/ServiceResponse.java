package com.servo.ServoUI.response;

public class ServiceResponse {
    String messageType;
    String message;
    Object response;

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getResponse() {
        return response;
    }

    public void setResponse(Object response) {
        this.response = response;
    }

    public ServiceResponse() {

    }

    public ServiceResponse(String messageType, String message, Object response) {
        this.messageType = messageType;
        this.message = message;
        this.response = response;
    }
}
