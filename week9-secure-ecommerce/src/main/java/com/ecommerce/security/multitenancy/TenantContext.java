package com.ecommerce.security.multitenancy;

public class TenantContext {

    private static final ThreadLocal<String> CURRENT_TENANT = new ThreadLocal<>();

    public static void setTenant(String tenant) {
        CURRENT_TENANT.set(tenant);
    }

    public static String getTenant() {
        return CURRENT_TENANT.get();
    }
}
