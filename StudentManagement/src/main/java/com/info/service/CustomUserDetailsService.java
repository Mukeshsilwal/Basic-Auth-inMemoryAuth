package com.info.service;

import com.info.entity.Security;
import org.modelmapper.ModelMapper;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final SecurityRepo securityRepo;

    public CustomUserDetailsService(SecurityRepo securityRepo) {
        super();
        this.securityRepo = securityRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Security security= securityRepo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User with this user name not found" + username));
        return new CustomUserDetails(security);
    }


}


