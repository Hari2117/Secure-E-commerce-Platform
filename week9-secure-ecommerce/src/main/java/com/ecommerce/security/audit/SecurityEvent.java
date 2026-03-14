package com.ecommerce.security.audit;

public class SecurityEvent {

    private String type;
    private String username;

    public SecurityEvent(String type, String username) {
        this.type = type;
        this.username = username;
    }
}
