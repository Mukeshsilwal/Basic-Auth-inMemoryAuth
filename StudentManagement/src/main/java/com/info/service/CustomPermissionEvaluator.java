package com.info.service;

import org.springframework.security.access.PermissionEvaluator;
import org.springframework.security.core.Authentication;

import java.io.Serializable;

public class CustomPermissionEvaluator implements PermissionEvaluator {
    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        CustomUserDetails userDetails=(CustomUserDetails) authentication.getPrincipal();
        String userRole=userDetails.getAuthorities().iterator().next().getAuthority();
        return false;
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
       throw new UnsupportedOperationException("Has permission with target id not found");
    }
}
