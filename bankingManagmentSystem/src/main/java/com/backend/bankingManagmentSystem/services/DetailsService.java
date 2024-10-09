package com.backend.bankingManagmentSystem.services;

import com.backend.bankingManagmentSystem.entity.CustomUserDetails;
import com.backend.bankingManagmentSystem.entity.User;
import com.backend.bankingManagmentSystem.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DetailsService implements UserDetailsService {

    @Autowired
    private UserRepo userRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByUserName(username);
        if(user == null) {
            System.out.println("User Not found");
            throw new UsernameNotFoundException("user not found");
        }
        return new CustomUserDetails(user);
    }
}
