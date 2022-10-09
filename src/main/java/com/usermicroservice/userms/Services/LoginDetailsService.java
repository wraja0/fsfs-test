package com.usermicroservice.userms.Services;

import com.usermicroservice.userms.Models.Login;
import com.usermicroservice.userms.Controllers.NewLoginDetails;
import com.usermicroservice.userms.Repositories.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
 
public class LoginDetailsService implements UserDetailsService {
 
    @Autowired
    private LoginRepository userRepository;
     
    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Login user = userRepository.getLoginByLoginname(username);
         
        if (user == null) {
            throw new UsernameNotFoundException("Could not find user");
        }
         
        return new NewLoginDetails(user);
    }
 
}