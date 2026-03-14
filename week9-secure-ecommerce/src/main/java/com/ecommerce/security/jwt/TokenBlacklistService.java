package com.ecommerce.security.jwt;

import java.util.HashSet;
import java.util.Set;

public class TokenBlacklistService {

    private static final Set<String> blacklist = new HashSet<>();

    public void blacklist(String token) {
        blacklist.add(token);
    }

    public boolean isBlacklisted(String token) {
        return blacklist.contains(token);
    }
}
