package com.ecommerce.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenantController {

    @GetMapping("/tenants")
    public String tenants() {
        return "Tenant endpoint";
    }
}
