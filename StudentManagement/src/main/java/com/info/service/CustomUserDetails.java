package com.info.service;

import com.info.entity.Role;
import com.info.entity.Security;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;

public class CustomUserDetails implements UserDetails {

private final Security security;

    public CustomUserDetails(Security security) {
        super();
        this.security = security;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
      return Collections.singleton(new SimpleGrantedAuthority(Role.ADMIN.name()));
    }

    @Override
    public String getPassword() {
        return security.getPassword();
    }

    @Override
    public String getUsername() {
        return security.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
